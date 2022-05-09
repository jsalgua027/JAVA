/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class Horario {
    private String curso;
    private String inicialesP;
    private String asignatura;
    private String aula;
    private int dia;
    private int hora;

    public Horario() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInicialesP() {
        return inicialesP;
    }

    public void setInicialesP(String inicialesP) {
        this.inicialesP = inicialesP;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return   curso + ";" + inicialesP + ";" + asignatura + ";" + aula + ";" + dia + ";" + hora ;
    }
    
    
    
    
    
}
