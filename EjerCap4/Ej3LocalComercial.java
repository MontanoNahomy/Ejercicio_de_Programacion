package EjerCap4;

public class Ej3LocalComercial extends Ej3Local{

	protected static double valorArea = 3000000;
	protected String centroComercial;
	
	public Ej3LocalComercial(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, String centroComercial) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, tipoLocal);
		this.centroComercial = centroComercial;
	}
			/**
			* Método que muestra en pantalla los datos de un local comercial
			*/
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Centro comercial = " + centroComercial);
		System.out.println();
	}
}
