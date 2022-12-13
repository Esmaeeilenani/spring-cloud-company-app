package com.company.employeeservice.client;

import com.company.employeeservice.DTO.DepartmentDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//this is required to make this interface as cloud client
//1- add base URL
//2- add the name of the service
/*
no eureka server implementation
@FeignClient(url = "http://localhost:8080",name = "Department-Service")
* */

@FeignClient(name = "DEPARTMENT-SERVICE")
//with eureka server only the application name that is registered in eureka server is needed
public interface DepartmentClient {


    //@CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "defaultDepartmentDto")
    @Retry(name = "${spring.application.name}", fallbackMethod = "defaultDepartmentDto")
    @GetMapping("api/departments/{code}")
        //without response entity
    DepartmentDTO getDepartmentByCode(@PathVariable String code);

    default DepartmentDTO defaultDepartmentDto(String code,Exception exception) {
        return new DepartmentDTO();
    }
}
