/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Objects;

/**
 *
 * @author nacho
 */
//Muy importante!!!!!------el orden natural debe ser el mismo ------> usamos el mismo criterio en equials y en el comparaTo
//Ojo el comparable es donde se asignan los atributos  y el comparaTo es el metodo al final de este ejemplo
//obliga a implementar el metodo compareTo
public class Libro implements Comparable<Libro>{

    private String isbn;
    private String nombre;
    private String editorial;
    private int numeroPags;
    private double precio;

    public Libro(String isbn, String nombre, String editorial, int numeroPags, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numeroPags = numeroPags;
        this.precio = precio;
    }

    public Libro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numeroPags=" + numeroPags + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.isbn);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.editorial);
        hash = 41 * hash + this.numeroPags;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }
//dos libros iguales cuando el isbn coindicen
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
        final Libro other = (Libro) obj;//casting objeto

        return Objects.equals(this.isbn, other.isbn);
    }
//metodo creado al poner la interface compareTo en el construtor
    // el metodo compareTo devuelve <0 si this es anterior 
    //=0 si this y lebro t son iguales
    //
    @Override
    public int compareTo(Libro t) {
        return this.isbn.compareTo(t.isbn); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
