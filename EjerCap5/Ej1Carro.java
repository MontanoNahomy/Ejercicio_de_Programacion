package EjerCap5;

public class Ej1Carro extends Ej1Vehículo{

	static int valorPeaje = 10000;

    public Ej1Carro(String placa) {
        super(placa);
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
    	Ej1Carro.valorPeaje = valorPeaje;
    }

    void imprimir() {
    	System.out.println("Placa = " + placa);
    	System.out.println("Valor del peaje = " + valorPeaje);
    }
}
