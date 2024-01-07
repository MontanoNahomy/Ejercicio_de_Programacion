package EjerCap4;

public class Ej3Apartamento  extends Ej3InmuebleVivienda{

	public Ej3Apartamento(int identificadorInmobiliario, int área, String
			dirección, int númeroHabitaciones, int númeroBaños) {
			// Invoca al constructor de la clase padre
			super(identificadorInmobiliario, área, dirección,
			númeroHabitaciones, númeroBaños);
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
	}
	
	
}
