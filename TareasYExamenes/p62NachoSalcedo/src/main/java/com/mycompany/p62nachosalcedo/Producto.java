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
public abstract class Producto {
    private String codigo;
    private double precio;
    private double iVA;
    private String descripcion;

    public Producto() {
    }

    public Producto(String codigo, double precio, double iVA, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iVA = iVA;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getiVA() {
        return iVA;
    }

    public void setiVA(double iVA) {
        this.iVA = iVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", iVA=" + iVA + ", descripcion=" + descripcion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.iVA) ^ (Double.doubleToLongBits(this.iVA) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.descripcion);
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
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iVA) != Double.doubleToLongBits(other.iVA)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }
    
    
    
    
}
