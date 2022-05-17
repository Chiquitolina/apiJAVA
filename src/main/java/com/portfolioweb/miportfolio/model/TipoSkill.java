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
@Table (name = "tiposkill")

public class TipoSkill {
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String tipo;
    
    public TipoSkill() {
    }
    
    public TipoSkill(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
}
