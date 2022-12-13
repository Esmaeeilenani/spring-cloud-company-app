package com.company.employeeservice.DTO;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DepartmentDTO implements Serializable {
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}