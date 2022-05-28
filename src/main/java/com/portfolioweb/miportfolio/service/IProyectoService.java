/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Proyecto;
import com.portfolioweb.miportfolio.model.Skill;
import java.util.List;

/**
 *
 * @author elcap
 */
public interface IProyectoService {
    public List<Proyecto> verProyectos();
    public void crearProyecto (Proyecto pro);
    public void borrarProyecto (Long id);
    public void editarProyecto (Proyecto pro);
}
