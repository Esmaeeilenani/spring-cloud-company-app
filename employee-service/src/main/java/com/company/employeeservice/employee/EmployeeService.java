package com.company.employeeservice.employee;

import com.company.employeeservice.DTO.ApiResponse;
import com.company.employeeservice.DTO.DepartmentDTO;
import com.company.employeeservice.client.DepartmentClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

//    private final RestTemplate restTemplate;
//
//    private final WebClient webClient;

    private final DepartmentClient departmentClient;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee emp = EmployeeMapper.MAPPER.toEntity(employeeDTO);

        return EmployeeMapper.MAPPER.toDto(employeeRepository.save(emp));

    }


    public ApiResponse getEmployeeById(Long id) {
        EmployeeDTO empDTO = employeeRepository.findById(id)
                .map(EmployeeMapper.MAPPER::toDto)
                .orElseThrow(RuntimeException::new);

//        ResponseEntity<DepartmentDTO> result = restTemplate.getForEntity("http://localhost:8080/api/departments/" + empDTO.getDepartmentCode(), DepartmentDTO.class);
//
//        DepartmentDTO deptDTO = result.getBody();

//        DepartmentDTO deptDTO = webClient.get()
//                .uri("http://localhost:8080/api/departments/" + empDTO.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDTO.class)
//                .block();

        DepartmentDTO deptDTO = departmentClient.getDepartmentByCode(empDTO.getDepartmentCode());

        return new ApiResponse(empDTO, deptDTO);
    }


}
