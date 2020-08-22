package com.app.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.school.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
