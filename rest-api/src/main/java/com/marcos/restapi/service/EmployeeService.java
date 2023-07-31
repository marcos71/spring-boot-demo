package com.marcos.restapi.service;

import com.marcos.restapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
