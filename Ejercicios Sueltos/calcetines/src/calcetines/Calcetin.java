/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcetines;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class Calcetin {

    private Color color;
    private int talla;
     private static Random num = new Random(); //no accesible desde fuera.

    public Calcetin() {
        this.talla = num.nextInt(43 - 40 + 1) + 40;
        int valor = num.nextInt(3) + 1;
        if (valor == 1) {
            this.color = Color.gris_claro;

        }
        if (valor == 2) {

            this.color = Color.gris_oscuro;
        }
        if (valor == 3) {

            this.color = Color.negro;
        }
        
    }

    public Calcetin(Color color, int talla) {
        this.color = color;
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Calcetin{" + "color=" + color + ", talla=" + talla + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + Objects.hashCode(this.talla);
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
        final Calcetin other = (Calcetin) obj;
        if (!Objects.equals(this.talla, other.talla)) {
            return false;
        }
        return this.color == other.color;
    }

}
