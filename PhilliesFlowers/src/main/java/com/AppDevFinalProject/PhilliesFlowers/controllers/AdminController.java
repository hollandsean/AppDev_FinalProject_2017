package com.AppDevFinalProject.PhilliesFlowers.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController
{
	/**
	* Calls admin.html
	*/
	@GetMapping("/admin")
	public String callAdmin(Locale locale, Model model)
	{
		return "admin";
	}
}
