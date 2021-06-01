package interfases;

import modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterPersona extends CrudRepository  <Persona, Integer> {
}
