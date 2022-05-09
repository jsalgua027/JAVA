/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_poliformismo;

/**
 *
 * @author JoseIgnacio
 */
public class Camarero extends Trabajador{
    
     private String rango;
    
  /*Siempre un constructor por defecto,
    */  
    //constructor parametrizado
    //constructor 1
    public Camarero(String rango, String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.rango = rango;
    }
    //constructor 2, por defecto
    public Camarero() {
        //hay una call al constructor por defecto de clase padre
        super();
        /*super() da igual ponerlo o no
        implicitamente hace la llama al constructor
        de clase padre SIN PARÁMETROS
        */
    }
    //constructor 3
    public Camarero(String rango){
    //super();
    this.rango = rango;
    
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    /*Este método tostring es un método que estoy SOBREESCRIBIENDO.
    Implica:
    -De la clase padre me viene heredado este método y yo
    aqui ahora en camarero lo estoy sobreescribiendo.
    -Viene de trabajador y este a su vez de la clase object
    */
    public String toString() {
        return super.toString() +"\n" + "Camarero{" + "rango=" + rango + '}';
    }
    //cotizar es overrride, se le add, solo a las clases hijas
    @Override
    public void cotizar(){
        System.out.println("Cotizando como un camarero");
    }
    
    
    
    //un metodo que SOLO DO EL CAMARERO
    public void servirMesa(String id){
        System.out.println("Camarero sirviendo la mesa: "+ id);
    
    }
    
    
    
    
}
