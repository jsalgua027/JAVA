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
public abstract class Libro extends Producto implements Comparable<Libro>{
    
    private int isbn;

    public Libro() {
    }

    public Libro(int isbn, String codigo, double precio, double iVA, String descripcion) {
        super(codigo, precio, iVA, descripcion);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "isbn=" + isbn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(!super.equals(obj)){
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
    public int compareto(Libro t){
        return Integer.compare(this.isbn, t.isbn);
        
    }
    
    
    public void infoLibro(){
        
        
    }

    
}
