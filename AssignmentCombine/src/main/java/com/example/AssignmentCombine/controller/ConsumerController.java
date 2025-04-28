package com.example.AssignmentCombine.controller;
import com.example.AssignmentCombine.entity.FaangCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;


@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/fetchCourses")
    public List<FaangCourse> getCoursesFromOtherAPI() {
        //********first Api url***********
        String url = "http://localhost:2002/getAll";
        //Make a GET call to the URL ➔
        // Expect an array of FaangCourse in the response ➔
        // Convert the JSON into Java objects (FaangCourse[]) ➔
        // Save them into courses.
        FaangCourse[] courses = restTemplate.getForObject(url, FaangCourse[].class);
        return Arrays.asList(courses);
        //The other API (localhost:2002) is running before you test.

    }

    @PostMapping("/sendAllCourses")
    public String sendAllCoursesToOtherAPI(@RequestBody List<FaangCourse> courses) {
        String url = "http://localhost:2002/insertAll"; // Assuming first project has /saveAll endpoint
        restTemplate.postForObject(url, courses, String.class);
        return "All courses sent successfully!";
    }
}
