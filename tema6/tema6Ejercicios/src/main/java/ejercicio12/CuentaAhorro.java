/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author JoseIgnacio
 */
public class CuentaAhorro extends Cuenta {

    private double intereses;
    private double comisionAnual;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intereses, double comisionAnual) {
        this.intereses = intereses;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro(double intereses, double comisionAnual, Persona cliente) {
        super(cliente);
        this.intereses = intereses;
        this.comisionAnual = comisionAnual;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo() {
       setSaldo((getSaldo() + (getSaldo() * this.intereses)) - this.comisionAnual);

    }
    @Override
    public void retirar(double retiro) {

        if ((getSaldo() - retiro) > 0 && getSaldo() > 0) {
            setSaldo(getSaldo() - retiro);

        }
    }

    @Override
    public String toString() {
        return  super.toString()+"CuentaAhorro{" + "intereses=" + intereses + ", comisionAnual=" + comisionAnual + '}';
    }
    
    
    
    
}
