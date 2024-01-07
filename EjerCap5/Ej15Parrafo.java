package EjerCap5;

public class Ej15Parrafo extends Ej15Evaluacion{
	int cantidadLineas, cantidadPalabras;

    public Ej15Parrafo(int cantidadLineas, int cantidadPalabras) {
        this.cantidadLineas = cantidadLineas;
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadLineas() {
        return cantidadLineas;
    }

    public void setCantidadLineas(int cantidadLineas) {
        this.cantidadLineas = cantidadLineas;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    @Override
    public String toString() {
        return "Parrafo: " +
                "Cantidad de Líneas =" + cantidadLineas +
                ", Cantidad de Palabras =" + cantidadPalabras;
    }
}
