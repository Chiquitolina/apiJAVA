/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.miportfolio.service;

import com.portfolioweb.miportfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author elcap
 */
public interface IEducacionService {
    public List<Educacion> verEducaciones();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public void editarEducation (Educacion edu);
}
