package edu.utn.frro.ds.miniejemplos.controller;

import java.util.ArrayList; // Se agrega para poder crear una collección vacía en clientes_buscarID()

// ControladorEjJPQL --> Este controlador manejará las peticiones de los Ejemplos de JPQL
// [LRI 3/5/2020 - UTDC013]
// Modif #1 - Se agrega  clientes_buscarID()
// [LRI 3/5/2020 - UTDC013]
// Modif #2 Se agrega clientes_buscarCategoriaFija()
// [LRI 3/5/2020 - UTDC013]


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.utn.frro.ds.miniejemplos.dao.ClienteDAO;
import edu.utn.frro.ds.miniejemplos.domain.Cliente;

@Controller
public class ControladorEjJPQL {
	@Autowired
	private ClienteDAO cDao; // Var Instancia (rol) cDao --> permite acceder al ClienteDAO
	
	@RequestMapping("/EjJPQL/clientes_listarTodos") // indica el path en la url web
	public String clientes_listarTodos(Model model) {
        Collection<Cliente> l_colClientes;
        
        l_colClientes = cDao.findAll(); // Recupera todos los clientes

        model.addAttribute("sintaxisConsultaUsada", "cDao.findAll()");	// Se coloca por si hay que hacer algún debug
		model.addAttribute("colClientes", l_colClientes); // Cargar en el modelo que se envía a la vista la colección de colClientess
		return "EjJPQL/clientes-mostrar"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/EjJPQL/clientes-mostrar.html
    }
    
    @RequestMapping("/EjJPQL/clientes_buscarID") // indica el path en la url web
	public String clientes_buscarID(Model model) { // Modif #1 --> se agrega este método
        Collection<Cliente> l_colClientes ; 
        Cliente l_cte;

        l_colClientes = new ArrayList<Cliente>() ; // Crea una colección de clientes vacía
        l_cte = cDao.getOne((long) 2); // Recupera el cliente
        l_colClientes.add(l_cte); // Agrega el cliente a la colección que hay que pasarle a la vista clientes-mostrar


        model.addAttribute("sintaxisConsultaUsada", " cDao.getOne(2)");	// Se coloca por si hay que hacer algún debug
		model.addAttribute("colClientes", l_colClientes); // Cargar en el modelo que se envía a la vista la colección de colClientess
		return "EjJPQL/clientes-mostrar"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/EjJPQL/clientes-mostrar.html
    }
    
    @RequestMapping("/EjJPQL/clientes_buscarCategoriaFija") // indica el path en la url web
	public String clientes_buscarCategoriaFija(Model model) { // Modif #2 --> se agrega este método
        Collection<Cliente> l_colClientes;
        
        l_colClientes = cDao.buscarCategoriaFija(); // Recupera todos los clientes

        model.addAttribute("sintaxisConsultaUsada", "@Query("SELECT c FROM Cliente c WHERE c.categoria = 'MAY'")");	// Se coloca por si hay que hacer algún debug
		model.addAttribute("colClientes", l_colClientes); // Cargar en el modelo que se envía a la vista la colección de colClientess
		return "EjJPQL/clientes-mostrar"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/EjJPQL/clientes-mostrar.html
    }
    

}