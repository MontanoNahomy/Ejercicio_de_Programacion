package EjerCap5;

public class Ej1Camion extends Ej1Vehículo{

	static int valorPeaje = 5000;
    int numeroEjes;

    public Ej1Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
    	Ej1Camion.valorPeaje = valorPeaje;
    }

    void imprimir() {
    	System.out.println("Placa = " + placa);
    	System.out.println("Número de ejes = " + numeroEjes);
    	System.out.println("Valor del peaje = " + valorPeaje);
    	}
}
