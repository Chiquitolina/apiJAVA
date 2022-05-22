package com.portfolioweb.miportfolio.controller;

import com.portfolioweb.miportfolio.model.Persona;
import com.portfolioweb.miportfolio.service.IPersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {
   
  @Autowired
  public IPersonaService persoServ;
  
  @PostMapping ("/new/persona")
  public void agregarPersona (@RequestBody Persona pers) {
      persoServ.crearPersona(pers);
  }
  
  @GetMapping ("/ver/personas")
  @ResponseBody
  public List<Persona> verPersonas() {
      return persoServ.verPersonas();
  }
  
  @GetMapping ("/ver/persona/{id}")
  @ResponseBody
  public Optional<Persona> verPersona(@PathVariable("id") Long id) {
      return persoServ.verPersona(id);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping ("/delete/{id}")
  public void borrarPersona (@PathVariable Long id) {
      persoServ.borrarPersona(id);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping ("/update/persona/{id}")
  public void editarPersona (@PathVariable ("id") Long id, @RequestBody Persona pers) {
     persoServ.editarPersona(pers);
  }
  
  }
  

  

   
    
