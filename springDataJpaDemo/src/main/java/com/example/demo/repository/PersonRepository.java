package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByName(String name);

    @Query("select p from Person p left join fetch p.notes where p.age = :age")
    List<Person> findAllByAge(@Param("age") int age);


}
