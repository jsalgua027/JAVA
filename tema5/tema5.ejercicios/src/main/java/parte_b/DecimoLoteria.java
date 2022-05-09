/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_b;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class DecimoLoteria {

    //declaro el Map
    private Map<String, Premio> decimos;

    //lo inicializo en el constructor por defecto
    public DecimoLoteria() {
        this.decimos = new HashMap<>();

    }

    //genero string de numeros aleatorios para el boleto
    private String generarNumerosString() {
        Random aleatorio = new Random();
        String numero = "";
       int valores=0;
        for (int i = 0; i < 5; i++) {
              valores = aleatorio.nextInt(10);
            numero = numero + valores;
        }

        return numero;
    }

    // metodo que inserta valores
    private void insertarValoresDecimo(String numero) {

        decimos.put(numero, Premio.generarPremios());

    }
    //metodo para generar los decimos 
    public void generarDecimos() {

        insertarValoresDecimo(generarNumerosString());

    }
// metodo imprimir decimos 
    public void imprimirDecimos() {
        for (String decimo : decimos.keySet()) {
            System.out.printf("El decimo %s -- esta premiado con %s %n ", decimo, decimos.get(decimo));
        }

    }

}
