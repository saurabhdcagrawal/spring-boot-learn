package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//http://localhost:8080/courses
@RestController//for rest
public class ClassController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1,"LearnAWS","in 28 mins"),
            new Course(2,"LearnKafka","in 28 mins"),
            new Course(3,"LearnECR","in 28 mins"),
                new Course(4,"LearnSpark","in 28 mins")

                );
    }
}
