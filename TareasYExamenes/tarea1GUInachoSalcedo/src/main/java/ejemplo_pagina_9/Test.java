/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_pagina_9;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author JoseIgnacio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construimos la ventana 
        JFrame ventanaPrincipal = new JFrame("Aplicacion");

        // EStablecemos tamaño y posicion
        ventanaPrincipal.setSize(800, 600);

        ventanaPrincipal.setLocationRelativeTo(null);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());
        
     


        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new MiPanel(Color.red), BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new MiPanel(Color.gray), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);
        
        
           ventanaPrincipal.pack();

        //hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        
        

        // accion por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
