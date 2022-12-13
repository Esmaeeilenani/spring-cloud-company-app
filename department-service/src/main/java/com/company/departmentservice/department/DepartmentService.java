package com.company.departmentservice.department;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
@Transactional
public class DepartmentService {
    private DepartmentRepository departmentRepository;


    public DepartmentDTO save(DepartmentDTO departmentDTO) {

        Department department = DepartmentMapper.MAPPER.toEntity(departmentDTO);

        return DepartmentMapper.MAPPER.toDto(departmentRepository
                .save(department));

    }


    public  DepartmentDTO getDepartmentByCode(String code){
        return departmentRepository.findByDepartmentCode(code)
                .map(DepartmentMapper.MAPPER::toDto)
                .orElseThrow(NullPointerException::new);
    }

}
