
// Cliente --> Clase Entity creada para ejemplos de JPQL
// [LRI 3/5/2020 - UTDC013]

import javax.persistence.Entity; // Se agrega automático al copiar la anotación @Entity
import javax.persistence.GeneratedValue; // Se agrega automático al copiar la anotación @id
import javax.persistence.Id; // Se agrega automático al copiar la anotación @GeneratedValue 

@Entity
public class Cliente {
	@Id @GeneratedValue
	private Long idCliente;
	private String nombre;
	private String apellido;

	public Cliente() {
		
	} 
	// Esto en Java equivale a un Create, seguido de un inicializar con los argumentos nombre y apellido
	// Como se configira el ID del Cliente con @GeneratedValue el IDserá seteado por el DAO
	public Cliente( String arg_nombre, String  arg_apellido) {
		this.nombre=arg_nombre;
		this.apellido=arg_apellido;
	}
	public Long getIdCliente() {
		return this.idCliente;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	
