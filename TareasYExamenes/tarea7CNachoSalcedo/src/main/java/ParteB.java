
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class ParteB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fichero a leer
        String idFichero = "hor_curso_1920_final.csv";

        // variables para guardar datos a leer
        List<Horario> listaHorarios = new ArrayList<>();
        String[] tokens;
        String linea;

        // muestro por consola el fichero a leer
        System.out.println("Leyendo el fichero: " + idFichero);

        // inicializo el flujo de lectura en funcion del idFichero
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            // datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                // el metodo replaceAll quita el caracter que (yo quiera y despues lo que quieres dejar) en este caso barra invertida porque es una comilla
                linea = linea.replaceAll("\"", "");
                linea = linea.trim();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");

                Horario p1 = new Horario();
                p1.setCurso(tokens[1].trim());
                p1.setInicialesP(tokens[2].trim());
                p1.setAsignatura(tokens[3].trim());
                //p1.setAula(tokens[4]);
                if (tokens[4].replaceAll(" ", "").equals("")) {
                    p1.setAula("\"");
                } else {
                    p1.setAula(tokens[4].replaceAll(" ", ""));
                }

                p1.setDia(Integer.valueOf(tokens[5].trim()));
                p1.setHora(Integer.valueOf(tokens[6].trim()));

                listaHorarios.add(p1);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /*
        a) Obtener todos los registros de 1ESOA que no son de la asignatura MUS.
        b) Contar las horas que se imparten de la asignatura PROGR
        c) Obtener una lista con las iniciales del profesorado que imparte la asignatura REL,
        ordenadas en orden inverso al orden alfabético.
        d) Obtener en una lista las aulas donde imparte clase el profesor "JFV"
        e) Contar el número de asignaturas distintas que hay
        f) Contar el total de horas que se imparten a última hora de la mañana.
        g) Mostrar por consola los profesores que tienen clase a primera hora de la mañana.
         */
        System.out.println("----------------------------EJERCICIO A-------------------------------");
        //A
        listaHorarios.stream()
                .filter(h -> h.getCurso().equalsIgnoreCase("1ESOA") && !h.getAsignatura().equalsIgnoreCase("MUS"))
                .forEach(System.out::println);

        System.out.println("----------------------------EJERCICIO B-------------------------------");
        //B
        long horas = listaHorarios.stream()
                .filter(h -> h.getAsignatura().equalsIgnoreCase("PROGR"))
                .count();
        System.out.println(horas);
        System.out.println("----------------------------EJERCICIO C-------------------------------");
        //C
        List<String> nueva = listaHorarios.stream()
                .filter(h -> h.getAsignatura().equalsIgnoreCase("REL"))
                .map(h -> h.getInicialesP())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(nueva);
        System.out.println("----------------------------EJERCICIO D-------------------------------");
        //D
        List<String> nueva1 = listaHorarios.stream()
                .filter(h -> h.getInicialesP().equalsIgnoreCase("JFV"))
                .map(h -> h.getAula())
                .distinct()
                .collect(Collectors.toList());
          System.out.println(nueva1);
        System.out.println("----------------------------EJERCICIO E-------------------------------");
        //E
        long asignaturas = listaHorarios.stream()
                .map(h -> h.getAsignatura())
                .distinct()
                .count();
        System.out.println(asignaturas);
        System.out.println("----------------------------EJERCICIO F-------------------------------");
        //F 
        long horas2 = listaHorarios.stream()
                .filter(h -> h.getHora() == 7)
                .count();
        System.out.println(horas);
        System.out.println("----------------------------EJERCICIO G-------------------------------");
        //G
        listaHorarios.stream()
                .filter(h -> h.getHora() == 1)
                .map(h -> h.getInicialesP())
                .distinct()
                .forEach(System.out::println);

    }

}
