/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p62nachosalcedo;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public abstract class Ropa extends Producto implements SeEnvia{
    
    private String marca;

    public Ropa() {
    }

    public Ropa(String marca, String codigo, double precio, double iVA, String descripcion) {
        super(codigo, precio, iVA, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString()+"Ropa{" + "marca=" + marca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(!super.equals(obj)){
            return false;
        }
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }
    
    
    // metodo polimormico de la interface SeEnvia
    
    @Override
    public void enviar(String direccion){
        System.out.println("Se envia a la calle del cielo Número 3, de la marca "+super.getDescripcion()+"de la marca: " +getMarca());
        
    }
    
    
    
}
