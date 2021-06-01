package interfasesService;

import modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface InterPersonaService {

    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public Persona save(Persona p);
    public void delete(int id);
}
