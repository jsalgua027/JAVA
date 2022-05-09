/*
Ejemplo pagina 9 temario. 
 */
package athome.tema3encasa;

/**
 *
 * @author Victoria
 */
public class practicaEstructuraSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cotizacion = 150; //Un valor cualquiera
        char categoriaProfesional;

        if (cotizacion < 80) {
            categoriaProfesional = 'C';
        } //fin if1
        else {
            if (cotizacion < 120) {
                categoriaProfesional = 'B';
            } //fin if 2
            else {
                categoriaProfesional = 'A';
            }//fin else2
        }//fin else1
        System.out.println("Cotización de " + cotizacion + " euros, ");
        System.out.println("Corresponde a la categoría " + categoriaProfesional + "  de  ");

        switch (categoriaProfesional) {
            case 'A':
                System.out.println("Socio");
                break;

            case 'B':
                System.out.println("Consultor Senior");
                break;

            case 'C':
                System.out.println("Consultor Junior");
                break;
            
            default:
                System.out.println("Indefinida");
                break;
                

        }

    }
}
