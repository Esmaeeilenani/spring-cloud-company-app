package com.company.departmentservice.department;

import com.company.departmentservice.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper extends EntityMapper<Department, DepartmentDTO> {
    DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);
}
