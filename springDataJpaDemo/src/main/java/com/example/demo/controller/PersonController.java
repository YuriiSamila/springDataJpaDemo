package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import com.example.demo.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Objects.requireNonNull;

@RestController
@RequestMapping("/persons")

public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = requireNonNull(personRepository);
    }

//    @GetMapping()
//    public List<Person> getAll() {
//        return personRepository.findAll();
//    }

//    @GetMapping
//    public List<Person> findAllByName(@RequestParam String name) {
//        return personRepository.findAllByName(name);
//    }

    @GetMapping
    public List<Person> findAllByAge(@RequestParam int age) {
        return personRepository.findAllByAge(age);
    }

}
