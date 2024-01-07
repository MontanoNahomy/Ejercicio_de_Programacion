package EjerCap5;

public class Ej7ElementosSeguridad {

	boolean airbags;
    boolean frenosABS;

    Ej7ElementosSeguridad(boolean airbags, boolean frenosABS) {
        this.airbags = airbags;
        this.frenosABS = frenosABS;
    }

    void imprimir() {
        System.out.println("Elementos de seguridad - Airbags: " + (airbags ? "Sí" : "No"));
        System.out.println("Elementos de seguridad - Frenos ABS: " + (frenosABS ? "Sí" : "No"));
    }
}
