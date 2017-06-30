package com.resume.repository;

import com.resume.model.Skills;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/29/17.
 */
public interface SkillsRepository extends CrudRepository<Skills,Integer>{
    List<Skills> findByEmail(String email);
}
