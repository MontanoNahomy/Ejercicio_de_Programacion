package EjerCap4;

public class Ej3Casa  extends Ej3InmuebleVivienda{

	protected int númeroPisos; /* Atributo que identica el número de pisos que tiene una casa */
	
	public Ej3Casa(int identificadorInmobiliario, int área, String dirección,
			int númeroHabitaciones, int númeroBaños, int númeroPisos) {
			// Invoca al constructor de la clase padre
			super(identificadorInmobiliario, área, dirección,
			númeroHabitaciones, númeroBaños);
			this.númeroPisos = númeroPisos;
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Número de pisos = " + númeroPisos);
	}
	
}
