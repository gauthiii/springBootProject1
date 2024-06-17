package com.in28minutes.test1.testing_app1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    // Course: id, name, Author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){

        return Arrays.asList(
             new Course(1,"AWS","Gautham"),
             new Course(2,"Azure","Gautham"),
             new Course(3,"Firebase","Gautham"),
             new Course(4,"OpenAI","Gautham"),
             new Course(5,"Flutter","Gautham")
        );
        
    }

}
