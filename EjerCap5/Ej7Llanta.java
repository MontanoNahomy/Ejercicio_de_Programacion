package EjerCap5;

public class Ej7Llanta {

	String marca; 
	int diametroRin; 
	int altura; 
	int anchura;
	
	Ej7Llanta(String marca, int diametroRin, int altura, int anchura) {
		this.marca = marca;
		this.diametroRin = diametroRin;
		this.altura = altura;
		this.anchura = anchura;
	}
	
	void imprimir() {
		System.out.println("Marca = " + marca);
		System.out.println("Diámetro del rin = " + diametroRin);
		System.out.println("Altura = " + altura);
		System.out.println("Anchura = " + anchura);
	}
}
