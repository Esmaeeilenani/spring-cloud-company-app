package com.company.organizationservice.organization;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;


    public OrganizationDto save(OrganizationDto organizationDto) {

        Organization organization = OrganizationMapper.MAP.toEntity(organizationDto);

        organizationRepository.save(organization);

        return OrganizationMapper.MAP.toDto(organization);
    }

    public OrganizationDto getByOrgCode(String code) {
        return OrganizationMapper.MAP.toDto(organizationRepository.findByCode(code).orElseThrow(RuntimeException::new));
    }
}
