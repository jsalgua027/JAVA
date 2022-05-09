/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tem4.diseno.clases.c.ej15;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author JoseIgnacio
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

//constructor predeterminado
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;

    }

    //constructor parametrizado
    public Fecha(int dia, int mes, int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {

            throw new IllegalArgumentException();

        }
    }

    public int getDia() {

        boolean fecha = true;

        return dia;
    }

    public void setDia(int dia) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (comprobarFecha(dia, mes, anio)) {
            this.mes = mes;
        }

    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.anio = anio;
        }
    }

    //metodo fecha correcta
    public boolean comprobarFecha(int dia, int mes, int anio) {
        boolean fecha = true;

        try {
            LocalDate.of(anio, mes , dia);
        } catch (IllegalArgumentException iae) {
            System.out.println("La fecha introducida es erronea");
            fecha = false;
        }
        return fecha;

    }

    //Dice si el año es bisiesto o no
    public boolean bisiesto() {
        boolean bisiesto = false;
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);

        if (fechaCompuesta.isLeapYear()) {
            bisiesto = true;
        }
        return bisiesto;
    }
    //Dice el número de días que tiene el mes 

    public int diaMes() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);

        int diasMensuales = fechaCompuesta.lengthOfMonth();

        return diasMensuales;
    }
    //Muestra la fecha en formato corto(x-x-x)

    public  String mostrarFechaCorta() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFomateada = fechaCompuesta.format(formato);
        System.out.println("La fecha corta es: " + fechaFomateada);
        return fechaFomateada;
    }
     public String mostraFechaLarga(){
         String configSistema = Locale.getDefault().getDisplayLanguage(Locale.ENGLISH);
         LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE");
         String fechaFormateada = fechaCompuesta.format(formato);
         System.out.println("La fecha larga es: "+ fechaFormateada);
         return fechaFormateada;
     
     }
    //Muestra el dia de la semana

    public  int diaSemana() {
        LocalDate fechaCompuesta =   LocalDate.of(anio, mes, dia);
        return fechaCompuesta.getDayOfWeek().getValue();
    }
    //Devuelve del nº de día entre una fecha y otra
    public  long diaEntreFechas(Fecha ini, Fecha fin) {
        //Pasamos el objeto fecha a LocalDate
        LocalDate inicio = LocalDate.of(ini.getAnio(), ini.getMes(), ini.getDia());
        LocalDate finalizar = LocalDate.of(fin.getAnio(), fin.getMes(), fin.getDia());

        //Restamos
        long resultado = ChronoUnit.DAYS.between(inicio, finalizar);
        System.out.println("el resultado es= "+resultado);
        //Devólvemos el resultado
        return resultado;
    }

    //Suma 1 día (va al día siguiente)
    public void siguiente() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate resultado = fechaCompuesta.plusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getDayOfMonth();
        this.anio = resultado.getDayOfYear();
    }

    //Resta un dia(va al día anterior)
    public void anterior() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate resultado = fechaCompuesta.minusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getDayOfMonth();
        this.anio = resultado.getDayOfYear();
    }

    //Copia la fecha en un objeto de tipo Fecha
    public Fecha copia() {
        Fecha resultado = new Fecha(dia, mes, anio);
        return resultado;
    }

    public static Fecha copia(Fecha aux) {
        Fecha nueva = new Fecha(aux.getDia(), aux.getMes(), aux.getAnio());

        return nueva;

    }

    //Compara dos fechas
    public boolean igual(Fecha fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        return fechaParametrizado.isEqual(fechaCompuesta);

    }

    public boolean menorFecha(Fecha fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());

        return fechaParametrizado.isBefore(fechaCompuesta);
    }

    public boolean mayorFecha(Fecha fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        return fechaParametrizado.isAfter(fechaCompuesta);

    }

}
