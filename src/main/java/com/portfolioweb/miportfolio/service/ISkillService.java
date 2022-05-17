/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Skill;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elcap
 */
public interface ISkillService {
    public List<Skill> verSkills();
    public Optional<Skill> verSkill(Long id);
    public boolean existSkillByID(Long id);
    public void crearSkill (Skill ski);
    public void borrarSkill (Long id);
    public void editarSkill (Skill ski);
}
