/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw_nacho_salcedo;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

/**
 *
 * @author nacho
 */
public class TarjetaCredito {

    private String numtarjeta;
    private int saldo;
    private boolean tarjEstado;//false desactivada
    private String pin;
    private String nomEntidad;
    private String titular;
    private YearMonth fechaVencimiento;
    private final int LIMITE_MAX;
    private final int LIMITE_MINIMO;

    //constructor por defecto
    public TarjetaCredito() {
        this.numtarjeta = "1234567891112345";
        this.tarjEstado = false;
        this.saldo = 2500;
        this.pin = "1234";
        this.nomEntidad = "BBVA";
        this.titular = "Pepe perez";
        this.fechaVencimiento = YearMonth.of(2026, 02);
        this.LIMITE_MAX = 3000;
        this.LIMITE_MINIMO = 300;

    }

    //constructor parametrizado
    public TarjetaCredito(String numtarjeta, int limite, boolean tarjEstado,
            String pin, String nomEntidad, String titular, YearMonth fechaVencimiento) {

        if (numtarjeta.length() == 16) { //comprobacion tarjeta tiene 16 cifas
            this.numtarjeta = numtarjeta;
        } else {
            this.numtarjeta = "1234123412341234";
        }
        if (limite >= 500 && limite <= 3000) {// limite de credito
            this.limite = limite;
        } else {
            this.limite = 550;
        }

        this.tarjEstado = tarjEstado;

        this.pin = pin;

        this.nomEntidad = nomEntidad;
        this.titular = titular;

        if (fechaVencimiento.isAfter(YearMonth.now())) {               // si la tarjeta esta caducada se crea otra con 5 años mas 
            this.fechaVencimiento = YearMonth.now().plusYears(3);

        } else {
            this.fechaVencimiento = fechaVencimiento;

        }

    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        if (numtarjeta.length() == 16) { //comprobacion tarjeta tiene 16 cifas
            this.numtarjeta = numtarjeta;
        } else {
            this.numtarjeta = "1234123412341234";
        }

    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        if (limite >= 500 && limite <= 3000) {// limite de credito
            this.limite = limite;
        } else {
            this.limite = 300;
        }

    }

    public boolean isTarjEstado() {
        return tarjEstado;
    }

    public void setTarjEstado(boolean tarjEstado) {
        this.tarjEstado = tarjEstado;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNomEntidad() {
        return nomEntidad;
    }

    public void setNomEntidad(String nomEntidad) {
        this.nomEntidad = nomEntidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(YearMonth fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //metodo copia 
    public TarjetaCredito copia(TarjetaCredito aux) {
        TarjetaCredito nueva = new TarjetaCredito(aux.getNumtarjeta(), aux.getLimite(), aux.isTarjEstado(), aux.getPin(),
                aux.getNomEntidad(), aux.getTitular(), aux.getFechaVencimiento());
        return nueva;
    }

    //metodo toString
    @Override
    public String toString() {
        return "TarjetaCredito{" + "\n Nombre del titular= " + titular + "\nCon fecha de vencimiento= "
                + fechaVencimiento + "\nUn credito de= " + limite + "\nCon el nuemro de tarjeta= " + numtarjeta
                + '}';
    }

    private boolean comprobarTarjeta(String num, int longitud) {
        boolean numCorrecta = true;
        for (int i = 0; i < numtarjeta.length(); i++) {
            if (!Character.isDigit(numtarjeta.charAt(i))) {
                numCorrecta = false;
                break;

            }
            
        }
        boolean longitudCorrecta= true;
        if(num.length()!= longitud)
        return numCorrecta;
    }

}
