package com.marcos.restapi.repository;

import com.marcos.restapi.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    //spring-data-rest creates default CRUD endpoints for the entity
}
