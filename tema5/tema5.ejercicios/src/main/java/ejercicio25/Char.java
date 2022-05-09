/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

/**
 *
 * @author JoseIgnacio
 */
public class Char {
    private char caracter;

    public Char() {
    }

    public Char(char caracter) {
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "Char{" + "caracter=" + caracter + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.caracter;
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
        final Char other = (Char) obj;
        if (this.caracter != other.caracter) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

