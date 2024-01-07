package EjerCap5;

public class Ej11Delantero extends Ej11Jugador{
	int golesAnotados;

    public Ej11Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    @Override
    public String toString() {
        return "Delantero{" +
                "Goles =" + golesAnotados +
                ", esTitular=" + esTitular +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                '}';
    }	
}
