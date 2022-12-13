package com.company.employeeservice.employee;

import com.company.employeeservice.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends EntityMapper<Employee,EmployeeDTO> {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
}
