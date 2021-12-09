package br.com.springboot.elearningspringboot.controllers;

import br.com.springboot.elearningspringboot.model.Course;
import br.com.springboot.elearningspringboot.repository.CourseRepository;
import br.com.springboot.elearningspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    public CourseRepository courseRepository;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/list")
    public List<Course> listCourses() {
        return this.courseRepository.findAll();
    }

    @PostMapping("/")
    public Object createCourse(@RequestBody Course course) {
        return this.courseRepository.save(course);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable("id")Long id) {
        this.courseRepository.deleteById(id);
        return "Successfully deleted!";
    }
}
