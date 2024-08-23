package com.hognod.backend.sample.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hognod.backend.sample.vo.EmployeeVo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.sql.Date;

@Getter
@Setter
@Schema(description = "Employee 생성 요청")
public class EmployeeCreateReqDto {
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
    private Date hireDate;
    @JsonIgnore
    @Schema(description = "생성자 ID", defaultValue = "1")
    private long createdBy;
    @JsonIgnore
    @Schema(description = "수정자 ID", defaultValue = "1")
    private long updatedBy;

    public EmployeeVo toEmployeeVo() {
        return EmployeeVo.builder()
                .firstName(this.firstName)
                .lastName(this.lastName).
                build();
    }
}
