package EjerCap5;

public class Ej3Recta {

	private Ej3Punto punto1;
    private Ej3Punto punto2;

    public Ej3Recta(Ej3Punto punto1, Ej3Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double calcularPendiente() {
        // Calcular pendiente
        return (punto2.getY() - punto1.getY()) / (double) (punto2.getX() - punto1.getX());
    }

    public double calcularLongitud() {
        // Calcular longitud
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
}
