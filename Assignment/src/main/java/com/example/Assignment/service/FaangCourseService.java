package com.example.Assignment.service;

import com.example.Assignment.entity.FaangCourse;
import com.example.Assignment.repo.FaangcourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FaangCourseService {
    @Autowired
    FaangcourseRepo repo;
    public void store(FaangCourse f){
        repo.save(f);
    }
    public void storeAll(Iterable<FaangCourse> f){
        repo.saveAll(f);
    }
    public Optional<FaangCourse> get(Integer f){
        return repo.findById(f);
    }
    public Iterable<FaangCourse> getall(){
        return repo.findAll();
    }
}
