package EjerCap5;

import java.util.Vector;

public class Ej13AppMunicipio {
	public static void main(String[] args) {

		Ej13Municipio municipio1 = new Ej13Municipio("Manizales", 400000, 17, 2200, 1.00);
		Ej13Municipio municipio2 = new Ej13Municipio("La Dorada", 98000, 28, 1000, 2);
		Ej13Municipio municipio3 = new Ej13Municipio("Neira", 30000, 20, 1969, 0.85);

	    Vector municipioss = new Vector();
	    municipioss.add(municipio1);
	    municipioss.add(municipio2);
	    municipioss.add(municipio3);

	    Ej13Departamento departamento = new Ej13Departamento("Caldas", municipioss);
	    
        System.out.println("El censo del Departamento de Caldas es: " + departamento.getNombre() + " es: " + departamento.calcularPoblacion());
        System.out.println("Municipios con mayor población a 50.000" );
        departamento.buscarMunicipioPoblMayor(50000);
	    System.out.println("Búsqueda de municipio de Manizales: ");
        departamento.buscarMunicipio("Manizales");
	}
}

