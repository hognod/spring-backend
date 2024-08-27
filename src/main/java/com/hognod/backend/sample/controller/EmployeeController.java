package com.hognod.backend.sample.controller;

import com.hognod.backend.common.CommonResult;
import com.hognod.backend.exception.ApiBindException;
import com.hognod.backend.exception.ResourceNotFoundException;
import com.hognod.backend.sample.dto.EmployeeCreateReqDto;
import com.hognod.backend.sample.dto.EmployeeSearchReqDto;
import com.hognod.backend.sample.dto.EmployeeUpdateReqDto;
import com.hognod.backend.sample.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sample/employees")
@Tag(name = "Sample", description = "Sample API")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    @Operation(summary = "Employee 리스트")
    public CommonResult list(EmployeeSearchReqDto employeeSearchReqDto) {
        return employeeService.list(employeeSearchReqDto);
    }

    @GetMapping("{id}")
    @Operation(summary = "Employee 개별")
    public CommonResult detail(long id) {
        return employeeService.detail(id);
    }

    @PostMapping("create")
    @Operation(summary = "Employee 생성")
    public CommonResult create(@RequestBody @Valid EmployeeCreateReqDto employeeCreateReqDto,
                               BindingResult bindingResult) throws ApiBindException {
        if (bindingResult.hasErrors()) {
            throw new ApiBindException(bindingResult);
        }
        employeeService.create(employeeCreateReqDto);
        return CommonResult.ok();
    }

    @PostMapping("update")
    @Operation(summary = "Employee 수정")
    public CommonResult update(@RequestBody @Valid EmployeeUpdateReqDto employeeUpdateReqDto,
                               BindingResult bindingResult) throws ApiBindException {
        if (bindingResult.hasErrors()) {
            throw new ApiBindException(bindingResult);
        }

        employeeService.update(employeeUpdateReqDto);
        return CommonResult.ok();
    }

    @PostMapping("delete")
    @Operation(summary = "Employee 삭제")
    public CommonResult delete(@RequestParam("id") long id) {
        if (employeeService.delete(id, 1) == 0) {
            throw new ResourceNotFoundException();
        }
        return CommonResult.ok();
    }
}
