/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_pagina_5;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JoseIgnacio
 */
public class MiPanel extends JPanel{
    // Añadimos un componente de tipo etiqueta (JLabel)
    private JLabel etiqueta;
    
    // Constructor pasando un color, que llama al método initComponents(), 
    public MiPanel(Color color){
           initComponents();
        cambiarColorFondo(color);
    }
    
    // Método que inicializa los elementos gráficos del formulario
    private void initComponents(){
        // Construimos la etiqueta con el texto que queremos que muestre
            etiqueta = new JLabel("con el atributo privado de la clase JLabel creamos lo que queremos que muestre");
        // Añade la etiqueta al contenedor MiPanel (al JPanel)
            this.add(etiqueta);
    }
    
    private void cambiarColorFondo(Color color){
        // Establece el color de fondo del panel
            this.setBackground(color);
    }

    // Método getter
    public JLabel getEtiqueta() {
            return etiqueta;
    }

}
