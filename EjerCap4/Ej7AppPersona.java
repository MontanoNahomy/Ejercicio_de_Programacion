package EjerCap4;
import java.util.Scanner;
public class Ej7AppPersona {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la dirección de la persona:");
        String dirección = scanner.nextLine();
        Ej7Persona persona = new Ej7Persona(nombre, dirección);

        System.out.println("Ingrese la carrera del estudiante:");
        String carrera = scanner.nextLine();
        System.out.println("Ingrese el semestre del estudiante:");
        int semestre = scanner.nextInt();
        Ej7Estudiante estudiante = new Ej7Estudiante(nombre, dirección, carrera, semestre);

        System.out.println("Ingrese el departamento del profesor:");
        scanner.nextLine(); // Limpiar el buffer del scanner
        String departamento = scanner.nextLine();
        System.out.println("Ingrese la categoría del profesor:");
        String categoría = scanner.nextLine();
        Ej7Profesor profesor = new Ej7Profesor(nombre, dirección, departamento, categoría);

        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Dirección: " + persona.getDirección());

        System.out.println("\nDatos del estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());

        System.out.println("\nDatos del profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoría());
    }
}
