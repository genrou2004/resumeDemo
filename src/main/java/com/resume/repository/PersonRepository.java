package com.resume.repository;

import com.resume.model.Person;
import com.resume.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/29/17.
 */
public interface PersonRepository extends CrudRepository<Person,Integer> {
    List<Person> findByEmail(String email);
    List<Person> findByFirstName(String fName);


      /*  List<Person> findlastName(String lastname);

// Enables the distinct flag for the query
    List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
    List<Person> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);

    // Enabling ignoring case for an individual property
    List<Person> findByLastnameIgnoreCase(String lastname);
    // Enabling ignoring case for all suitable properties
    List<Person> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);

    // Enabling static ORDER BY for a query
    List<Person> findByLastnameOrderByFirstnameAsc(String lastname);
    List<Person> findByLastnameOrderByFirstnameDesc(String lastname);*/
}
