package edu.utn.frro.ds.miniejemplos.dao;

// Clase  ClienteDAO -->se crear para operaciones de B.D. de la Entity Cliente para ejemplos JPQL
// [LRI 3/5/2020 - UTDC013]
// Modif #1 se agrega buscarCategoria()
// [LRI 3/5/2020 - UTDC013]

import java.util.*; // Para usar Collection

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query; // Modif #1

import edu.utn.frro.ds.miniejemplos.domain.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Long> {

    @Query("SELECT c FROM Cliente c WHERE c.categoria = 'MAY'")
	Collection<Cliente> buscarCategoriaFija(); // Modif #1 --> se agrega este método

}