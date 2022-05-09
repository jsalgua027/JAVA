/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawNachoSalcedo;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class LibroElectronico {

    //creo parametros privados para el encapsulamiento de los mismos 
    private String identificador;
    private String nombreLibro;
    private int paginasTotales;
    private double tamanoLibro;
    private int numeroPagina;
    // genero el constructor parametrizado con las restricciones indicadas

    public LibroElectronico(String identificador, String nombreLibro, int paginasTotales, int tamanoLibro, int numeroPagina) {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nombreLibro = nombreLibro;

        if (paginasTotales > 0 && paginasTotales <= 9999) {
            this.paginasTotales = paginasTotales;
        }

        if (tamanoLibro > 0 && tamanoLibro <= 10) {
            this.numeroPagina = numeroPagina;
        }
        this.numeroPagina = 0;
    }

    //constructor por defecto
    public LibroElectronico() {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nombreLibro = "Don Quijote de la Mancha";
        this.paginasTotales = 1435;
        this.tamanoLibro = 5;
        this.numeroPagina = 1;
    }

    // genero los getters y los setters incluyo restricciones en los setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getPaginasTotales() {

        return paginasTotales;
    }

    public void setPaginasTotales(int paginasTotales) {
        if (paginasTotales > 0 && paginasTotales <= 9999) {
            this.paginasTotales = paginasTotales;
        }

    }

    public double getTamanoLibro() {
        return tamanoLibro;
    }

    public void setTamanoLibro(double tamanoLibro) {
        if (tamanoLibro > 0 && tamanoLibro <= 10) {
            this.numeroPagina = numeroPagina;
        }
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
// genero el método toString

    @Override
    public String toString() {
        return "LibroElectronico{" + "identificador=" + identificador + ", nombreLibro=" + nombreLibro + ", paginasTotales=" + paginasTotales + ", tamanoLibro=" + tamanoLibro + ", numeroPagina=" + numeroPagina + '}';
    }

    //La diferencia publica o privada de los métodos es su posibe uso, si es privada solo
    //se pueden usar dentro del mismo paquete aun siendo del mismo proyecto y las publicas si se pueden 
    //usar dentro del mismo proyecto aunque no esten en el mismo paquete.
    // metodo público sumar pagina
    public void sumarPagina() {
        int sumarPagina = 0;
        if (sumarPagina < paginasTotales) {
            sumarPagina = numeroPagina + 1;
        }

    }

    public void retrocederPagina() {
        int retrodecederPagina = 0;
        if (retrodecederPagina > paginasTotales) {
            retrodecederPagina = numeroPagina - 1;
        }

    }

    public void saltarPagina(int numero) {
        int suma = numero + numeroPagina;
        if ((suma >= 1) && (suma <= paginasTotales)) {

        }
    }
}
