package br.com.springboot.elearningspringboot.repository;

import br.com.springboot.elearningspringboot.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
