package EjerCap4;

public class Ej4PerrosGrandes extends Ej4Perro {
    private String raza;

    public Ej4PerrosGrandes(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza = " + raza;
    }

}
