package EjerCap5;

public abstract class Ej11Jugador extends Ej11Persona{

	boolean esTitular;

    public Ej11Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }

	public boolean isEsTitular() {
		return esTitular;
	}

	public void setEsTitular(boolean esTitular) {
		this.esTitular = esTitular;
	}

    
}
