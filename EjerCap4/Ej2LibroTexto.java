package EjerCap4;

public class Ej2LibroTexto extends Ej2Libro{

	private String curso;

    public Ej2LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Curso: " + curso);
    }
}
