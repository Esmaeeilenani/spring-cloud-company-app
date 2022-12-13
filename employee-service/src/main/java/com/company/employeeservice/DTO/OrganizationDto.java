package com.company.employeeservice.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrganizationDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private String code;
    private LocalDateTime createdDate;

    public OrganizationDto() {
    }

    public OrganizationDto(Long id, String name, String description, String code, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public OrganizationDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrganizationDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrganizationDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCode() {
        return code;
    }

    public OrganizationDto setCode(String code) {
        this.code = code;
        return this;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public OrganizationDto setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "code = " + code + ", " +
                "createdDate = " + createdDate + ")";
    }
}