package EjerCap4;

import java.util.Vector;

public class Ej6AppProfesores {

	Vector profesores;
    public static void main(String[] args) {


        Ej6Profesores profesor = new Ej6ProfesorTitular();
        Ej6Profesores profeosr2 = (Ej6Profesores) profesor;
        profeosr2.imprimir();

        Ej6AppProfesores appProfesor = new Ej6AppProfesores();
        appProfesor.profesores = new Vector();
        Ej6Profesores profesor1 = new Ej6Profesores();
        Ej6ProfesorTitular profesorTitular = new Ej6ProfesorTitular();
        appProfesor.profesores.add(profesor1);
        appProfesor.profesores.add(profesorTitular);
        
        System.out.println("-----------------------------------------");

        for (int k = 0; k<appProfesor.profesores.size(); k++){
        	Ej6Profesores p = (Ej6Profesores) appProfesor.profesores.elementAt(k);
            p.imprimir(); 
        }
    }   
}
