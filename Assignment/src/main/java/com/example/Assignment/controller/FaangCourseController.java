package com.example.Assignment.controller;

import com.example.Assignment.entity.FaangCourse;
import com.example.Assignment.service.FaangCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FaangCourseController {
    @Autowired
    FaangCourseService service;
    @PostMapping(value="/insert")
    public void store(@RequestBody FaangCourse f){
        service.store(f);
    }
    @PostMapping(value="/insertAll")
    public void storeall(@RequestBody Iterable<FaangCourse> f){
        service.storeAll(f);
    }
    @GetMapping(value="/{no}")
    public Optional<FaangCourse> get(@PathVariable Integer no){
        return service.get(no);
    }
    @GetMapping(value="/getAll")
    public Iterable<FaangCourse> getall(){
        return service.getall();
    }
    //http://localhost:2002/getAll
}
