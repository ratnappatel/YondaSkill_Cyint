package com.yskill.repository;

import org.springframework.data.repository.CrudRepository;

import com.yskill.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
