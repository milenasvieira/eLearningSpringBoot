package br.com.springboot.elearningspringboot.controllers;

import br.com.springboot.elearningspringboot.model.User;
import br.com.springboot.elearningspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    public List<User> listUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping("/")
    public User createUser(@PathVariable User user) {
        return this.userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id")Long id) {
        this.userRepository.deleteById(id);
        return "Successfully deleted!";
    }
}
