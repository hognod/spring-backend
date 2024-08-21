package com.hognod.backend.sample.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Schema(description = "Employee 업데이트 요청")
public class EmployeeUpdateReqDto {
    @NotNull
    @Schema(description = "ID")
    private long id;
    @NotBlank
    @Length(min = 1, max = 10, message = "최소 길이 1, 최대 길이 10")
    @Schema(description = "이름")
    private String firstName;
    @NotBlank
    @Length(min = 1, max = 10, message = "최소 길이 1, 최대 길이 10")
    @Schema(description = "성")
    private String lastName;
    @NotBlank
    @Length(min = 1, max = 20, message = "최소 길이 1, 최대 길이 20")
    @Schema(description = "E-Mail")
    private String email;
    @NotBlank
    @Length(min = 1, max = 20, message = "최소 길이 1, 최대 길이 20")
    @Schema(description = "010-XXXX-XXXX")
    private String phone;
    @NotBlank
    @Length(min = 1, max = 10, message = "최소 길이 1, 최대 길이 10")
    @Schema(description = "직책")
    private String jobTitle;
    @NotBlank
    @Length(min = 10, max = 10)
    @Schema(description = "YYYY-MM-DD")
    private String hireDate;
    @Schema(description = "수정자 ID", defaultValue = "1")
    private long updatedBy;
}