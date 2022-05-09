/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.tema5.ejercicios.teoria;

/**
 *
 * @author nacho
 */
public enum Pizza {
    
    BARBACOA (22, "Barbacoa cream",new String[]{"Carne","Queso","Baecon","BBQ"},13.0),
    CARBONARA(15, "Carbonara",new String[]{"Beacon", "Queso", "Nata","Huevo"}, 12.5);

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }
    private final int tamanio;
    private final String nombre;
    private final String[]ingredientes;
    private final double precio;
    
}
