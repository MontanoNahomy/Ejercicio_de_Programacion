package EjerCap4;

public class Ej4GatosPeloCorto extends Ej4Gato {
    private String raza;

    public Ej4GatosPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza = " + raza;
    }

}
