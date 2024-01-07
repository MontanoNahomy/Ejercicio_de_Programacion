package EjerCap4;

public class Ej2Novela extends Ej2Libro{

	private String tipo;

    public Ej2Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tipo: " + tipo);
    }
}
