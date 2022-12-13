package com.company.departmentservice.department;

import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link Department} entity
 */
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