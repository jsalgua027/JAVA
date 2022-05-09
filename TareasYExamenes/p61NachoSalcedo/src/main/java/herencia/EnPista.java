/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nacho
 */
public  class EnPista extends JuegosOlimpicosVerano {

    protected int participantes;
    protected boolean obsatculos; //true si
    protected int distancia;

    public EnPista() {
    }

    public EnPista(int participantes, boolean obsatculos, int distancia, String nombre, String año, String poblacion) {
        super(nombre, año, poblacion);
        this.participantes = participantes;
        this.obsatculos = obsatculos;
        this.distancia = distancia;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public boolean isObsatculos() {
        return obsatculos;
    }

    public void setObsatculos(boolean obsatculos) {
        this.obsatculos = obsatculos;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    //metodo sobreescrito de la super clase
    @Override
    public String tipoDeDeporte() {

        return "Carreras en pista";

    }
    // metodo propio
    public  String Carrera(){
    
    return this.poblacion;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "EnPista{" + "participantes=" + participantes + ", obsatculos=" + obsatculos + ", distancia=" + distancia + '}';
    }

}
