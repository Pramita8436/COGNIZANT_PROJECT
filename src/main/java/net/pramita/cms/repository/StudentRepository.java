package net.pramita.cms.repository;

import net.pramita.cms.entity.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
Optional<Student> findByName(String name);

}
