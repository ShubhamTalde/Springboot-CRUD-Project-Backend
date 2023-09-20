package com.emsproject.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;// By importing this we will get crud methods to perform operation

import com.emsproject.ems.entity.Employee;

//JPA repository is generic interface ,have to pass
//2 para type of entity and datatype
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
