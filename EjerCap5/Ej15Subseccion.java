package EjerCap5;

import java.util.Vector;

public class Ej15Subseccion extends Ej15Evaluacion{
	int id;
    Vector<Ej15Seccion> secciones;
    Vector<Ej15Parrafo> parrafos;
    public Ej15Subseccion(int id) {
        this.id = id;
        this.parrafos = new Vector<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Subseccion:" +
                "id=" + id ;
    }

    public boolean esSubseccion() {
        return true;
    }

    public void agregarParrafo(Ej15Parrafo parrafo) {
        parrafos.add(parrafo);
    }
    public Vector<Ej15Parrafo> getParrafos() {
        return parrafos;
    }


    public Vector<Ej15Seccion> getSecciones() {
        return secciones;
    }
}
