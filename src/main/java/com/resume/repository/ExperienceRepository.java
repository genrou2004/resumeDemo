package com.resume.repository;

import com.resume.model.Experience;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/29/17.
 */
public interface ExperienceRepository extends CrudRepository<Experience,Integer> {
    List<Experience> findByEmail(String email);
}
