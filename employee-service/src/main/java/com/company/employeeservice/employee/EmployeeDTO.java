package com.company.employeeservice.employee;

import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link Employee} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDTO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;
    private String organizationCode;
}