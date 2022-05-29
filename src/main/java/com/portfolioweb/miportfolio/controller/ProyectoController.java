/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.controller;

import com.portfolioweb.miportfolio.model.Proyecto;
import com.portfolioweb.miportfolio.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    public IProyectoService proServ;
   
  @PreAuthorize("hasRole('ADMIN')")  
  @PostMapping ("/new/proyecto")
  public void agregarProyecto (@RequestBody Proyecto pro) {
      proServ.crearProyecto(pro);
  }
  
  @GetMapping ("/ver/proyectos")
  @ResponseBody
  public List<Proyecto> verProyectos() {
      return proServ.verProyectos();
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping ("/delete/proyecto/{id}")
  public void borrarProyecto (@PathVariable Long id) {
      proServ.borrarProyecto(id);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping ("/update/porject/{id}")
  public void editarSkill(@PathVariable ("id") Long id, @RequestBody Proyecto pro) {
     proServ.editarProyecto(pro);
  }
    
}
