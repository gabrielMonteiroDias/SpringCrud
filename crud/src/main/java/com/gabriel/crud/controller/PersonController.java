package com.gabriel.crud.controller;

import com.gabriel.crud.model.Person;
import com.gabriel.crud.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public Person save(@RequestBody Person person){
        return service.save(person);
    }

    @GetMapping
    public List<Person> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }

    @PutMapping
    public Person update(@RequestBody Person person) throws Exception{
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        service.delete(id);
    }


}
