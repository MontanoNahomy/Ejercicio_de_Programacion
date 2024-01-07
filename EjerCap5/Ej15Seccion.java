package EjerCap5;

import java.util.Vector;

public class Ej15Seccion extends Ej15Evaluacion{
	String titulo;
    Vector<String> autor;
    Vector<Ej15Subseccion> subsecciones;
    Vector<Ej15Parrafo> parrafos;

    public Ej15Seccion() {
        this.autor = new Vector<>();
        this.subsecciones = new Vector<>();
        this.parrafos = new Vector<>();
    }

    public void agregarAutor(String nombreAutor) {
        autor.add(nombreAutor);
    }

    public void agregarSubseccion(Ej15Subseccion subseccion) {
        subsecciones.add(subseccion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Vector<String> getAutor() {
        return autor;
    }

    public void setAutor(Vector<String> autor) {
        this.autor = autor;
    }
    public Vector<Ej15Subseccion> getSubsecciones() {
        return subsecciones;
    }
    public boolean esSubseccion() {
        return false;
    }

    @Override
    public String toString() {
        return "Seccion =  " +
                "Título = " + titulo +
                ", Autor =" + autor;
    }

    public Vector<Ej15Parrafo> getParrafos() {
        return parrafos;
    }
}
