package com.hognod.backend.sample.service;

import com.hognod.backend.common.CommonResult;
import com.hognod.backend.common.vo.PageVo;
import com.hognod.backend.exception.ResourceNotFoundException;
import com.hognod.backend.sample.dto.*;
import com.hognod.backend.sample.mapper.EmployeeMapper;
import com.hognod.backend.sample.vo.EmployeeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;

    public CommonResult list(EmployeeSearchReqDto employeeSearchReqDto) {
        List<EmployeeVo> employeeVos = employeeMapper.selectEmployees(employeeSearchReqDto);
        int total = employeeMapper.countEmployee(employeeSearchReqDto);
        PageVo pageVoInfo = new PageVo(employeeSearchReqDto, total);
        EmployeeListResDto dto = EmployeeListResDto.builder()
                .pageVo(pageVoInfo)
                .employeeVo(employeeVos).build();

        return CommonResult.data(dto);
    }

    public CommonResult detail(long id) {
        EmployeeVo employeeVo = employeeMapper.selectEmployee(id);

        if (employeeVo == null) {
            throw new ResourceNotFoundException();
        }

        EmployeeDetailResDto dto = EmployeeDetailResDto.builder()
                .employeeVo(employeeVo).build();

        return CommonResult.data(dto);
    }

    public void create(EmployeeCreateReqDto employeeCreateReqDto) {
        employeeMapper.insertEmployee(employeeCreateReqDto);
    }

    public void update(EmployeeUpdateReqDto employeeUpdateReqDto) {
        if (employeeMapper.updateEmployee(employeeUpdateReqDto) == 0) {
            throw new ResourceNotFoundException();
        }
    }

    public void delete(long id, long deletedBy) {
        employeeMapper.deleteEmployee(id, deletedBy);
    }
}