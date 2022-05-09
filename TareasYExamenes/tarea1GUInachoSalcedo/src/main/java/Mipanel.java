
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class Mipanel extends JPanel {

    // Añadimos un componente de tipo etiqueta (JLabel)
    private JLabel etiqueta;

    // Constructor pasando un color, que llama al método initComponents(), 
    public Mipanel(Color color) {
        initComponents();
        cambiarColorFondo(color);
    }

    // Método que inicializa los elementos gráficos del formulario
    private void initComponents() {
        // Construimos la etiqueta con el texto que queremos que muestre
        etiqueta = new JLabel("Etiqueta de MiPanel");
        // Añade la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);
    }

    private void cambiarColorFondo(Color color) {
        // Establece el color de fondo del panel
        this.setBackground(color);
    }

    // Método getter
    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicación");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);

        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        ventanaPrincipal.add(new Mipanel(Color.cyan));

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
