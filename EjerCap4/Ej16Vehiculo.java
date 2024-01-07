package EjerCap4;

public abstract class Ej16Vehiculo {

	int velocidadActual; 
	int velocidadMáxima; 
	Ej16Vehiculo(int velocidadActual, int velocidadMáxima) {
	this.velocidadActual = velocidadActual;
	this.velocidadMáxima = velocidadMáxima;
	
	}
	
	void imprimir() {
		System.out.println("Velocidad actual = " + velocidadActual);
		System.out.println("Velocidad máxima = " + velocidadMáxima);
	}
	
	public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
}


