package com.gabriel.crud.services;

import com.gabriel.crud.model.Person;
import com.gabriel.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person save(Person person){
        return repository.save(person);
    }

    public Person findById(long id) throws Exception{
        return repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
    }

    public List<Person> findAll(){
        return repository.findAll();
    }

    public Person update(Person person) throws Exception{
        Person p = repository.findById(person.getId()).orElseThrow( () -> new Exception("Not Found"));
        p.setFirstName(person.getFirstName());
        p.setLastName(person.getLastName());
        p.setProfession(person.getProfession());
        return repository.save(p);
    }

    public void delete(long id) throws  Exception{
        Person p = repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
        repository.delete(p);
    }




}
