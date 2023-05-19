package com.marcos.cruddemo.dao;

import com.marcos.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Long id);
}
