package EjerCap5;

public class Ej5AppBiblioteca {

	public static void main(String args[]) {
		Ej5Biblioteca biblioteca1 = new Ej5Biblioteca("Biblioteca Nacional");

        // Agregar libros
        Ej5Libro libro1 = new Ej5Libro("Cien años de soledad", "Gabriel García Márquez", 1967,"Sudamericana","858.67/M566");
        biblioteca1.añadirPublicacion(libro1);

        Ej5Libro libro2 = new Ej5Libro("Rayuela","Julio Cortázar",1963,"Sudamericana","863.55/J667");
        biblioteca1.añadirPublicacion(libro2);

        Ej5Libro libro3 = new Ej5Libro("La tía julia y el escribidor","Mario Vargas Llosa", 1977,"Seix Barral","868.23/L567");
        biblioteca1.añadirPublicacion(libro3);

        // Agregar revistas
        Ej5Revista revista1 = new Ej5Revista("National Geographic", 2023, "National Geographic Society",
        		"Mensual", "Estados Unidos");
        biblioteca1.añadirPublicacion(revista1);

        Ej5Revista revista2 = new Ej5Revista("Time", 2022, "Time USA, LLC", "Semanal", "Estados Unidos");
        biblioteca1.añadirPublicacion(revista2);

        // Listar todas las publicaciones en la biblioteca
        biblioteca1.listarPublicaciones();
        
	}
	
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 5 y 6
	 
	 Ej6:
	 	Modificar el programa anterior para que soporte que la biblioteca también pueda contener una colección de revistas. Las revistas
		contienen los siguientes atributos: nombre de la revista, año de
		publicación, periodicidad, editorial y país. Las clases Libro y Revista deben ser subclases de una clase denominada Publicación,
		la cual debe contener atributos compartidos entre las dos clases.
		Agregar métodos a la clase biblioteca para que se puedan agregar
		y listar revistas.


	 Resultado:
	 	Nombre: Cien años de soledad
		Año de publicación: 1967
		Editorial: Sudamericana
		Autor: Gabriel García Márquez
		Referencia bibliográfica: 858.67/M566
		
		Nombre: Rayuela
		Año de publicación: 1963
		Editorial: Sudamericana
		Autor: Julio Cortázar
		Referencia bibliográfica: 863.55/J667
		
		Nombre: La tía julia y el escribidor
		Año de publicación: 1977
		Editorial: Seix Barral
		Autor: Mario Vargas Llosa
		Referencia bibliográfica: 868.23/L567
		
		-----------------------------------------
		
		Nombre: National Geographic
		Año de publicación: 2023
		Editorial: National Geographic Society
		Periodicidad: Mensual
		País: Estados Unidos
		
		Nombre: Time
		Año de publicación: 2022
		Editorial: Time USA, LLC
		Periodicidad: Semanal
		País: Estados Unidos
		
	 
	*/
}
