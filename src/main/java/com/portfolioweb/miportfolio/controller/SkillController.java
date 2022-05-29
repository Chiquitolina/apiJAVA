 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.controller;

import com.portfolioweb.miportfolio.model.Mensaje;
import com.portfolioweb.miportfolio.model.Skill;
import com.portfolioweb.miportfolio.service.ISkillService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class SkillController {
   
  @Autowired
  public ISkillService skillServ;
  
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping ("/new/skill")
  public void agregarSkill (@RequestBody Skill skil) {
      skillServ.crearSkill(skil);
  }
  
  @GetMapping ("/ver/skill")
  @ResponseBody
  public ResponseEntity<List<Skill>> verSkills() {
      List<Skill> list = skillServ.verSkills();
      return new ResponseEntity(list, HttpStatus.OK);
  }
  
  @GetMapping ("/ver/skill/{id}")
  @ResponseBody
  public ResponseEntity<Skill> verSkill(@PathVariable("id") Long id) {
      if (!skillServ.existSkillByID(id))
       return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
       Skill skill = skillServ.verSkill(id).get();
       return new ResponseEntity<Skill>(skill, HttpStatus.OK);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping ("/delete/skill/{id}")
  public void borrarSkill (@PathVariable Long id) {
      skillServ.borrarSkill(id);
  }
  
  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping ("/update/skill/{id}")
  public void editarSkill(@PathVariable ("id") Long id, @RequestBody Skill skil) {
     skillServ.editarSkill(skil);
  }
  

     
  
  
    
}
