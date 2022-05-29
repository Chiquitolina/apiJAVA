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
@Table (name = "educacion")
    

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String titulo;
    private String institucion;
    private String duracion;
    private String url_web_institucion;
    private String urlImagen;
    
    public Educacion() {
    }
    
    public Educacion(Long id, String titulo, String institucion, String duracion, 
            String url_web_institucion, String urlImagen) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.duracion = duracion;
        this.url_web_institucion = url_web_institucion;
        this.urlImagen = urlImagen;
    }
    
}
