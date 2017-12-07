package com.AppDevFinalProject.PhilliesFlowers.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController 
{
	/**
	* Calls login.html
	*/
	@GetMapping("/login")
	public String callLogin(Locale locale, Model model)
	{
		return "login";
	}
}
