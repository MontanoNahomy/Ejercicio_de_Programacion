package EjerCap4;

public class Ej3Local extends Ej3Inmueble {

	enum tipo {INTERNO,CALLE}; // Tipo de inmueble especificado como un valor enumerado 
	protected tipo tipoLocal; // Atributo que identifica el tipo de inmueble 
	
	public Ej3Local(int identificadorInmobiliario, int área, String dirección,
			tipo tipoLocal) {
			// Invoca al constructor de la clase padre
			super(identificadorInmobiliario, área, dirección);
			this.tipoLocal = tipoLocal;
	}
	
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Tipo de local = " + tipoLocal);
	}
}
