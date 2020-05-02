package edu.utn.frro.ds.repuestos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//ControladorHome --> Este controlador se usa para poder devolver una view con el menu principal utilizado 
// llamar los mini ejemplos
//[LRI 2/5/2020]


@Controller
public class ControladorHome {
	
	@RequestMapping("/") // indica el path en la url web
	public String home(Model model) {
		return "home"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/home.html
	}

}