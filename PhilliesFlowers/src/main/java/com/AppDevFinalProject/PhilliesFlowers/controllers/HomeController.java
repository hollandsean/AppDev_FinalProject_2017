package com.AppDevFinalProject.PhilliesFlowers.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController
{
	/**
	* Calls home.html
	*/
	@GetMapping("/")
	public String callHome(Locale locale, Model model)
	{
		return "home";
	}
}
