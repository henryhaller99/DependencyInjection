package com.bolsaideideas.springboot.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsaideideas.springboot.di.models.services.IMiServicio;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("miServicioSimple")
	private IMiServicio miservicio;
	
	@GetMapping({"/","/index",""})
	public String index(Model model) {
		model.addAttribute("objeto",miservicio.operacion());
		
		return "index";
	}

}
