package com.gabriel.crud.services;

import com.gabriel.crud.model.Box;
import com.gabriel.crud.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxService {

    @Autowired
    private BoxRepository repository;

    public Box save(Box box){
        return repository.save(box);
    }

    public Box findById(long id) throws Exception{
        return repository.findById(id).orElseThrow( () -> new Exception("Not Found!BoxService") );
    }

    public List<Box> findAll(){
        return repository.findAll();
    }

    public Box update(Box box) throws Exception{
        Box b = repository.findById(box.getId()).orElseThrow( () -> new Exception("Not Found!BoxService"));
        b.setName(box.getName());
        b.setSize(box.getSize());
        b.setColor(box.getColor());
        b.setType(box.getType());
        b.setQuantity(box.getQuantity());
        return repository.save(b);
    }

    public void delete(long id) throws  Exception{
        Box b = repository.findById(id).orElseThrow( () -> new Exception("Not Found!BoxService") );
        repository.delete(b);
    }




}
