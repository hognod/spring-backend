package com.hognod.backend.sample.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@Schema(description = "Employee")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmployeeVo {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String jobTitle;
    private Date hireDate;
    private long createdBy;
    private LocalDateTime createdAt;
    private long updatedBy;
    private LocalDateTime updatedAt;

    @Builder
    public EmployeeVo(long id, String firstName, String lastName, String email, String phone, String jobTitle, Date hireDate, long createdBy, LocalDateTime createdAt, long updatedBy, LocalDateTime updatedAt) {
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