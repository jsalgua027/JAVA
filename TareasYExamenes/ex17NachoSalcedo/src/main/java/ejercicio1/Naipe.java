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
    private Palos palo;

    private String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "AS"};
    private Random aleatorio = new Random();

    public Naipe() {

        this.palo = palo;

        this.valor = valor;

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Naipe{" + "valor=" + valor + ", palo=" + palo + '}';
    }

    public Naipe generarCartaAleatoria() {
        int opcionPalo = aleatorio.nextInt(4) + 1;

        Naipe naipe = new Naipe();

        switch (opcionPalo) {

            case 1:
                naipe.setPalo(Palos.Corazones);
                naipe.setValor(aleatorio.nextInt(valores.length));
                break;
            case 2:
                naipe.setPalo(Palos.Diamantes);
                naipe.setValor(aleatorio.nextInt(valores.length));
                break;
            case 3:
                naipe.setPalo(Palos.Picas);
                naipe.setValor(aleatorio.nextInt(valores.length));
            case 4:
                naipe.setPalo(Palos.Treboles);
                naipe.setValor(aleatorio.nextInt(valores.length);
                break;

        }

        return naipe;

    }

}
