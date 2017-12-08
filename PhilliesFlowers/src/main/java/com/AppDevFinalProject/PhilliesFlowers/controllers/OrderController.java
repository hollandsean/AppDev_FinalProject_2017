package com.AppDevFinalProject.PhilliesFlowers.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AppDevFinalProject.PhilliesFlowers.entities.Order;
import com.AppDevFinalProject.PhilliesFlowers.repositories.OrderRepo;

@Controller
@RequestMapping("/orders/")
public class OrderController {
	
	@Autowired
	OrderRepo orderRepo;
	
	@RequestMapping("/")
	public String list(Model model){
		
		Iterable<Order> o=orderRepo.findAll();
		model.addAttribute("orders", o);
		return "orders";
	}

}
