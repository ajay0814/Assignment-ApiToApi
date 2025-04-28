package com.example.Assignment.repo;

import com.example.Assignment.entity.FaangCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaangcourseRepo extends CrudRepository<FaangCourse , Integer> {

}
