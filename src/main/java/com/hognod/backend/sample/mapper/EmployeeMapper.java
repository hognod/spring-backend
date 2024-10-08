package com.hognod.backend.sample.mapper;

import com.hognod.backend.sample.dto.EmployeeCreateReqDto;
import com.hognod.backend.sample.dto.EmployeeSearchReqDto;
import com.hognod.backend.sample.dto.EmployeeUpdateReqDto;
import com.hognod.backend.sample.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<EmployeeVo> selectEmployees(EmployeeSearchReqDto employeeSearchReqDto);
    EmployeeVo selectEmployee(@Param("id") long id);
    void insertEmployee(EmployeeCreateReqDto employeeCreateReqDto);
    int updateEmployee(EmployeeUpdateReqDto employeeUpdateReqDto);
    int deleteEmployee(@Param("id") long id, @Param("deletedBy") long deletedBy);
    int countEmployee(EmployeeSearchReqDto employeeSearchReqDto);
}