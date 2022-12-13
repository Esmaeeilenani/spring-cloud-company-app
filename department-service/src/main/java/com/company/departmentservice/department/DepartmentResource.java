package com.company.departmentservice.department;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentResource {
    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(
           @RequestBody DepartmentDTO departmentDTO) {
    return new ResponseEntity<>(departmentService.save(departmentDTO), HttpStatus.CREATED);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable Long id) {
//    return ResponseEntity.ok(departmentService.getById(id));
//    }

    @GetMapping("/{code}")
    public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable String code) {
        return ResponseEntity.ok(departmentService.getDepartmentByCode(code));
    }


}
