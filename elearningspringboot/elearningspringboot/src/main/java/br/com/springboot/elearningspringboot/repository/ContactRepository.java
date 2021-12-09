package br.com.springboot.elearningspringboot.repository;

import br.com.springboot.elearningspringboot.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
