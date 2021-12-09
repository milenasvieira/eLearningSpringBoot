package br.com.springboot.elearningspringboot.repository;

import br.com.springboot.elearningspringboot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
