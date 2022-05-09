/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_pagina_5;

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
        JFrame ventanaPrincipal = new JFrame ("APLICACION");
        
        // Establecemos tamaño y posicion
        ventanaPrincipal.setSize(800, 600);
        
        ventanaPrincipal.setLocationRelativeTo(null);
        
        //añadimos un objeto Mipanel al JFrame
         ventanaPrincipal.add(new MiPanel(Color.CYAN));
         
         //hacemos visible la ventana
         ventanaPrincipal.setVisible(true);
         
         // accion por defecto al pulsar el botón de cierre de la ventana
         ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
