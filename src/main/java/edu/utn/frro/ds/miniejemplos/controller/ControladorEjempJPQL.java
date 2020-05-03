// ControladorEjJPQL --> Este controlador manejará las peticiones de los Ejemplos de JPQL
// [LRI 3/5/2020 - UTDC013]

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.utn.frro.ds.miniejemplos.dao.ClienteDAO;
//import edu.utn.frro.ds.juguetes.domain.Pedido;

@Controller
public class ControladorEjJPQL {
	@Autowired
	private ClienteDAO cDao; // Var Instancia (rol) cDao --> permite acceder al ClienteDAO
	
	@RequestMapping("/EjJPQL/clientes-listarTodos") // indica el path en la url web
	public String clientes-listarTodos(Model model) {
		Collection<Cliente> l_colClientes = cDao.findAll(); // Recupera todos los clientes
		model.addAttribute("colClientes", l_colClientes); // Cargar en el modelo que se envía a la vista la colección de colClientess
		return "EjJPQL/clientes-mostrar"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/EjJPQL/clientes-mostrar.html
	}

}