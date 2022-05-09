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
public final class Musica extends Producto{
    
    private String grupo;

    public Musica() {
    }

    public Musica(String grupo, String codigo, double precio, double iVA, String descripcion) {
        super(codigo, precio, iVA, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString()+"Musica{" + "grupo=" + grupo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.grupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        return Objects.equals(this.grupo, other.grupo);
    }
    
    
}
