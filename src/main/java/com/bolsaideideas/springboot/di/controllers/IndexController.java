package com.bolsaideideas.springboot.di.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsaideideas.springboot.di.models.services.MiServicio;

@Controller
public class IndexController {
	
	private MiServicio miservicio = new MiServicio();
	
	@GetMapping({"/","/index",""})
	public String index(Model model) {
		model.addAttribute("objeto",miservicio.operacion());
		
		return "index";
	}

}
