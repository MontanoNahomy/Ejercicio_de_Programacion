package EjerCap5;

public class Ej5Libro extends Ej5Publicacion{

	String autor;
    String referenciaBibliografica;

    Ej5Libro(String titulo, String autor, int añoPublicacion, String editorial, String referenciaBibliografica) {
        super(titulo, añoPublicacion, editorial);
        this.autor = autor;
        this.referenciaBibliografica = referenciaBibliografica;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Autor: " + autor);
        System.out.println("Referencia bibliográfica: " + referenciaBibliografica);
        System.out.println();
    }
}
