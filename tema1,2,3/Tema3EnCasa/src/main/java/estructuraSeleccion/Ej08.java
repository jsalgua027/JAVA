/*
 * EJERCICIO 8. Realiza el siguiente programa
 */
package estructuraSeleccion;

//Public class curso
public class Ej08 {

    public static void main(String[] args) {
        //declaro variable char porque es un caracter
        char departamento = 'B';

        switch (departamento) {//open switch

            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
                break;

            default:
                System.out.println("Departamento no válido");
                //faltaria el break; de default
                break; //duda porque si necesita el break al final te da el mismo resultado?
        }//close switch

        //imprime resultado
        System.out.println("Código para el departamento es:  ");
        System.out.println(departamento);

    }

}
