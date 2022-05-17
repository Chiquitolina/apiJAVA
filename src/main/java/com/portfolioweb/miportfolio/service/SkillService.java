/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Skill;
import com.portfolioweb.miportfolio.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elcap
 */
@Service
public class SkillService implements ISkillService {
    
    @Autowired
    private SkillRepository skillRepo;
    
     @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
    /**
     *
     * @param ski
     */
    @Override
    public void editarSkill(Skill ski) {
         skillRepo.save(ski);
    }

    @Override
    public Optional<Skill> verSkill(Long id) {
        return skillRepo.findById(id);
    }

    @Override
    public boolean existSkillByID(Long id) {
        return skillRepo.existsById(id);
    }

 


}
