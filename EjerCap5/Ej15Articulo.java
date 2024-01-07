package EjerCap5;

import java.util.Vector;

public class Ej15Articulo {

	Vector<Ej15Seccion> secciones;
    String resumen, concepto;

    public void agregarResumen(Ej15Seccion resumen){
        secciones.add(resumen);
    }

    public Ej15Articulo() {
        this.secciones = new Vector<>();
    }

    public Vector<Ej15Seccion> getSecciones() {
        return secciones;
    }
    public void setComentado(String concepto) {
        this.concepto = concepto;
    }
    public String getConcepto() {
        return concepto;
    }


    public void agregarSeccion(Ej15Seccion seccion) {
        secciones.add(seccion);
    }

    public void setSecciones(Vector<Ej15Seccion> secciones) {
        this.secciones = secciones;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
