package br.com.springboot.elearningspringboot.repository;

import br.com.springboot.elearningspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
