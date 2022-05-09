/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author JoseIgnacio
 */
public abstract class Figura {
    
    protected int base;
    protected int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.base) ^ (Double.doubleToLongBits(this.base) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
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
        final Figura other = (Figura) obj;
        if (Double.doubleToLongBits(this.base) != Double.doubleToLongBits(other.base)) {
            return false;
        }
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        return true;
    }
     // metodo que se sobreescribe cuando no es abstrata la clase
//    public int calcularArea(){
//        
//     return 0;   
//    }
    
    
     public abstract int calcularArea();
        
     
    
    
    
}
