/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author nacho
 */
public class CuentaCorriente extends Cuenta {

    private double interesFijo;
    private double saldoMinimo;

    public CuentaCorriente() {
        super();//vienen por defecto pero lo recalco
    }

    public CuentaCorriente(double interesFijo, double saldoMinimo, Persona cliente) {
        super(cliente);
        this.interesFijo = 1.5;
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresFijo() {
        return interesFijo;
    }

    public void setInteresFijo(double interesFijo) {
        this.interesFijo = interesFijo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    
    
    @Override
    public void actualizarSaldo() {

        double saldoFinal;
        if (getSaldo() > 1000) {
            saldoFinal = getSaldo() + (getSaldoMinimo() * this.interesFijo);
            setSaldo(saldoFinal);

        } else {
            saldoFinal = getSaldo() + (getSaldo() + this.interesFijo);
            setSaldo(saldoFinal);

        }
    }

    @Override
    public void retirar(double retiro) {

        if (this.getSaldo() > (this.getSaldo() - retiro)) {
            setSaldo(this.getSaldo() - retiro);
        } else {
            System.out.println("No tiene saldo suficiente");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "interesFijo=" + interesFijo + ", saldoMinimo=" + saldoMinimo + '}';
    }

}
