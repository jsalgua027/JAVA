/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clases.c.ej10;

/**
 *
 * @author nacho
 */
public class Cancion {
//creo variables para la clase cancion
   private String titulo;
   private String autor;
// creo constructor  parametros

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
   
 // constructor sin parametros
    
    public Cancion(){
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
