package EjerCap5;


public class Ej11Defensa extends Ej11Jugador{

	public Ej11Defensa(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad, esTitular);
    }

    @Override
    public String toString() {
        return "Defensa{" +
                "esTitular=" + esTitular +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                '}';
    }

}
