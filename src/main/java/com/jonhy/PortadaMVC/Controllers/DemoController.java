package com.jonhy.PortadaMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	
	
	@GetMapping("/Portada")//esta es la accion
	public String Portada() { // esta es la vista
		return "Portada";  
	}

}
