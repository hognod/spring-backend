package com.hognod.backend.sample.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "Employee")
public class EmployeeVo {
    @Schema(description = "ID")
    private long id;
    @Schema(description = "이름")
    private String firstName;
    @Schema(description = "성")
    private String lastName;
    @Schema(description = "E-Mail")
    private String email;
    @Schema(description = "010-XXXX-XXXX")
    private String phone;
    @Schema(description = "직책")
    private String jobTitle;
    @Schema(description = "YYYY-MM-DD")
    private String hireDate;
    @Schema(description = "생성자 ID")
    private long createdBy;
    @Schema(description = "생성일")
    private LocalDateTime createdAt;
    @Schema(description = "수정자 ID")
    private long updatedBy;
    @Schema(description = "생성일")
    private LocalDateTime updatedAt;

    @Builder
    public EmployeeVo(long id, String firstName, String lastName, String email, String phone, String jobTitle, String hireDate, long createdBy, LocalDateTime createdAt, long updatedBy, LocalDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }
}