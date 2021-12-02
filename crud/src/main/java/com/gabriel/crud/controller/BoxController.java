package com.gabriel.crud.controller;

import com.gabriel.crud.model.Box;
import com.gabriel.crud.services.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/box")
public class BoxController {
    
    @Autowired
    private BoxService service;

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

}
