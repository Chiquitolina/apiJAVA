/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Educacion;
import com.portfolioweb.miportfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elcap
 */
@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository eduServ;

    @Override
    public List<Educacion> verEducaciones() {
        return eduServ.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
       eduServ.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduServ.deleteById(id);
    }

    @Override
    public void editarEducation(Educacion edu) {
        eduServ.save(edu);
    }
    
}
