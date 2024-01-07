package EjerCap4;

public class Ej2LibroTextoUnc extends Ej2LibroTexto {

	private String facultad;

    public Ej2LibroTextoUnc(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Facultad: " + facultad);
    }
}
