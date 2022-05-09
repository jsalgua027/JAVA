/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseño.clases.c.ej07;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String NIF;
    private String nombreCliente;
    private double saldoActual;
    private double interesAnual;

    public CuentaBancaria(String NIF, String nombreCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(15).toUpperCase();
        this.NIF = NIF;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        if (interesAnual >= 0.1 && interesAnual <= 3) {
            this.interesAnual = interesAnual;

        }

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteresAnual() {

        return interesAnual;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoActual(double saldoActual) {

        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interesAnual) {

        if (interesAnual >= 0.1 && interesAnual <= 0.3) {
            this.interesAnual = interesAnual;

        }

    }

    public void ingresarInteres(double interesesGenerados) {
        interesAnual = saldoActual + (saldoActual * interesAnual);

    }

    public void ingresarDinero(double cantidad) {
        saldoActual = saldoActual + cantidad;

    }

    public void ingresarEfectivo(double cantidad) {

        if (saldoActual - cantidad > 0) {
            this.saldoActual = saldoActual - cantidad;
        }

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + "\n, NIF="
                + NIF + "\n, nombreCliente=" + nombreCliente + "\n, saldoActual="
                + saldoActual + "\n, interesAnual=" + interesAnual + '}';
    }

}
