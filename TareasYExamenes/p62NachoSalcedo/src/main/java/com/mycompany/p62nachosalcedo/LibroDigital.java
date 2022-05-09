/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p62nachosalcedo;

/**
 *
 * @author nacho
 */
public final class LibroDigital extends Libro implements SeDescarga{
    
    private double numKBytes;

    public LibroDigital(double numKBytes, int isbn, String codigo, double precio, double iVA, String descripcion) {
        super(isbn, codigo, precio, iVA, descripcion);
        this.numKBytes = numKBytes;
    }

   

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return super.toString()+"LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numKBytes) ^ (Double.doubleToLongBits(this.numKBytes) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        final LibroDigital other = (LibroDigital) obj;
        return Double.doubleToLongBits(this.numKBytes) == Double.doubleToLongBits(other.numKBytes);
    }
    
    

    @Override
    public void descargar() {
        System.out.println("http://NachoSalcedo.daw"+this.hashCode());
        
    }

    @Override
    public int compareTo(Libro t) {
       return (int) Double.compare(numKBytes, numKBytes);
    }
    
    @Override
    public void infoLibro(){
        System.out.println("esto es un libro digital");
        
    }
}
