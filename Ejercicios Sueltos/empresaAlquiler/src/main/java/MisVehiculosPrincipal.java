/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class MisVehiculosPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // la instancia easydrive de la clase EmpresaAlquilerVehiculos
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive", "www.easydrive.com");

// registro de los clientes de la empresa
        easydrive.registrarCliente(new Cliente("X5618927C",
                "Juan", "González López"));
        easydrive.registrarCliente(new Cliente("Z7568991Y",
                "Luis", "Fernández Gómez"));
        // registro de los vehículos de la empresa easydrive.registrarVehiculo(new Vehiculo("4060 TUR", "Skoda", "Fabia" , "Blanco", 90.0, false));
        easydrive.registrarVehiculo(new Vehiculo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, true));
        easydrive.registrarVehiculo(new Vehiculo("4080 TUR", "VW", "GTI",
                "Azul", 110.0, false));
        easydrive.registrarVehiculo(new Vehiculo("4090 TUR", "SEAT", "Ibiza", "Blanco", 90.0, false));
        easydrive.registrarVehiculo(new Vehiculo("4100 FUR", "Fiat", "Ducato", "Azul", 80.0, true));

// imprime la relación de clientes de easydrive easydrive.imprimirClientes();
// imprime el catálogo de vehículos de easydrive
        easydrive.imprimirVehiculos();
    }

}
