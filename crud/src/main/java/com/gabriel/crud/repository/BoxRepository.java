package com.gabriel.crud.repository;

import com.gabriel.crud.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box, Long>  {
    
}
