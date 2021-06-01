package interfases;

import modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface InterPersona extends CrudRepository  <Persona, Integer> {
}
