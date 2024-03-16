package com.afautos.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afautos.main.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
