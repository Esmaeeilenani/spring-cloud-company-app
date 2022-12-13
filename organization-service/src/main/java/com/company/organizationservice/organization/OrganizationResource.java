package com.company.organizationservice.organization;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationResource {
    private final OrganizationService organizationService;


    @PostMapping
    public ResponseEntity<OrganizationDto> save(@RequestBody OrganizationDto organizationDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(organizationService.save(organizationDto));
    }

    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrgByCode(@PathVariable String code) {
        return ResponseEntity.ok(organizationService.getByOrgCode(code));
    }

}
