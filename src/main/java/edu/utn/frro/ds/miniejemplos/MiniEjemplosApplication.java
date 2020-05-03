package edu.utn.frro.ds.miniejemplos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Clase MiniEjemplosApplication.java --> Clase inicial para levantar la aplicación de los Miniejemplos
//Ver documentación global en ue_DOCUMENTACION.md dentro de este proyecto
//Esta clase fue creada inicialmente por el Spring Initializr, con una cáscara vacía, que luego será codificada
//[UTDC013 - LRI 2/5/2020]
//
// Modif #1 - Se agrega funcionalidad para Ejemplos JPQL
//[UTDC013 - LRI 3/5/2020]

@SpringBootApplication
public class MiniEjemplosApplication {

    private ClienteDAO cDao; // Modif #1 - Var Instancia (rol) cdao --> permite acceder al ClienteDAO

	public static void main(final String[] args) {
		SpringApplication.run(MiniEjemplosApplication.class, args);
	}

    @Bean
	public CommandLineRunner cargarDatos() { 
		return (args) -> {
			// Esto código se ejecuta al inicializar la aplicación
			
			// Crear 3 objetos Cliente para guardar en el DAO
			Cliente l_cte_1 = new Cliente("Juan","Perez","MIN"); 
			Cliente l_cte_2 = new Cliente("Pedro","Marmol","MIN");
			Cliente l_cte_3 = new Cliente("Inés","Roca","MAY");
			
			// Grabar los 3 objetos con el DAO
			cDao.save(l_cte_1);
			cDao.save(l_cte_2);
			cDao.save(l_cte_3);
			
						
		};

}
