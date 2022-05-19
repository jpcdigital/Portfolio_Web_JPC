package com.miprimerapp.primer.app.Controller;

import com.miprimerapp.primer.app.model.Persona;
import com.miprimerapp.primer.app.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
public void agregarPersona (@RequestBody Persona pers) {
    persoServ.crearPersona(pers);
	//listaPersonas.add(pers);
}
    @GetMapping("/ver/personas")
    @ResponseBody
public List<Persona> verPersonas () {
    return persoServ.verPersonas();
	//return listaPersonas;
}

@DeleteMapping("/delete/{id}")
public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
}

}
