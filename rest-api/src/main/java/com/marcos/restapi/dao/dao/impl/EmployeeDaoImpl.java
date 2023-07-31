package com.marcos.restapi.dao.dao.impl;

import com.marcos.restapi.dao.EmployeeDao;
import com.marcos.restapi.entity.Employee;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RequiredArgsConstructor
public class EmployeeDaoImpl implements EmployeeDao {

    // annotating with "RequiredArgsConstructor" and defining the variable as "final" it autowires the bean automatically
    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> getAllEmployeeQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = getAllEmployeeQuery.getResultList();

        return employees;
    }
}
