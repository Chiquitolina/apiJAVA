/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Persona;
import com.portfolioweb.miportfolio.model.Skill;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author elcap
 */
public interface IPersonaService {
    public List<Persona> verPersonas();
    public void editarPersona (Persona per);
    public Optional<Persona> verPersona(Long id);
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona(Long id);
}
