package com.hognod.backend.sample.dto;

import com.hognod.backend.sample.vo.EmployeeVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Schema(description = "Employee 개별 상세 결과")
public class EmployeeDetailResDto {
    private EmployeeVo employeeVo;
}