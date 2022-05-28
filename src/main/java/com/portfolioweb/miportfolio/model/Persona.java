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

/**
 *
 * @author elcap
 */

@Getter @Setter
@Entity
@Table (name = "persona")

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String segundonombre;
    private String apellido;
    private String email;
    private String fechaNacimiento;
    private String pais;
    private String provincia;
    private String ciudad;
    private String contraseña;
    private String titulo;
    private String aboutme;
   
    public Persona() {
    }
    
    public Persona(Long id, String nombre, String segundonombre, String apellido,
                   String contraseña, String email, String fechaNacimiento, String pais, 
                   String provincia, String ciudad, String titulo, String aboutme) {
        this.id = id;
        this.nombre = nombre;
        this.segundonombre = segundonombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.titulo = titulo;
        this.aboutme = aboutme;
    }
    
    }
