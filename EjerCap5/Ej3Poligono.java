package EjerCap5;

import java.util.ArrayList;

public class Ej3Poligono {

	private String nombre;
    private ArrayList<Ej3Punto> puntos;

    public Ej3Poligono(String nombre, ArrayList<Ej3Punto> puntos) {
        if (puntos.size() < 3) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 puntos.");
        }
        this.nombre = nombre;
        this.puntos = puntos;
    }

    // Métodos de manipulación de puntos
    public void agregarPunto(Ej3Punto punto) {
        puntos.add(punto);
    }

    public void eliminarPunto(int indice) {
        if (indice >= 0 && indice < puntos.size()) {
            puntos.remove(indice);
        } else {
            throw new IllegalArgumentException("Índice de punto no válido.");
        }
    }

    // Otros métodos
    public int cantidadPuntos() {
        return puntos.size();
    }

    public void mostrarPuntos() {
        System.out.println("Puntos del polígono " + nombre + ":");
        for (Ej3Punto punto : puntos) {
            System.out.println("(" + punto.getX() + ", " + punto.getY() + ")");
        }
    }

    // Método para calcular el perímetro del polígono
    public double calcularPerimetro() {
        double perimetro = 0;
        for (int i = 0; i < puntos.size() - 1; i++) {
        	Ej3Recta segmento = new Ej3Recta(puntos.get(i), puntos.get(i + 1));
            perimetro += segmento.calcularLongitud();
        }
        Ej3Recta ultimoSegmento = new Ej3Recta(puntos.get(puntos.size() - 1), puntos.get(0));
        perimetro += ultimoSegmento.calcularLongitud();

        return perimetro;
    }

    // Método para calcular el área del polígono
    public double calcularArea() {
        double area = 0;
        int n = puntos.size();
        for (int i = 0; i < n; i++) {
            Ej3Punto puntoActual = puntos.get(i);
            Ej3Punto puntoSiguiente = puntos.get((i + 1) % n);
            area += puntoActual.getX() * puntoSiguiente.getY();
            area -= puntoSiguiente.getX() * puntoActual.getY();
        }
        area = Math.abs(area) / 2.0;
        return area;
    }
}
