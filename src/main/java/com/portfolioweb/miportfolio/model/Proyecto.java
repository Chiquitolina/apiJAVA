/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "proyecto")

public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String descripcion;
    private String urlProyecto;
    
    public Proyecto() {
    }
    
    public Proyecto(Long id, String nombre, String segundonombre, String descripcion,
                   String urlProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
    }

    }

