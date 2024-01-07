package EjerCap5;

public class Ej11MedioCampo extends Ej11Jugador{

	int numeroAsistencias;

    public Ej11MedioCampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencias) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
		return "Mediocampo{" +
                "Asistencias =" + numeroAsistencias +
                ", esTitular=" + esTitular +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                '}';
    }
}
