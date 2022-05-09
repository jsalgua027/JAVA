/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nacho
 */
public class Natacion extends JuegosOlimpicosVerano {

    private int participanes;
    private int distancia;
    private boolean piscinaMar;// true natacion en piscina cubierta , false en mar abierto

    public Natacion() {
    }

    public Natacion(int participanes, int distancia, boolean piscinaMar, String nombre, String año, String poblacion) {
        super(nombre, año, poblacion);
        this.participanes = participanes;
        this.distancia = distancia;
        this.piscinaMar = piscinaMar;
    }

    public int getParticipanes() {
        return participanes;
    }

    public void setParticipanes(int participanes) {
        this.participanes = participanes;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean getPiscinaMar() {
        return piscinaMar;
    }

    public void setPiscinaMar(boolean piscinaMar) {
        this.piscinaMar = piscinaMar;
    }

    // metodo polimorfico de la clase JuegosOlimpicos
    @Override
    public String tipoDeDeporte() {

        return "Es natacion";
    }
    //metodo propio de esta clase
    public int cuantosParticipantes() {

        return this.participanes;

    }

    @Override
    public String toString() {
        return super.toString() + "Natacion{" + "participanes=" + participanes + ", distancia=" + distancia + ", piscinaMar=" + piscinaMar + '}';
    }

    @Override
    public int hashCode() {
        //has mejorado con el super de la clase padre
        int hash = super.hashCode();
        hash = 59 * hash + this.participanes;
        hash = 59 * hash + this.distancia;
        hash = 59 * hash + (this.piscinaMar ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        //comprueba la clase super
        if(super.equals(obj)){
            return false;
        }
        final Natacion other = (Natacion) obj;
        if (this.participanes != other.participanes) {
            return false;
        }
        if (this.distancia != other.distancia) {
            return false;
        }
        return this.piscinaMar == other.piscinaMar;
    }
   

}
