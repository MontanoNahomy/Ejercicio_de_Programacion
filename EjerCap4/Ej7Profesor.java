package EjerCap4;


public class Ej7Profesor extends Ej7Persona {
	private String departamento;
    private String categoría;

    public Ej7Profesor(String nombre, String dirección, String departamento, String categoría) {
        super(nombre, dirección);
        this.departamento = departamento;
        this.categoría = categoría;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCategoría() {
        return categoría;
    }

}
