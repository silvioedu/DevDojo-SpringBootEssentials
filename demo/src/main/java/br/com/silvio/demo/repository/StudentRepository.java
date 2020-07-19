package br.com.silvio.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.silvio.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String  name);
}