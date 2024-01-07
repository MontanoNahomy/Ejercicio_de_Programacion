package EjerCap5;

public class Ej5Revista extends Ej5Publicacion {

	    String periodicidad;
	    String pais;

	    Ej5Revista(String nombre, int añoPublicacion, String editorial, String periodicidad, String pais) {
	        super(nombre, añoPublicacion, editorial);
	        this.periodicidad = periodicidad;
	        this.pais = pais;
	    }

	    @Override
	    void imprimir() {
	        super.imprimir();
	        System.out.println("Periodicidad: " + periodicidad);
	        System.out.println("País: " + pais);
	        System.out.println();
	    }
}
