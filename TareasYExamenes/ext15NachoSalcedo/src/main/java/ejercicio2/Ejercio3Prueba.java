/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author nacho
 */
public class Ejercio3Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresaA = new Empresa("siemes", "120426554");
        Empresa empresaB = new Empresa("cocacola", "12044512");

        Trabajador t1 = new Trabajador("nacho", "perez");
        Trabajador t2 = new Trabajador("paco", "jimenez");
        Trabajador t3 = new Trabajador("obi-wan", "lucas");
        Trabajador t4 = new Trabajador("saul", "santos");
        Trabajador t5 = new Trabajador("pepe", "ordoñez");
        //contrato
        empresaA.contratarTrabajador(t1);
        empresaA.contratarTrabajador(t2);
        empresaA.contratarTrabajador(t3);
        
        empresaB.contratarTrabajador(t4);
        empresaB.contratarTrabajador(t5);
        
        empresaA.imprimirTrabajadores();
        empresaB.imprimirTrabajadores();
        //despido
        empresaB.despedirTrabajador(1);
        empresaB.imprimirTrabajadores();
        
        //ordeno 
        empresaA.ordenaNombre();
        //busco
        empresaA.buscarNombre(t3);
        //imprimo
        empresaA.imprimirTrabajadores();
        
        
        
        
        
        
        

    }

}
