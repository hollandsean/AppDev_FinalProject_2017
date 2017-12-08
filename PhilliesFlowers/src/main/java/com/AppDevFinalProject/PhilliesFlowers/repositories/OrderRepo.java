package com.AppDevFinalProject.PhilliesFlowers.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.AppDevFinalProject.PhilliesFlowers.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

	public List<Order> findByname(String name); // SELECT * FROM orders WHERE name LIKE '%xxxxx%'
	
}
