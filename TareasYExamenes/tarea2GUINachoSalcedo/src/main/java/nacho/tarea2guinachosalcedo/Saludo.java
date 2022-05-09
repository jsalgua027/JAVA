/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacho.tarea2guinachosalcedo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author JoseIgnacio USO LAS CLASE ANONIMAS
 *
 */
public class Saludo extends JPanel {

    private JButton botonNombre, botonApellidos;
    private JTextArea texto;

    //Constructor
    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        // creamos los botones
        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");

        // creamos area de texto con tamaño y le damos color de fondo
        texto = new JTextArea(2, 50);
        texto.setBackground(Color.blue);

        this.setLayout(new FlowLayout());

        //Añadimos los elementos al panel 
        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        //Usamos clase anonimas para darle funcionalidad cuando le damos al botón
        botonApellidos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.blue);
                texto.setText("Salcedo");
            }
        });
        
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 texto.setBackground(Color.white);
                texto.setText("Nacho");
            }
        });
        
        

    }

}
