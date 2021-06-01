package controller;

import interfasesService.InterPersonaService;
import modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private InterPersonaService service;

    @GetMapping(value="api/listar")
    public String listar(Model model){
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
}
