package com.company.organizationservice.organization;

import com.company.organizationservice.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper extends EntityMapper<Organization, OrganizationDto> {
    OrganizationMapper MAP = Mappers.getMapper(OrganizationMapper.class);

}
