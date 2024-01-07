package EjerCap5;

public class Ej3Círculo {

	Ej3Punto centro;
	int radio;
	
	public Ej3Círculo(int x, int y, int radio) {
		centro = new Ej3Punto(x,y); 
		this.radio = radio; 
	}
	int getRadio() {
		return radio;
	}
	void setRadio(int radio) {
		this.radio = radio;
	}
	void imprimir() {
		System.out.println("El centro del círculo es la coordenada (" +
		centro.getX() + " , " + centro.getY() + ") y tiene un radio = " +
		radio);
	}
	
}
