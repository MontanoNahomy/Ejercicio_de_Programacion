package EjerCap4;

public class Ej3Oficina extends Ej3Local{

	protected static double valorArea = 3500000;
	protected boolean esGobierno;
	
	
	public Ej3Oficina(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, boolean esGobierno) {
	// Invoca al constructor de la clase padre
	super(identificadorInmobiliario, área, dirección, tipoLocal);
	this.esGobierno = esGobierno;
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Es oficina gubernamental = " + esGobierno);
		System.out.println();
	}
}
