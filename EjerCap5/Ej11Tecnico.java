package EjerCap5;

public class Ej11Tecnico extends Ej11Persona {
    int aniosExperiencia;
    boolean esNacional;
    public Ej11Tecnico(String nombre, String apellidos, int edad, int aniosExperiencia, boolean esNacional) {
        super(nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.esNacional = esNacional;
    }

    @Override
    public String toString() {
    	return "Tecnico{" +
                "Años de Experiencia =" + aniosExperiencia +
                ", esNacional=" + esNacional +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                '}';

    }
}
