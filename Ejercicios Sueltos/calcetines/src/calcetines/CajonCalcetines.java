/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcetines;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class CajonCalcetines {

    Random num = new Random();
   private int tamanio = num.nextInt(20 - 10 + 1) + 10;
    private ArrayList<Calcetin> cajon;
    private Calcetin calcetin;
    private Calcetin[] paresCalcetines;

    public CajonCalcetines() {

        this.cajon = new ArrayList<>();
    }

    public void rellenarCajon() {
        for (int i = 0; i < tamanio; i++) {
            Calcetin aux = new Calcetin();
            cajon.add(aux);

        }

        /*public Calcetin[] comparar(){
            int contador=0;
            for (int i = 0; i < cajon.size(); i++) {
                for (int j = 1; j < cajon.size(); j++) {
                    if(cajon.get(i).equals(cajon.get(j))){
                        contador++;
                        
                    }else
                        Calcetin[] desparejados= new Calcetin[](cajon.size());
                    
                }
                
            }
            
            
        }
        */
    }

    @Override
    public String toString() {
        return "CajonCalcetines{" + "num=" + num + ", tamanio=" + tamanio + ", cajon=" + cajon + ", calcetin=" + calcetin + '}';
    }

    public Random getNum() {
        return num;
    }

    public void setNum(Random num) {
        this.num = num;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Calcetin> getCajon() {
        return cajon;
    }

    public void setCajon(ArrayList<Calcetin> cajon) {
        this.cajon = cajon;
    }

    public Calcetin getCalcetin() {
        return calcetin;
    }

    public void setCalcetin(Calcetin calcetin) {
        this.calcetin = calcetin;
    }

}
