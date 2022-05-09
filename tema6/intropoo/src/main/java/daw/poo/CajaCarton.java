/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author nacho
 */
public class CajaCarton {
//estos atributos al ser private solo son visibles en esta clase

    private int ancho;
    private int alto;
    private int largo;
    private int peso;

    public CajaCarton(int ancho, int alto, int largo, int peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        if (!(peso <= 0 && peso > 1000)) {
            System.out.println("El peso no es valido");
            this.peso = 0;
        }
    }

    //CajaCarton() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    //las restricciones tienen que estar en el constructor y en los metodos (restricciones:if-eslse....etc)
    //necesitan los getters y los setters para manejar los parametros    
    public int getAncho() {
        return this.ancho;

    }

    public int getAlto() {
        return this.alto;

    }

    public int getLargo() {
        return this.largo;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    //Ej09 de los ejerciciosB del tema4 Implementa 
    //el método setPeso(int gramos) de la clase 'CajaCarton' 
    //para que en caso de que el peso sea negativo o mayor que 1000gr,
    //se muestre un mensaje advirtiendo al usuario de que el peso 
    //pasado como argumento no es válido y se establecerá a cero.

    public void setPeso(int peso) {
        if (!(peso <= 0 && peso > 1000)) {
            System.out.println("El peso no es valido");
            this.peso = 0;
        }

    }

    public void abrir() {

    }

    public void cerrar() {

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
