
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class EmpresaAlquilerVehiculos {
    // Atributos de la empresa

    private String cif;
    private String nombre;
    private String paginaWeb;

    /* Atributos para controlar el total de clientes que
    tiene la empresa y array de almacenamiento para los objetos
    Cliente */
    private int totalClientes;
    private Cliente[] clientes;

    /* Atributos para controlar el total de vehiculos disponibles en 
 alquiler que tiene la empresa y array de almacenamiento para los objetos Vehiculo */
    private int totalVehiculos;
    private Vehiculo[] vehiculos;

    /* Atributos para controlar el histórico de alquileres: total de alquileres realizados y array de almacenamiento para los objetos VehiculoAlquilado */
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;

    /* Constructor parametrizado donde se establece que el total de clientes será 50, igual que el total de vehiculos disponibles. El histórico de vehiculos puede contener hasta 100 elementos */
    EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
// Incialmente no hay clientes creados en la empresa
        this.totalClientes = 0;
        this.clientes = new Cliente[50]; // apuntan a null
// Incialmente no hay vehiculos creados en la empresa
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50]; // apuntan a null
// Incialmente no hay histórico de alquileres en la empresa
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100]; // apuntan a null
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;

    }

    public Cliente buscarCliente(String Nif) {

        for (int i = 0; i < this.totalClientes; i++) {

            if (this.clientes[i].getNif().equals(Nif)) {
                return this.clientes[i];
            }
        }

        return null;
    }

    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");

        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i]);
        }

    }

    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
    }

    public Vehiculo buscarVehiculo(String matricula) {

        for (int i = 0; i < this.totalVehiculos; i++) {

            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                return this.vehiculos[i];
            }
        }

        return null;
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\t Disponible\n");
        // Uso de bucle foreach
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public boolean alquilarVehiculo(String matricula, String nif, int dias) {
        // busca el cliente a partir del nif 
        Cliente cliente = buscarCliente(nif);
        // busca el vehículo a partir de la matrícula
        Vehiculo vehiculo = buscarVehiculo(matricula);

        if (cliente != null && vehiculo != null) {
            if (vehiculo.isDisponible()) {
                vehiculo.setDisponible(false);
                this.alquileres[this.totalAlquileres]
                        = new VehiculoAlquilado(cliente, vehiculo,
                                LocalDate.now(), dias);

                this.totalAlquileres++;
                return true; // El alquiler se realiza correctamente
            }
        }
        return false; // No se puede alquilar el vehiculo por el cliente
    }

    public void recibirVehiculo(String matricula) {

// busca el vehículo con la matrícula dada en el
// array vehiculos y modifica su disponibilidad
// para que se pueda alquilar de nuevo
        Vehiculo vehiculo = buscarVehiculo(matricula);

        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
