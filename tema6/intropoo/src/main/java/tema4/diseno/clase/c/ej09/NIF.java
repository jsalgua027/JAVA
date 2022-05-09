/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clase.c.ej09;

/**
 *
 * @author nacho
 */
public class NIF {

    private String numDNI;
    private char letraDNI;
    private static int contador;

    public NIF(String numDNI) {
        this.numDNI = numDNI;

        if (numDNI.length() == 8) {
            this.letraDNI = Dni(numDNI);
        } else {
            contador++;
            System.out.println("El numero tiene que tener mínimo 8 dígitos");
        }
        
    }

    public char Dni(String numDnI) {
        char letra = 'A';
        switch (Integer.parseInt(numDnI) % 23) {

            case 0:
                letra = 'T';
                break;

            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'G';
                break;
            case 4:
                letra = 'A';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;

        }

        return letra;
    }

    public String getNumDNI() {
        return numDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    public int getContador() {
        return contador;
    }

    public String ToString() {
        return numDNI + "-" + Dni(numDNI);

    }

}
