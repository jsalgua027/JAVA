/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import ejercicio4.*;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Precipitaciones {
    
    private ArrayList<Integer> fecha;
    private String estacionMeteorologica;
    private String provincia;
    private double precipitacion;

    public Precipitaciones() {
    }

    
    

    public ArrayList<Integer> getFecha() {
        return fecha;
    }

    public void setFecha(ArrayList<Integer> fecha) {
        this.fecha = fecha;
    }

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Precipitaciones{" + "fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia=" + provincia + ", precipitacion=" + precipitacion + '}';
    }
    
    
    
}
