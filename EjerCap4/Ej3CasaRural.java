package EjerCap4;

public class Ej3CasaRural extends Ej3Casa{

	// Atributo que identifica el valor por área para una casa rural
	protected static double valorArea = 1500000;
	/* Atributo que identifica la distancia a la que se encuentra la casa rural de la cabecera municipal */
	protected int distanciaCabera;
	// Atributo que identifica la altitud a la que se encuentra una casa rural
	protected int altitud;
	
	public Ej3CasaRural(int identificadorInmobiliario, int área, String
			dirección, int númeroHabitaciones, int númeroBaños, int
			númeroPisos, int distanciaCabera, int altitud) {
			// Invoca al constructor de la clase padre
			super(identificadorInmobiliario, área, dirección,
			númeroHabitaciones, númeroBaños, númeroPisos);
			this.distanciaCabera = distanciaCabera;
			this.altitud = altitud;
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Distancia la cabecera municipal = " +
		numeroHabitacion + " km.");
		System.out.println("Altitud sobre el nivel del mar = " + altitud +
		" metros.");
		System.out.println();
	}
	
}
