package service;

import interfases.InterPersona;
import interfasesService.InterPersonaService;
import modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService  implements InterPersonaService {

    @Autowired
    private InterPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public Persona save(Persona p) {
        return data.save(p);
    }

    @Override
    public void delete(int id) { data.deleteById(id); }
}
