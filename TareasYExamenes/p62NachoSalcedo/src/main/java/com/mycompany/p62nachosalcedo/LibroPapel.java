/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p62nachosalcedo;

/**
 *
 * @author nacho
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, int isbn, String codigo, double precio, double iVA, String descripcion) {
        super(isbn, codigo, precio, iVA, descripcion);
        this.numPaginas = numPaginas;
    }

   

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numPaginas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
    }

    //metodo sobreescrito enviar 
    @Override
    public void enviar(String direccion) {
        System.out.println("Se envia a la calle del cielo Número 3, el libro "+this.getClass()+"con el numero de paginas" + getNumPaginas());
    }

    @Override
    public int compareTo(Libro t) {
        return Integer.compare(numPaginas, numPaginas);
    }
    
    @Override
    public void infoLibro(){
        System.out.println("esto es un libro de papel");
        
    }
}
