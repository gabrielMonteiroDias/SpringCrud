package com.gabriel.crud.controller;

import com.gabriel.crud.model.Box;
import com.gabriel.crud.services.BoxServiceV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/box/v2")
public class BoxControllerV2 {
    
    @Autowired
    private BoxServiceV2 service;

    @PostMapping
    public Box save(@RequestBody Box box){
        return service.save(box);
    }

    @GetMapping
    public List<Box> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Box findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }

    @PutMapping
    public Box update(@RequestBody Box box) throws Exception{
        return service.update(box);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        service.delete(id);
    }

    /*
    @GetMapping("/query/{name}")
    public List<Box> listByName(@PathVariable("name") String name){
        return service.listByName(name);
    }
    */
}
