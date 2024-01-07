package EjerCap5;

import java.util.Vector;

public class Ej15AppArticulo {
	public static void main(String[] args) {
		// Crear un artículo
		Ej15Articulo articulo = new Ej15Articulo();

	    // Agregar secciones al artículo
		Ej15Seccion seccion1 = new Ej15Seccion();
	    seccion1.setTitulo("Resumen");
	    seccion1.agregarAutor("Nahomy Montaño");
	    articulo.agregarSeccion(seccion1);

	    Ej15Seccion seccion2 = new Ej15Seccion();
	    seccion2.setTitulo("Introducción");
	    seccion2.agregarAutor("Rosa Arboleda");
	    articulo.agregarSeccion(seccion2);

	    Ej15Subseccion subseccion = new Ej15Subseccion(1);
	    seccion2.agregarSubseccion(subseccion);

	    Ej15Parrafo parrafo = new Ej15Parrafo(10, 150);
	    subseccion.agregarParrafo(parrafo);

	    seccion1.agregarComentario(new Ej15Comentarios("El resumen cumple con requisitos solicitados"));

	    subseccion.agregarComentario(new Ej15Comentarios("Muy bien escrito, los argumentos son muy acertados"));

	    parrafo.agregarComentario(new Ej15Comentarios("Utilice menos palabras técnicas, para que sea fácil de comprender para el lector"));

	    articulo.setComentado("Puede ser publicado");

	    imprimirComentarios(articulo.getSecciones());

	    System.out.println("\nConcepto: " + articulo.getConcepto());
	}

	private static void imprimirComentarios(Vector<Ej15Seccion> secciones) {
	    if (secciones != null) {
	        for (Ej15Seccion seccion : secciones) {
	            System.out.println(seccion);
	            System.out.println("Comentarios de la sección:");
	            if (seccion.getComentarioVector() != null) {
	                for (Ej15Comentarios comentario : seccion.getComentarioVector()) {
	                    System.out.println(" * " + comentario.getTexto());
	                }
	            }

	            for (Ej15Subseccion subseccion : seccion.getSubsecciones()) {
	                System.out.println("Comentarios en la subsección:");
	                if (subseccion.getComentarioVector() != null) {
	                    for (Ej15Comentarios comentario : subseccion.getComentarioVector()) {
	                        System.out.println(" * " + comentario.getTexto());
	                    }
	                }
	                for (Ej15Parrafo parrafo : subseccion.getParrafos()) {
	                    System.out.println("Comentarios del párrafo:");
	                    if (parrafo.getComentarioVector() != null) {
	                        for (Ej15Comentarios comentario : parrafo.getComentarioVector()) {
	                            System.out.println(" * " + comentario.getTexto());
	                        }
	                    }
	                }
	            }
	            if (seccion.getSubsecciones() != null) {
	                for (Ej15Subseccion subseccion : seccion.getSubsecciones()) {
	                    imprimirComentarios(subseccion.getSecciones());
	                }
	             }
	          }
	      }
	   }
}
