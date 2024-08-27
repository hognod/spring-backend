package com.hognod.backend.sample.dto;

import com.hognod.backend.common.dto.PageRequestDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Employee 리스트 요청")
public class EmployeeSearchReqDto extends PageRequestDto {
    @Schema(description = "filter 조건 firstName", defaultValue = " ")
    private String firstName;
    @Schema(description = "filter 조건 lastName", defaultValue = " ")
    private String lastName;
    @Schema(description = "filter 조건 email", defaultValue = " ")
    private String email;
    @Schema(description = "filter 조건 phone 010-XXXX-XXXX", defaultValue = " ")
    private String phone;
    @Schema(description = "filter 조건 jobTitle", defaultValue = " ")
    private String jobTitle;
    @Schema(description = "filter 조건 hireDate YYYY-MM-DD", defaultValue = " ")
    private String hireDate;
}