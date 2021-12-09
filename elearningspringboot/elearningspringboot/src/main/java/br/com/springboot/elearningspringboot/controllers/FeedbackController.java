package br.com.springboot.elearningspringboot.controllers;

import br.com.springboot.elearningspringboot.model.Feedback;
import br.com.springboot.elearningspringboot.model.User;
import br.com.springboot.elearningspringboot.repository.FeedbackRepository;
import br.com.springboot.elearningspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    public FeedbackRepository feedbackRepository;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/list")
    public List<Feedback> listFeedbacks() {
        return this.feedbackRepository.findAll();
    }

    @PostMapping("/")
    public Object addUserFeedback(@RequestBody Feedback feedback) {
        Optional<User> user = userRepository.findById(feedback.getUser_id());
        if (user.isPresent()) {
            feedback.setUser(user.get());
            return this.feedbackRepository.save(feedback);
        } else {
            return "Unable to enter information, there is no user with this id.";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteFeedback(@PathVariable("id")Long id) {
        this.feedbackRepository.deleteById(id);
        return "Successfully deleted!";
    }
}
