package br.com.springboot.elearningspringboot.controllers;

import br.com.springboot.elearningspringboot.model.Contact;
import br.com.springboot.elearningspringboot.model.User;
import br.com.springboot.elearningspringboot.repository.ContactRepository;
import br.com.springboot.elearningspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    public ContactRepository contactRepository;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/list")
    public List<Contact> listContacts() {
        return this.contactRepository.findAll();
    }

    @PostMapping("/")
    public Object connectContactToUser(@RequestBody Contact contact) {
        Optional<User> user = userRepository.findById(contact.getUser_id());
        if (user.isPresent()) {
            contact.setUser(user.get());
            return this.contactRepository.save(contact);

        } else {
            return "Unable to enter information, there is no user with this id.";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable("id")Long id) {
        this.contactRepository.deleteById(id);
        return "Successfully deleted!";
    }
}
