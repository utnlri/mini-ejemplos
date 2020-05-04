package edu.utn.frro.ds.miniejemplos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired; // @Autowired 

//Clase MiniEjemplosApplication.java --> Clase inicial para levantar la aplicación de los Miniejemplos
//Ver documentación global en ue_DOCUMENTACION.md dentro de este proyecto
//Esta clase fue creada inicialmente por el Spring Initializr, con una cáscara vacía, que luego será codificada
//[UTDC013 - LRI 2/5/2020]
//
// Modif #1 - Se agrega funcionalidad para Ejemplos JPQL
//[UTDC013 - LRI 3/5/2020]

import edu.utn.frro.ds.miniejemplos.domain.Cliente;
import edu.utn.frro.ds.miniejemplos.dao.ClienteDAO;

@SpringBootApplication
public class MiniEjemplosApplication {
    @Autowired private ClienteDAO cDao; // Modif #1 - Var Instancia (rol) cdao --> permite acceder al ClienteDAO

	public static void main(final String[] args) {
		SpringApplication.run(MiniEjemplosApplication.class, args);
	}

    // Modif #1 - Se agrega cargarDatos, creando contenido en la tabla Cliente
    @Bean
	public CommandLineRunner cargarDatos() {  // Modif #1 --> se agrega este método
		return (args) -> {
			// Esto código se ejecuta al inicializar la aplicación
			
			// Crear 3 objetos Cliente para guardar en el DAO
			Cliente l_cte_1 = new Cliente("Juan","Perez","MIN",25000.0); 
			Cliente l_cte_2 = new Cliente("Pedro","Marmol","MIN",12000.0);
			Cliente l_cte_3 = new Cliente("Inés","Roca","MAY",450000.0);
			
			// Grabar los 3 objetos con el DAO
			cDao.save(l_cte_1);
			cDao.save(l_cte_2);
			cDao.save(l_cte_3);			
						
		};
    }

}
