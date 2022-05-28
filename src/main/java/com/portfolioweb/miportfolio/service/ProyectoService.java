/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Proyecto;
import com.portfolioweb.miportfolio.model.Skill;
import com.portfolioweb.miportfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elcap
 */
@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    private ProyectoRepository proyServ;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyServ.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proyServ.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyServ.deleteById(id);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proyServ.save(pro);
    }
    
}
