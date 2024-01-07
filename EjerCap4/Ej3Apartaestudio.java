package EjerCap4;

public class Ej3Apartaestudio extends Ej3Apartamento{

	protected static double valorArea = 1500000;
	
	public Ej3Apartaestudio(int identificadorInmobiliario, int área, String
			dirección,
			int númeroHabitaciones, int númeroBaños) {
			// Invoca al constructor de la clase padre
			// Los apartaestudios tienen una sola habitación y un solo baño
			super(identificadorInmobiliario, área, dirección, 1, 1);
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println();
	}
}
