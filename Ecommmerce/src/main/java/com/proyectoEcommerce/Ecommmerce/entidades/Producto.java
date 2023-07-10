/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoEcommerce.Ecommmerce.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.swing.ImageIcon;
import lombok.Getter;
import lombok.Setter;





/**
 *
 * @author FlowUser
 */
@Entity @Getter @Setter
public class Producto {
    @Id
    public String modelo;
    public ImageIcon imagen;
    public String descripcion;
    public double precio;
}
