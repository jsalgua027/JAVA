/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_c;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author JoseIgnacio
 */
public class MapEjercito {

    private Map<String, Ejercito> ejercitoMap;

    public MapEjercito() {
        this.ejercitoMap = new TreeMap<>();

    }

    //meto en la estrucutura Map todos los datos
    public void introducir(String identificador, Ejercito ejercito) {
        ejercitoMap.put(identificador, ejercito);

    }

    // metodo para obtener ejercito
    public Ejercito obtenerEjercito(String identificador) {

        return ejercitoMap.get(identificador);

    }

    public void imprimir() {
        for (String identificador : ejercitoMap.keySet()) {
            System.out.printf("clave %s -- Objeto %s %n ", identificador, ejercitoMap.get(identificador));
        }

    }
}
