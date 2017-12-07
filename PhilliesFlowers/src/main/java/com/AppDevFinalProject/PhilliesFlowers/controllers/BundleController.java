package com.AppDevFinalProject.PhilliesFlowers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.AppDevFinalProject.PhilliesFlowers.entities.Bundle;
import com.AppDevFinalProject.PhilliesFlowers.repositories.BundleRepo;

@Controller
public class BundleController 
{
	@Autowired
	BundleRepo bundleRepo;

	/*
	* The repository uses the in-built findAll() method of MongoRepository
	* This returns a list of bundles
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
