/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Vehiculo {
    
    private Long bastidor;
    private String matricula; 
    private String marca; 
    private String modelo; 
    private String color; 
    private double tarifa; 
    private boolean disponible;

    public Vehiculo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public Vehiculo() {
    }
    
    
    
    public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.bastidor);
        hash = 73 * hash + Objects.hashCode(this.matricula);
        hash = 73 * hash + Objects.hashCode(this.marca);
        hash = 73 * hash + Objects.hashCode(this.modelo);
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 73 * hash + (this.disponible ? 1 : 0);
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
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.bastidor, other.bastidor);
    }

   
    public String getAtributo() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
    
    public void nacho(){
        
        System.out.println("Soy un vehiculo");
        
    }

    
}
