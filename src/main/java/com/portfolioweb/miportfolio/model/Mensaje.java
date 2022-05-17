/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author elcap
 */

@Getter @Setter

public class Mensaje {
    
    private String mensaje;
    
    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
