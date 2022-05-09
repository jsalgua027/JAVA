/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clases.ej12yej13;

/**
 *
 * @author nacho
 */
public class Empleado {

    private String nombre;
    private String apellidos;
    private String NIF;
    private double sueldoBase;
    private double horaExtra;
    private double horasExtraMes;
    private double IRPF;
    private boolean casado;
    private int numeroHijos;

    public Empleado(String nombre, String apellidos, String NIF, double sueldoBase, double horaExtra, double horasExtraMes, double IRPF, boolean casado, int numeroHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.horaExtra = horaExtra;
        this.horasExtraMes = horasExtraMes;

        if (IRPF >= 1 && IRPF <= 20) {
            this.IRPF = IRPF;
        }

        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public double getIRPF() {
        return IRPF;
    }

    public boolean isCasado() {
        return casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    public void setHorasExtraMes(double horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public void setIRPF(double IRPF) {

        if (IRPF >= 1 && IRPF <= 20) {
            this.IRPF = IRPF;
        }
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String estadoCasado() {

        if (casado == true) {
            return "casado";
        } else {
            return "soltero";
        }
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    //Método toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF="
                + NIF + ", sueldoBase=" + sueldoBase + ", horaExtra=" + horaExtra
                + ", horasExtraMes=" + horasExtraMes + ", IRPF=" + IRPF + ", casado=" + estadoCasado()
                + ", numeroHijos=" + numeroHijos + '}';
    }

    public Empleado() {

    }

    //metodo para calcular importe total de las horas mensuales 
    public double valorHorasExtra() {
        double valorHorasExtra;
        valorHorasExtra = this.horaExtra * this.horasExtraMes;
        return valorHorasExtra;

    }

    // metodo para calcular el sueldo bruto
    public double sueldoBruto() {
        double sueldoBruto = this.sueldoBase + valorHorasExtra();
        return sueldoBruto;
    }

    // método para calcular sueldo Neto
    public double sueldoNeto() {
        double sueldoNeto;
        sueldoNeto = sueldoBruto() - calculoIRPF();
        return sueldoNeto;
    }
    //metodo escribir básico 

    public void escribirBasico() {
        System.out.println("El nombre es= " + this.nombre + "\n El apellido es= "
                + this.apellidos + "\n El NIF es = " + this.NIF
                + "\n El estado civil es= " + casado + " ,tiene= " + this.numeroHijos + " hijos");

    }

    public double calculoIRPF() {
        if ((casado == true)) {
            IRPF = -2;
        }
        for (int i = 0; i < this.numeroHijos; i++) {
            this.IRPF = - 1;

        }
        return 0;

    }

    public void escribirAllInfo() {

        System.out.println("La información básica es ="
                + "su sueldo base es= " + this.sueldoBase
                + "el valor de las horas extra= " + valorHorasExtra() + "su sueldo bruto es= " + sueldoBruto()
                + "de IRPF tiene= " + this.IRPF
                + "Su sueldo neto es= " + sueldoNeto());
    }
}
