package com.AppDevFinalProject.PhilliesFlowers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.AppDevFinalProject.PhilliesFlowers.entities.Order;
import com.AppDevFinalProject.PhilliesFlowers.repositories.OrderRepo;



@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
public class OrderRepoTests {

	@Autowired
	private OrderRepo orderRepo;
	
	@Test
	public void getJPA(){
		List<Order> orders = orderRepo.findAll();
		assert(1 ==  orders.get(0).getId());
	}
	
	@Test
	public void allJPA(){
		List<Order> orders = orderRepo.findAll();
		assertEquals(3, orders.size());
	}
	
	@Test
	public void findByName(){
		List<Order> orders = orderRepo.findByname("0871234567");
		assertEquals(1,orders.size());
	}
	
	@Test
	public void addJPA(){
		orderRepo.save(new Order());
		List<Order> orders = orderRepo.findAll();
		assertEquals(4, orders.size());
	}
	
	@Test
	public void deleteJPA(){
		orderRepo.delete(3);
		List<Order> orders = orderRepo.findAll();
		assertEquals(2, orders.size());
	}
}
