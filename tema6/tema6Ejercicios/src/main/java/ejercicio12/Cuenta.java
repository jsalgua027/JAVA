/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author nacho
 */
import org.apache.commons.lang3.RandomStringUtils;

public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta() {
    }

    public Cuenta(Persona cliente) {

        this.numeroCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.saldo = 0;
        this.cliente = cliente;

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta.length() == 20) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    public abstract void  actualizarSaldo();
    
    public abstract void retirar(double retiro);
    
        
    
    
    
}
