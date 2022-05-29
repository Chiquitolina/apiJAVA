/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.controller;

import com.portfolioweb.miportfolio.model.Educacion;
import com.portfolioweb.miportfolio.model.Skill;
import com.portfolioweb.miportfolio.service.IEducacionService;
import java.util.List;
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

/**
 *
 * @author elcap
 */
//@CrossOrigin(origins="https://portfolioweb-9e852.web.app")
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EducacionController {
    
    @Autowired
    public IEducacionService eduServ;
    
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping ("/new/educacion")
  public void agregarEducacion (@RequestBody Educacion edu) {
      eduServ.crearEducacion(edu);
  }
  
  @GetMapping ("/ver/educacion")
  @ResponseBody
  public List<Educacion> verEducaciones() {
      return eduServ.verEducaciones();
  }
  
  
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping ("/delete/educacion/{id}")
  public void borrarEducacion (@PathVariable Long id) {
      eduServ.borrarEducacion(id);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping ("/update/education/{id}")
  public void editarSkill(@PathVariable ("id") Long id, @RequestBody Educacion edu) {
     eduServ.editarEducation(edu);
  }
 
}
