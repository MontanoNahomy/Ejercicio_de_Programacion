package EjerCap4;

public class Ej7Estudiante extends Ej7Persona {
	private String carrera;
    private int semestre;

    public Ej7Estudiante(String nombre, String dirección, String carrera, int semestre) {
        super(nombre, dirección);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }	
}
