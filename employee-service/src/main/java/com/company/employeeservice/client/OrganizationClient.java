package com.company.employeeservice.client;

import com.company.employeeservice.DTO.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ORGANIZATION-SERVICE")
public interface OrganizationClient {

    @GetMapping("api/organizations/{code}")
    OrganizationDto GetOrgByCode(@PathVariable String code);

}
