package EjerCap5;

public class Ej5Publicacion {

	String nombre;
    int añoPublicacion;
    String editorial;

    Ej5Publicacion(String nombre, int añoPublicacion, String editorial) {
        this.nombre = nombre;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
    }

    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
    }
}
