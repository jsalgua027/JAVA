
import java.time.LocalDate;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nacho
 */
public class Profesores {
    
    private String nombre;
    private String apellidos;

  
    private String  dni;
    private String puesto;
    private LocalDate fechaTomaPosesion;
    private LocalDate fechaCese;
    private String telefono;
    private boolean evaluador;
    private boolean coordinador;

    

    public Profesores() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaTomaPosesion() {
        return fechaTomaPosesion;
    }

    public void setFechaTomaPosesion(LocalDate fechaTomaPosesion) {
        this.fechaTomaPosesion = fechaTomaPosesion;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }
    
    
      public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return   nombre + ";" + apellidos + ";" + dni + ";" + puesto + ";" + fechaTomaPosesion + ";" + fechaCese + ";" + telefono + ";" + evaluador + ";" + coordinador + '.';
    }

   
    
    
    
}
