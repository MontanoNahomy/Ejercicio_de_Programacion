package EjerCap4;

public class Ej6ProfesorTitular  extends Ej6Profesores {
		
	int aniosProf = 0;

    public void imprimir(){
        System.out.println("Es un profesor titular");
    }

    public void imprimirAnios(){
        System.out.println("Edad: " + aniosProf);
    }
}
