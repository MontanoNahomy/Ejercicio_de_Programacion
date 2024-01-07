package EjerCap4;

public class Ej3CasaIndependiente  extends Ej3CasaUrbana {
	
	protected static double valorArea = 3000000;

	public Ej3CasaIndependiente(int identificadorInmobiliario, int área,
		String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección,
		númeroHabitaciones, númeroBaños, númeroPisos);
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println();
	}
}
