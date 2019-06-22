package io.msn.repository;

import org.springframework.data.repository.CrudRepository;

import io.msn.model.Student;

public interface CollegeCrudRepository extends CrudRepository<Student, Integer> {

}
