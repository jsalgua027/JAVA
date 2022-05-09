/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JoseIgnacio
 */
public class TestFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construimos la ventana 
        JFrame ventanaPrincipal = new JFrame("Nacho Salcedo Guarde");

        // EStablecemos tamaño y posicion
        ventanaPrincipal.setSize(800, 600);

        ventanaPrincipal.setLocationRelativeTo(null);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //creo los paneles
        MiPanel panel1 = new MiPanel(Color.yellow);
        // para acceder a la etiqueta señalo a la misma y uso el .setText("lo que se que quieras")
        panel1.getEtiqueta().setText("Panel de color amarillo");
        ventanaPrincipal.add(panel1, BorderLayout.NORTH);

        MiPanel panel2 = new MiPanel(Color.green);
        panel2.getEtiqueta().setText("Panel de color verde");
        ventanaPrincipal.add(panel2, BorderLayout.SOUTH);

        MiPanel panel3 = new MiPanel(Color.orange);
        panel3.getEtiqueta().setText("Panel de color naranja");
        ventanaPrincipal.add(panel3, BorderLayout.CENTER);

        MiPanel panel4 = new MiPanel(Color.red);
        panel4.getEtiqueta().setText("Panel de color rojo");
        ventanaPrincipal.add(panel4, BorderLayout.WEST);

        MiPanel panel5 = new MiPanel(Color.pink);
        panel5.getEtiqueta().setText("Panel de color rosa");
        ventanaPrincipal.add(panel5, BorderLayout.EAST);

         
        //hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        
        

        // accion por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }

}
