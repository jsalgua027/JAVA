/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_b;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public enum Premio {

    AUTO("porche", 25000),
    VIAJE("Bali", 6000),
    CHEQUE("Cheque-regalo", 3000),
    MOTO("ducati-panigale", 30000);

    private String tipo;
    private double valorPremio;

    private Premio(String tipo, double valorPremio) {
        this.tipo = tipo;
        this.valorPremio = valorPremio;

    }

    public static Premio generarPremios() {
        Random numeroRandom = new Random();
        int opcion = numeroRandom.nextInt(4) + 1;
        Premio resultado = null;
        switch (opcion) {
            case 1:
                resultado = Premio.AUTO;
                break;
            case 2:
                resultado = Premio.VIAJE;
                break;
            case 3:
                resultado = Premio.CHEQUE;
                break;

            case 4:
                resultado = Premio.MOTO;

        }

        return resultado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    
    
    
    
    
    
}
