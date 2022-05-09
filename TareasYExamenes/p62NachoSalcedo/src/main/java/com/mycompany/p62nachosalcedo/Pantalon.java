/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p62nachosalcedo;

/**
 *
 * @author nacho
 */
public final class Pantalon extends Ropa{
    private int talla;

    public Pantalon() {
    }

    public Pantalon(int talla, String marca, String codigo, double precio, double iVA, String descripcion) {
        super(marca, codigo, precio, iVA, descripcion);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString()+"Pantalon{" + "talla=" + talla + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.talla;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
     
        if(!super.equals(obj)){
            return false;
        }
        final Pantalon other = (Pantalon) obj;
        return this.talla == other.talla;
    }
    
    
    
}
