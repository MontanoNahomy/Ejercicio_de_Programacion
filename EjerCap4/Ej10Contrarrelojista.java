package EjerCap4;

public class Ej10Contrarrelojista  extends Ej10Ciclista {

	private double velocidadMáxima;
	
	public Ej10Contrarrelojista(int identificador, String nombre, double
		velocidadMáxima) {
		super(identificador, nombre);
	    this.velocidadMáxima = velocidadMáxima;
	}
	
	protected double getVelocidadMáxima() {
		return velocidadMáxima;
	}
	
	protected void setVelocidadMáxima(double velocidadMáxima) {
		this.velocidadMáxima = velocidadMáxima;
	}
	
	protected void imprimir() {
		super.imprimir(); 
		System.out.println("Aceleración promedio = " +
		velocidadMáxima);
	}
	protected String imprimirTipo() {
		return "Es un constrarrelojista";
	}
}
