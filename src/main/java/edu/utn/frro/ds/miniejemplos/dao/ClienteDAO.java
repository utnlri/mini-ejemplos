// Clase  ClienteDAO -->se crear para operaciones de B.D. de la Entity Cliente para ejemplos JPQL
// [LRI 3/5/2020 - UTDC013]

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.utn.frro.ds.juguetes.domain.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Long> {

}