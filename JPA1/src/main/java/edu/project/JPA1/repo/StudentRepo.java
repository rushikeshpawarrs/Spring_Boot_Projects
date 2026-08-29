package edu.project.JPA1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.project.JPA1.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	
}
