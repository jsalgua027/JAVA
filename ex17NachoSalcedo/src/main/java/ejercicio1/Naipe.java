/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Naipe {
    
    private String valor;
    private String palo;
    
    private String[]palos={"rombos","treboles", "picas", "corazones"};
    private String[]valores= {"2","3","4","5","6","7","8","9","10","J","Q","k","AS"};
    private Random aleatorio = new Random();

    public Naipe() {
        
        this.palo = palos[aleatorio.nextInt(palos.length)];
        this.valor = valores[aleatorio.nextInt(valores.length)];
        
        
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String[] getPalos() {
        return palos;
    }

    public void setPalos(String[] palos) {
        this.palos = palos;
    }

    public String[] getValores() {
        return valores;
    }

    public void setValores(String[] valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return "Naipe{" + "valor=" + valor + ", palo=" + palo + '}';
    }

   
    
    
    
    
    
}
