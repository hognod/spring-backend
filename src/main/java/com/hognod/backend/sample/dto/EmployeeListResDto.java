package com.hognod.backend.sample.dto;

import com.hognod.backend.common.vo.PageVo;
import com.hognod.backend.sample.vo.EmployeeVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@Schema(description = "Employee 리스트")
public class EmployeeListResDto {
    private PageVo pageVo;
    private List<EmployeeVo> employeeVo;
}