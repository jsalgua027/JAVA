/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author JoseIgnacio
 */
public class Main {

    /**
     * 5.- Implementa la clase Cliente que hay en el apartado de “Sobrescritura
     * del método equals” de los apuntes de clase. Incluye los constructores,
     * getters, setters y toString. Sobrescribe también los métodos equals y
     * hashCode. Realiza una clase que incluya el método main() con el siguiente
     * código: Creación de 5 objetos Cliente, uno con el constructor por defecto
     * y cuatro con el parametrizado. De los cuatro objetos creados con el
     * parametrizado, 3 tendrán los mismos estados. Imprime los hashCode de cada
     * instancia, y comprueba cuáles son iguales y cuáles distintos.
     * Comprobaciones de las propiedades transitiva, reflexiva, simétrica y
     * nula.
     *
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("nacho", "7589ll", 25);
        Cliente c2 = new Cliente("nacho", "7589ll", 25);
        Cliente c3 = new Cliente("nacho", "7589ll", 25);
        Cliente c4 = new Cliente("pepe", "8856jj", 32);
        Cliente c5 = new Cliente();
        System.out.println("----------------------cliente c1---------------");
        System.out.println(c1.hashCode());

        System.out.println("----------------------cliente c2----------------");
        System.out.println(c2.hashCode());

        System.out.println("----------------------cliente c3----------------");
        System.out.println(c3.hashCode());

        System.out.println("----------------------cliente c4----------------");
        System.out.println(c4.hashCode());

        System.out.println("----------------------cliente c5----------------");
        System.out.println(c5.hashCode());

        System.out.println("-------------------PROPIEDADES--------------");
        System.out.println("----Transitiva----");
        System.out.println("Si clinete c1 es igual que c2 devulve true------> " + c1.equals(c2));
        System.out.println("Si ciente c2 es igual a c3 devulve true---------> " + c2.equals(c3));
        System.out.println("Entonces cliente c1 y c3 son iguales y devuleve true--------> " + c1.equals(c3));
        System.out.println("----Reflexiva----");
        System.out.println("Si se compara consigo mismo debe dar true--------->" + c1.equals(c1));
        System.out.println("----Nula----");
        System.out.println("Si se compara con null debe ser false------------->" + c1.equals(null));

    }

}
