package edu.utn.frro.ds.miniejemplos.domain;

// Cliente --> Clase Entity creada para ejemplos de JPQL
// [LRI 3/5/2020 - UTDC013]
//
// Modif #1 Se agrega atributo límite crédito para ejemplos de búsquedas con valores numéricos 
// [LRI 3/5/2020 - UTDC013]

import javax.persistence.Entity; // Se agrega automático al copiar la anotación @Entity
import javax.persistence.GeneratedValue; // Se agrega automático al copiar la anotación @id
import javax.persistence.Id; // Se agrega automático al copiar la anotación @GeneratedValue 

@Entity
public class Cliente {
    @Id
    @GeneratedValue
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String categoria; // La categoría puede ser MAY o MIN
    private Float limiteCredito; // Modif #1

    public Cliente() {

    }

    // Esto en Java equivale a un Create, seguido de un inicializar con los
    // argumentos nombre y apellido
	// Como se configira el ID del Cliente con @GeneratedValue el IDserá seteado por el DAO
    public Cliente(  String arg_nombre,  String arg_apellido, 
                     String arg_categoria,  Float arg_limiteCredito ) { // Modif #1 - Se agrega arg_limiteCredito 
		this.nombre=arg_nombre;
		this.apellido=arg_apellido;
        this.categoria=arg_categoria;
        this.limiteCredito=arg_limiteCredito; // Modif #1
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
    public String getCategoria() {
		return this.categoria;
    }
        public Float getLimiteCredito() { // Modif #1 - se agrega este método
        return limiteCredito;
    }

}
	
