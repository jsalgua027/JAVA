/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nacho
 */
public class Maraton extends EnPista {

    private String NombreCorredor;
    private int victorias;

    public Maraton() {
    }

    public Maraton(String NombreCorredor, int victorias, int participantes, boolean obsatculos, int distancia, String nombre, String año, String poblacion) {
        super(participantes, obsatculos, distancia, nombre, año, poblacion);
        this.NombreCorredor = NombreCorredor;
        this.victorias = victorias;
    }

    public String getNombreCorredor() {
        return NombreCorredor;
    }

    public void setNombreCorredor(String NombreCorredor) {
        this.NombreCorredor = NombreCorredor;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    // metodo polimorfico de la clase Juegos Olimpicos
    @Override
    public String tipoDeDeporte() {

        return "Maraton";

    }

    // metodo polimorfico o sobreescrito de la clase En pista
    @Override
     public  String Carrera(){
    
    return this.NombreCorredor;
    }

    // metodo que solo existe en esta clase 
    public int numeroVictorias() {

        return this.victorias;
    }

    @Override
    public String toString() {
        return super.toString() + "Maraton{" + "NombreCorredor=" + NombreCorredor + ", victorias=" + victorias + '}';
    }

}
