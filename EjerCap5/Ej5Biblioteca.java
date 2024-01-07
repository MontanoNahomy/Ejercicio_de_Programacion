package EjerCap5;

import java.util.Vector;

public class Ej5Biblioteca {

	String nombre;
    Vector<Ej5Publicacion> coleccionPublicaciones;

    Ej5Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionPublicaciones = new Vector<>();
    }

    void añadirPublicacion(Ej5Publicacion publicacion) {
        coleccionPublicaciones.add(publicacion);
    }

    void listarPublicaciones() {
        for (Ej5Publicacion publicacion : coleccionPublicaciones) {
            publicacion.imprimir();
        }
    }
}
