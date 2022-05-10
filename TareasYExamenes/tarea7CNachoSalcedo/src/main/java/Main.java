
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
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

        // imprimo el arrayList de profesores
        for (Horario listaP : listaHorarios) {
            System.out.println(listaP.toString());
        }

        System.out.println("--------------------------ORDENAR POR HORAS  Y DIAS  -----------------------------------");

        // ordeno la lista por horas
        listaHorarios.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getDia(), p2.getDia()))
                .sorted((p1, p2) -> Integer.compare(p1.getHora(), p2.getHora()))
                //  .collect(Collectors.toList())// para cabiarle el tipo de estructura por si el arralist principal no me sirve y necesito pasarlo a List
                .forEach(System.out::println);
        System.out.println("-------------------------------ORDENA ALFABETICAMENTE LA LISTA SET--------------------");
        Set<String> listaIniciales = new TreeSet<>();// tipo TreeSet ordena la lista directamente
        for (Horario hor : listaHorarios) {
            listaIniciales.add(hor.getInicialesP());

        }
        listaIniciales.forEach(System.out::println);

        System.out.println("----------------------------------ORDENO POR ALULAS OTRA LISTA SET-----------------------------");

        Set<String> listaGrupo = new TreeSet<>();
        for (Horario listaGrupos : listaHorarios) {
            listaGrupo.add(listaGrupos.getCurso());
        }
        listaGrupo.forEach(System.out::println);

        /*
            Cuando toda la información esté en las estructuras de datos, la aplicación proporciona dos opciones:
            a) Consultar horarios por profesor/a.
            b) Consultar horarios por grupo.
        
        Si el usuario selecciona a), el programa mostrará las iniciales del profesorado,
        para que el usuario elija una. Una vez proporcionada la inicial por parte del usuario,
        el programa guardará en un fichero json, en la raíz del proyecto, el horario seleccionado, 
        si existe, volcando el objeto POJO en el archivo, al igual que hicimos con el ejercicio de las app. 
        El nombre del fichero estará compuesto por las iniciales del profesor en cuestión y la extensión del archivo.
        Por ejemplo, para el profesor JCF, el archivo se llamará JCF.json. 

        Si el usuario selecciona b), el programa mostrará los grupos que hay en el instituto,
        para que el usuario elija uno. Una vez proporcionado el grupo, el programa guardará en un fichero csv,
        en la raíz del proyecto, el horario seleccionado, si existe. 
        El nombre del fichero estará compuesto por las iniciales del grupo en cuestión y la extensión del archivo.
        Por ejemplo, para el grupo 1DAW, el archivo se llamará 1DAW.csv.
    
         */
        System.out.println("------------------------------------------PARTE A---------------------------------------------");
        Scanner datos = new Scanner(System.in);

        System.out.println("Inserte 1, 2 o 3 dependiendo de la opción:"
                + "\n1.Iniciales del profesorado"
                + "\n2.Grupos"
                + "\n3.Salir");

        int opciones = datos.nextInt();

        switch (opciones) {

            case 1:
                listaIniciales.forEach(System.out::println);
                datos.nextLine();
                System.out.println("Escribe las iniciales del profesor");
                String eleccion = datos.nextLine();
                ArrayList<Horario> guardadoJSO = new ArrayList<>();// array para guardar el jso
                String idficheroJSO= eleccion+".json";
                for (Horario pro : listaHorarios) {
                    if (pro.getInicialesP().equals(eleccion)) {
                           guardadoJSO.add(pro);
                       
                       
                    }
                }
                     ObjectMapper mapeador = new ObjectMapper();

                        // Permite a mapeador usar fechas según java time
                        mapeador.registerModule(new JavaTimeModule());

                        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
                        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

                        // Escribe en un fichero JSON el catálogo de muebles
                        mapeador.writeValue(new File(idficheroJSO ), guardadoJSO);
                break;
            case 2:
                listaGrupo.forEach(System.out::println);
                  ArrayList<Horario> guardadoCSV = new ArrayList<>();// array para guardar el CSV
                datos.nextLine();
                System.out.println("Escribe el curso a buscar");
                String eleccion2 = datos.nextLine();
                for (Horario pro2 : listaHorarios) {
                    if (pro2.getCurso().equals(eleccion2)) {
                      guardadoCSV.add(pro2);
                    }

                }  String idFicheroT = "Curso.csv";
                        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroT))) {

                            for (Horario t : guardadoCSV) {

                                flujo.write(t.toString());

                                flujo.newLine();
                            }

                            // Metodo flush() guarda cambios en disco 
                            flujo.flush();

                        } catch (IOException ioe) {

                            System.out.println(ioe.getMessage());
                        }
                // System.out.println("El Alula no exite");
                break;
            case 3:
                System.out.println("Hasta la próxima.");
                break;
            default:
                System.out.println("Introduzca 1 o 2 por favor");
        }

    }
}
