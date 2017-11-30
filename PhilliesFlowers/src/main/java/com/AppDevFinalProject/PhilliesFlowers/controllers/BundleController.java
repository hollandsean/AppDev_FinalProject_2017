package com.AppDevFinalProject.PhilliesFlowers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.AppDevFinalProject.PhilliesFlowers.entities.Bundle;
import com.AppDevFinalProject.PhilliesFlowers.repositories.BundleRepo;

@Controller
public class BundleController 
{
	@Autowired
	BundleRepo bundleRepo;
	/**
	* Calls index.html
	*/
	@GetMapping("/")
	public String welcomeWithParams(Model model)
	{
		System.out.println("HERE");	
		return "index";
	}
	/*
	* An example of using a path variable.
	* localhost:8080/usingParameter?name=Cliona will add Cliona to the welcome
	* localhost:8080/usingParameter uses the default value of To You!
	*/
	@GetMapping("/usingParameter")
	public String doWelcomeWithParams(@RequestParam(value="name", defaultValue="To You!")String name, Model model)
	{
		String sentence = "Welcome " + name;
		model.addAttribute("message", sentence);
		return "parameter";
	}
	/*
	* The repository uses the in-built findAll() method of MongoRepository
	* This returns a list of People
	* This list is added to the model
	* The model is sent to the displayAll.html template.
	*/
	@GetMapping("/displayall")
	public String displayAll(Model model)
	{
		List<Bundle> b = bundleRepo.findAll();
		model.addAttribute("Bundles", b);
		return "displayAll";
	}
	/*
	* This uses a PathVariable to specify the id being searched for.
	* findOne() is the default method to search for one record using MongoRepository.
	* It returns one record.
	* This record is added to the model.
	* The model is sent to the displayOne.html resolver.
	*/
	@GetMapping("/displayOne/{id}")
	public String showMyDetails(@PathVariable int id, Model model)
	{
	Bundle b = (Bundle) bundleRepo.findOne((int) id);
	model.addAttribute("Bundle", b);
	return "displayOne";
	}
}
