package com.elifirem.repository;

import com.elifirem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repositoryler interface olmalıdır ve jpa ya da crude extend ederler
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
