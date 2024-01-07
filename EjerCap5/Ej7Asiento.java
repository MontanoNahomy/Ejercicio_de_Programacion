package EjerCap5;

public class Ej7Asiento {

	String tipoMaterial;
    boolean tieneFunda;

    Ej7Asiento(String tipoMaterial, boolean tieneFunda) {
        this.tipoMaterial = tipoMaterial;
        this.tieneFunda = tieneFunda;
    }

    void imprimir() {
        System.out.println("Asiento - Tipo de material: " + tipoMaterial);
        System.out.println("Asiento - Tiene funda: " + (tieneFunda ? "Sí" : "No"));
    }
}
