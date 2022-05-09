
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
public class VehiculoAlquilado {
    private Cliente cliente; 
    private Vehiculo vehiculo; 
    private LocalDate fechaAlquiler; 
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" + "cliente=" + cliente + ", vehiculo="
                + vehiculo + ", fechaAlquiler=" + fechaAlquiler +
                ", totalDiasAlquiler=" + totalDiasAlquiler + '}';
    }

    
    
    
    
    
}
