package com.gabriel.crud.services;

import com.gabriel.crud.model.Box;
import com.gabriel.crud.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.Query;

@Service
public class BoxServiceV2 {

    @Autowired
    private BoxRepository repository;

    //private EntityManager em;//V2

    public Box save(Box box) {
        box.setDelivery(new Date());// V2
        return repository.save(box);
    }

    public Box findById(long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Not Found!BoxService"));
    }

    public List<Box> findAll() {
        return repository.findAll();
    }

    public Box update(Box box) throws Exception {
        Box b = repository.findById(box.getId()).orElseThrow(() -> new Exception("Not Found!BoxService"));
        b.setName(box.getName());
        b.setSize(box.getSize());
        b.setColor(box.getColor());
        b.setType(box.getType());
        b.setQuantity(box.getQuantity());
        b.setBrand(box.getBrand());// V2
        return repository.save(b);
    }

    public void delete(long id) throws Exception {
        Box b = repository.findById(id).orElseThrow(() -> new Exception("Not Found!BoxService"));
        repository.delete(b);
    }

    // HQL Fast
/*
    public List<Box> listByName(String name){

    String hql = "from Box where name like :name order by name";
    Query query = em.createQuery(hql);
    query.getParameter(name: "name", value:name + "%");
    List <Box> box = query.getResultList();
    return box;
    
}
*/
}
