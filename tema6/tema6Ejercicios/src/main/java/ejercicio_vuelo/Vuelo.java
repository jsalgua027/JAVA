/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vuelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Vuelo {
    
    private int codvuelo;
    private String ciudadOrigen;
    private String destino;
    private double duracionVuelo;
    private ArrayList <Pasajeros> lista;

    public Vuelo(int codvuelo, String ciudadOrigen, String destino, double duracionVuelo, ArrayList<Pasajeros> lista) {
        this.codvuelo = codvuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.destino = destino;
        this.duracionVuelo = duracionVuelo;
        this.lista = lista;
    }

    public int getCodvuelo() {
        return codvuelo;
    }

    public void setCodvuelo(int codvuelo) {
        this.codvuelo = codvuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public ArrayList<Pasajeros> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pasajeros> lista) {
        this.lista = lista;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codvuelo;
        hash = 47 * hash + Objects.hashCode(this.ciudadOrigen);
        hash = 47 * hash + Objects.hashCode(this.destino);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.duracionVuelo) ^ (Double.doubleToLongBits(this.duracionVuelo) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.lista);
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
        final Vuelo other = (Vuelo) obj;
        if (this.codvuelo != other.codvuelo) {
            return false;
        }
        if (Double.doubleToLongBits(this.duracionVuelo) != Double.doubleToLongBits(other.duracionVuelo)) {
            return false;
        }
        if (!Objects.equals(this.ciudadOrigen, other.ciudadOrigen)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.lista, other.lista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codvuelo=" + codvuelo + ", ciudadOrigen=" + ciudadOrigen + ", destino=" + destino + ", duracionVuelo=" + duracionVuelo + ", lista=" + lista + '}'+"\n";
    }
    
    
    
    
    
}
