/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 *
 * 4.- Usando la clase Vehículo, implementa un programa que realice lo
 * siguiente: Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con
 * valores de tu elección y guárdalos en una lista de objetos tipo Vehiculo.
 *
 * Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo
 * uso del método polimórfico toString(), teniendo en cuenta que el string
 * devuelto lleve separados los campos del objeto por el carácter dos puntos
 * (:). Cada línea del fichero estará compuesta por un número, un espacio, un
 * guión, un espacio y los datos del vehículo en cuestión.El número de cada
 * línea será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta,
 * respectivamente. Cada vehículo irá en una línea distinta del fichero.
 * Ejemplos de líneas, los campos no tienen porqué coincidir con los de tus
 * clases:
 *
 * 0 – 4534JTK:Seat:Ibiza:Blanco:… (Este vehículo sería un Turismo) 1 –
 * 3322FFF:Ford:Kuga:Rojo:… (Este vehículo sería un Deportivo)
 *
 *
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String idFichero = "coches.txt";
        ArrayList<Vehiculo> catalagoVehiculos = new ArrayList<>();





             catalagoVehiculos.add(new Turismo(345671L, "4060 TUR", "Skoda", "Fabia", "Blanco",true, 90.0, 2, false));
       catalagoVehiculos.add(new Turismo(345672L, "4064 TUU", "Seat", "Leon", "Negro",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345673L, "4065 TRR", "Skoda", "Fabia", "Dorado",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345674L, "4066 TTT", "Seat", "Ibiza", "Blanco",true, 90.0, 2, false));
        catalagoVehiculos.add(new Turismo(345675L, "4062 TUR", "Porshe", "Panamera", "Negro", true,90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345676L, "4067 TUR", "Seat", "Leon", "Blanco",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345677L, "4068 TUR", "Seat", "Ibiza", "Blanco",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345678L, "4061 TUR", "Skoda", "Fabia", "Blanco",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345679L, "4063 TUR", "Skoda", "Fabia", "Blanco",true, 90.0, 2, false));
         catalagoVehiculos.add(new Turismo(345680L, "4069 TYR", "Porshe", "Panamera", "Blanco",true, 90.0, 2, false));

        //Deportivos
        catalagoVehiculos.add(new Deportivo(786541L, "4070 DEP", "Ford", "Mustang", "Rojo", true,150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786542L, "4071 DEP", "Ford", "Mustang", "Rojo",true, 150.0, 2000));
        catalagoVehiculos.add(new Deportivo(786543L, "4072 DEP", "Ferrari", "Mustang", "Rojo", true,150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786544L, "4073 DEP", "Ferrari", "Mustang", "Rojo", true,150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786545L, "4074 DEP", "Ford", "Mustang", "Rojo",true, 150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786546L, "4075 DEP", "Mercedes", "Mustang", "Rojo", true,150.0, 2000));
        catalagoVehiculos.add(new Deportivo(786547L, "4076 DEP", "Ford", "Mustang", "Rojo", true,150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786548L, "4077 DEP", "Lambo", "Mustang", "Rojo", true,150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786549L, "4078 DEP", "Ford", "Mustang", "Rojo",true, 150.0, 2000));
         catalagoVehiculos.add(new Deportivo(786551L, "4079 DEP", "Lambi", "Mustang", "Rojo", true,150.0, 2000));

        //Furgonetas
         catalagoVehiculos.add(new Furgoneta(43331L, "4080 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(4332L, "4081 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(43333L, "4082 FUR", "Fiat", "Ducato", "Azul", true,80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(43334L, "4083 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
        catalagoVehiculos.add(new Furgoneta(43335L, "4084 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
        catalagoVehiculos.add(new Furgoneta(43336L, "4085 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(43337L, "4086 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(43338L, "4087 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(43339L, "4088 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));
         catalagoVehiculos.add(new Furgoneta(433340L, "4089 FUR", "Fiat", "Ducato", "Azul",true, 80.0, 1200, 8));

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (int i = 0; i < catalagoVehiculos.size(); i++) {
                flujo.write(catalagoVehiculos.get(i).toString() + ";");
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
