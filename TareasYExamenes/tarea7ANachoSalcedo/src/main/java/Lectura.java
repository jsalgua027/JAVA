
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fichero a leer
        String idFichero = "RelPerCen.csv";

        // variables para guardar datos a leer
        ArrayList<Profesores> listaProfesores = new ArrayList<>();
        String[] tokens;
        String linea;
        // creo el map para la segunda fase del ejercicio
        Map<String, Integer> cantidadProfesoresDepartamento = new HashMap<>();
        // muestro por consola el fichero a leer
        System.out.println("Leyendo el fichero: " + idFichero);

        // inicializo el flujo de lectura en funcion del idFichero
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                // el metodo replaceAll quita el caracter que (yo quiera y despues lo que quieres dejar) en este caso barra invertida porque es una comilla
                linea = linea.replaceAll("\"", "");

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");
                // imprimo cada linea 
                System.out.println(linea + "\t");

                Profesores p1 = new Profesores();
                p1.setApellidos(tokens[0]);
                p1.setNombre(tokens[1]);
                p1.setDni(tokens[2]);
                p1.setPuesto(tokens[3]);
                //todo lo que recibimos es tipo string entonces lo trasformamos a Localdate 
                //!!!!OJO tenemos que decirle al LocalDate como va a recibir el formato del tiempo
                //!!!OJO en el documento el string tiene comillas el parse da error para ello hemos usado el replaceAll de la linea 47
                p1.setFechaTomaPosesion(LocalDate.parse(tokens[4], DateTimeFormatter.ofPattern("d/MM/yyyy")));
                //!!OJO si nos encontramos campos vacios nos da error, para trabajar eso usmos esta condicion 
                if (tokens[5].equalsIgnoreCase("")) { // el método equals reconoce el espacio, si queremos un campo en blaco las comillas juntas
                    p1.setFechaCese(null);
                } else {
                    p1.setFechaCese(LocalDate.parse(tokens[5], DateTimeFormatter.ofPattern("d/MM/yyyy")));
                }
                // recibimos un string pero el atributo de la POJO(profesores) es un boolean para ello usamos la condicion 
                p1.setTelefono(tokens[6]);
                if (tokens[7].equalsIgnoreCase("si")) {
                    p1.setEvaluador(true);
                } else {
                    p1.setEvaluador(false);

                }
                if (tokens[8].equalsIgnoreCase("si")) {
                    p1.setCoordinador(true);
                } else {
                    p1.setCoordinador(false);

                }

                listaProfesores.add(p1);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // imprimo el arrayList de profesores
        for (Profesores listaP : listaProfesores) {
            System.out.println(listaP.toString());
        }
        // en este for metemos en el map los puestos, si creamos una variable para que si se encuentra el mismo puesto 
        // le haga una suma pq sino machacaria el valor y solo nos apareceria un profesor por puesto
        for (Profesores profe : listaProfesores) {
            if (cantidadProfesoresDepartamento.containsKey(profe.getPuesto())) {
                int control = cantidadProfesoresDepartamento.get(profe.getPuesto());
                cantidadProfesoresDepartamento.put(profe.getPuesto(), control + 1);
            } else {
                cantidadProfesoresDepartamento.put(profe.getPuesto(), 1);
            }

        }
        // comienzo la escritura 

        String idFichero2 = "profesoresPorDepartamento.csv";

        //     Map<String, Integer>cantidadProfesoresDepartamento = new HashMap<>();
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {
            for (Map.Entry<String, Integer> entry : cantidadProfesoresDepartamento.entrySet()) {

                flujo.write( entry.getKey()+"\t"  + entry.getValue()+"\t" + " profesores");
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*Guarda en otro fichero CSV los registros de aquellos empleados que 
        hayan trabajado más de 100 días en el curso 20/21. Ten en cuenta que si 
        la fecha de cese está vacía significa que el empleado está en servicio 
        activo.*/
        System.out.println("\n\nEMPLEADOS CON MÁS DE 100 DÍAS TRABAJADOS:\n");

        //Llama al método descrito al final
        ArrayList<Profesores> empMasDe100 = empleadoMasDeDias(listaProfesores, 100l);

        //Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        idFichero = "empleadosMasDe100Dias.csv";

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            //Cabecera
            flujo.write("NOMBRE\tDNI/PASAPORTE\tPUESTO\tFECHA DE TOMA\tFECHA DE CESE\tTELÉFONO\tEVALUADOR\tCOORDINADOR");

            flujo.newLine();

            for (Profesores e : empMasDe100) { //Para cada elemento

                flujo.write(e.toString());

                flujo.newLine();

                System.out.println(e); //Imprime para comprobar
            }

            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }

        System.out.println(
                "----------------------------uso de metodos--------------");

        // creo un objeto de la clase Utils para usar los metodos
        Utils metodosUtiles = new Utils();

        System.out.println(
                " ----------------------metodo si esta por nombre-------------");
        System.out.println(metodosUtiles.seEncuentraEnLaLista(listaProfesores, "Cristina"));

        System.out.println(
                "-----------------metodo que indica cuantos profesores hay por departamento que sean coordinadores---");
        int resultado = metodosUtiles.cuantosHayEnLaLista(listaProfesores, "Informática P.E.S");

        System.out.println(resultado);

        System.out.println(
                "---------------metodo que devulve una lista ordenada de los dnis ordenado de forma inversa-----");

        //Lista para los profesores con cierta letra en su dni
        ArrayList<String> listaProDni = new ArrayList<>();
        //Lista que guarda a los que han tenido la fecha de toma en ese tiempo
        ArrayList<String> listaFechaToma = new ArrayList<>();

        //Metemos en la lista el ArrayList resultante del método el cual mira la fecha y devuelve el dni
        listaProDni = Utils.contieneNif(listaProfesores, LocalDate.of(2020, Month.SEPTEMBER, 1));

        System.out.println(
                "\nLos trabajadores cuya toma de posesión es el día 01/09/2020 tienen el dni: \n");

        //Recorremos la lista y la mostramos por pantalla
        for (String profesor : listaProDni) {
            System.out.println(profesor.toString());

        }
        
        
        System.out.println("-----------------------------métodos apiStream----------------");
        
        //A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
        
        boolean siSeEncuentra = listaProfesores.stream()
                .anyMatch(p -> p.getNombre().equalsIgnoreCase("Juan"));
        System.out.println(siSeEncuentra);
        
        
        //A partir de una lista de empleados y un nombre de departamento, 
        //indique el número de empleados Coordinadores de ese departamento.
        
        long cuantosHay = listaProfesores.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase("juan"))
                .count();
        System.out.println(cuantosHay);
        
        //A partir de una lista de empleados y una letra del NIF (char),
        //obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos
        //de los empleados cuyo NIF contenga esa letra.
            List<Profesores> listaDni= listaProfesores.stream()
        
                
                .filter(p -> p.getDni().contains("A"))
                .sorted((p1, p2)-> p1.getApellidos().compareTo(p2.getApellidos()))
                .collect(Collectors.toList());
                
                       
         // A partir de una lista de empleados y una fecha, obtener una nueva lista con los NIF
          //  (ordenados de forma inversa) de todos los empleados cuya toma de posesión coincida con esa fecha.      
        
           List<Profesores> listaFecha= (List<Profesores>)listaProfesores.stream()
                   .filter((p -> p.getFechaTomaPosesion().equals(LocalDate.of(2002, Month.MARCH, 15))))
                   .map(p -> p.getDni())
                   .sorted(Collections.reverseOrder());
           
                   
                           
                           
                   
                           
                   
                   
                   
                   
             
        

    }

    // metodos para poder hacer la escritura  de los cien dias
    /*Dada una lista de empleados y una cantidad de días trabajados, devuelve 
    una lista de los que superan esa cantidad de días*/
    public static ArrayList<Profesores> empleadoMasDeDias(ArrayList<Profesores> lista, long dias) {

        ArrayList<Profesores> empleadosMasDeDias = new ArrayList<>();

        for (Profesores e : lista) {

            //Si el número de dáis trabajados es mayor
            if (numeroDiasTrabajados(e) > dias) {

                empleadosMasDeDias.add(e); //Lo añade a la lista que devuelve
            }
        }
        return empleadosMasDeDias;
    }

    //Dado un trabajador, devuelve el número de días que lleva trabajados
    public static long numeroDiasTrabajados(Profesores e) {

        if (e.getFechaCese() != null) { //Si tiene fecha de cese

            //Devuelve la diferencia en días de la fecha de inicio a la de cese
            return ChronoUnit.DAYS.between(e.getFechaTomaPosesion(), e.getFechaCese());

        } else { //Si sigue trabajando (la fecha de cese es null)

            //Devuelve el número de días trabajados hasta hoy
            return ChronoUnit.DAYS.between(e.getFechaTomaPosesion(), LocalDate.now());
        }
    }

}
