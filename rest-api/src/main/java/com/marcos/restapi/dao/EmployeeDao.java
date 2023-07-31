package com.marcos.restapi.dao;

import com.marcos.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
