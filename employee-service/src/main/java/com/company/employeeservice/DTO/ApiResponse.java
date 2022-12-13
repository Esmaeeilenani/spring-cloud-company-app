package com.company.employeeservice.DTO;

import com.company.employeeservice.employee.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private EmployeeDTO employeeDTO;
    private DepartmentDTO departmentDTO;
}
