
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nacho
 *
 * A partir de una lista de empleados y un nombre, indique si hay algún empleado
 * con ese nombre. A partir de una lista de empleados y un nombre de
 * departamento, indique el número de empleados Coordinadores de ese
 * departamento. A partir de una lista de empleados y una letra del NIF (char),
 * obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos de
 * los empleados cuyo NIF contenga esa letra. A partir de una lista de empleados
 * y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa)
 * de todos los empleados cuya toma de posesión coincida con esa fecha.
 *
 *
 */
public class Utils {

    public static boolean seEncuentraEnLaLista(ArrayList<Profesores> aux, String nombre) {
        boolean resultado = false;

        for (Profesores profesores : aux) {
            if (profesores.getNombre().contains(nombre)) {
                return true;
            }

        }
        return false;

    }

    public static int cuantosHayEnLaLista(ArrayList<Profesores> aux, String nombreDepartamento) {
        //veo en la conddicion que se encuentre el mismo departamento y si es coordonador
        int cantidad = 0;
        for (Profesores profesores : aux) {
            if ((profesores.getPuesto().equalsIgnoreCase(nombreDepartamento) && profesores.isCoordinador() == true)) {
                cantidad ++;
            }
        }

        return cantidad;
    }

    public static ArrayList<String> listaApellidos(ArrayList<Profesores> lista, char letra) {
        //Creamos la lista que aguarda los resultados
        ArrayList<String> Nif = new ArrayList<>();

        //Recorremos la lista completa de profesores
        for (Profesores profesor : lista) {

            //Miramos si el dni de cada uno contiene la letra
            if (profesor.getDni().contains(String.valueOf(letra))) {
                //En caso afirmativo lo añade
                Nif.add(profesor.getNombre());

            }

        }

        Collections.sort(lista, (Profesores p1, Profesores p2) -> p1.getNombre().compareTo(p2.getNombre()));

        return Nif;

    }

//    A partir de una lista de empleados
// * y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa)
// * de todos los empleados cuya toma de posesión coincida con esa fecha.
    public static ArrayList<String> contieneNif(ArrayList<Profesores> lista, LocalDate fecha) {
        ArrayList<String> listaResultado = new ArrayList<>();
        // recorro la lista, si coincide la fecha de toma con la fecha que  meto el dni en la nueva lista
        for (Profesores profesor : lista) {
            if (profesor.getFechaTomaPosesion().equals(fecha)) {
                listaResultado.add(profesor.getDni());
            }
        }

        Collections.sort(listaResultado);
        //ordenar  inversa
        Collections.reverse(listaResultado);
        return listaResultado;

    }
}
