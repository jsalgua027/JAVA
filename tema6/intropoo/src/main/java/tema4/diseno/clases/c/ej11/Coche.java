/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Coche {

    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private Ruedas ruedaDelanteraIzq;
    private Ruedas ruedaDelanteraDer;
    private Ruedas ruedaDelTraseraIzq;
    private Ruedas ruedaDelTraseraDer;

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Ruedas ruedaDelanteraIzq, Ruedas ruedaDelanteraDer, Ruedas ruedaDelTraseraIzq, Ruedas ruedaDelTraseraDer) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.ruedaDelanteraIzq = ruedaDelanteraIzq;
        this.ruedaDelanteraDer = ruedaDelanteraDer;
        this.ruedaDelTraseraIzq = ruedaDelTraseraIzq;
        this.ruedaDelTraseraDer = ruedaDelTraseraDer;
    }

    public Coche() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public Ruedas getRuedaDelanteraIzq() {
        return ruedaDelanteraIzq;
    }

    public void setRuedaDelanteraIzq(Ruedas ruedaDelanteraIzq) {
        this.ruedaDelanteraIzq = ruedaDelanteraIzq;
    }

    public Ruedas getRuedaDelanteraDer() {
        return ruedaDelanteraDer;
    }

    public void setRuedaDelanteraDer(Ruedas ruedaDelanteraDer) {
        this.ruedaDelanteraDer = ruedaDelanteraDer;
    }

    public Ruedas getRuedaDelTraseraIzq() {
        return ruedaDelTraseraIzq;
    }

    public void setRuedaDelTraseraIzq(Ruedas ruedaDelTraseraIzq) {
        this.ruedaDelTraseraIzq = ruedaDelTraseraIzq;
    }

    public Ruedas getRuedaDelTraseraDer() {
        return ruedaDelTraseraDer;
    }

    public void setRuedaDelTraseraDer(Ruedas ruedaDelTraseraDer) {
        this.ruedaDelTraseraDer = ruedaDelTraseraDer;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto="
                + puertaCopiloto + ", ruedaDelanteraIzq=" + ruedaDelanteraIzq + ", ruedaDelanteraDer="
                + ruedaDelanteraDer + ", ruedaDelTraseraIzq=" + ruedaDelTraseraIzq + ", ruedaDelTraseraDer="
                + ruedaDelTraseraDer + '}';
    }

}
