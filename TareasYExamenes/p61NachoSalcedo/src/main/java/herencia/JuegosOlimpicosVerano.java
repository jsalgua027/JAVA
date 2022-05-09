/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public abstract class JuegosOlimpicosVerano {
    
    protected String nombre;
    protected String año;
    protected String poblacion;

    public JuegosOlimpicosVerano() {
    }

    public JuegosOlimpicosVerano(String nombre, String año, String poblacion) {
        this.nombre = nombre;
        this.año = año;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "JuegosOlimpicos{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", poblacion=" + poblacion + '}';
    }
    
    //metedo polimorfico que voy a sobre escribir en las demas clases
    
    public abstract String tipoDeDeporte();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.año);
        hash = 97 * hash + Objects.hashCode(this.poblacion);
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
        final JuegosOlimpicosVerano other = (JuegosOlimpicosVerano) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.año, other.año)) {
            return false;
        }
        return Objects.equals(this.poblacion, other.poblacion);
    }
    
    
    
    
    
    
}
