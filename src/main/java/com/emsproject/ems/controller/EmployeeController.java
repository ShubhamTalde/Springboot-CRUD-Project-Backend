package com.emsproject.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsproject.ems.dto.EmployeeDto;
import com.emsproject.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//Build Add Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@ RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	//Build Get employee Rest api
	
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
		EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.ok(employeeDto);
	}
	//Build get all employee rest api
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	//Build update employee Rest api
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> updatedEmployee(@PathVariable("id")Long employeeId,@RequestBody EmployeeDto updatedEmployee){
		EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
		
		return ResponseEntity.ok(employeeDto);
	}
	//Build delete employee rest api
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id") Long employeeId){
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.ok("Employee deleted successfully...");
		
	}
	

}
