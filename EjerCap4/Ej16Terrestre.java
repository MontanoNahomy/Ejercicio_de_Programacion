package EjerCap4;

public class Ej16Terrestre extends Ej16Vehiculo implements Ej16Motor{

	Ej16Terrestre(int velocidadActual, int velocidadMáxima) {
		super(velocidadActual, velocidadMáxima);
	}
	
	public void acelerar(int velocidad) {
		int vel = velocidadActual + velocidad;
		if (vel > velocidadMáxima){
			System.out.println("Supera la velocidad máxima permitida");
		} else { 
			velocidadActual = vel;
		}
	}
	
	public void frenar(int velocidad) {
		int vel = velocidadActual - velocidad;
		if (vel < 0) { 
			System.out.println("La velocidad no puede ser negativa");
		} else { 
			velocidadActual = vel;
		}
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza*radio);
	}
}
