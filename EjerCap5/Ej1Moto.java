package EjerCap5;

public class Ej1Moto extends Ej1Vehículo{

	static int valorPeaje = 5000;

    public Ej1Moto(String placa) {
        super(placa);
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
    	Ej1Moto.valorPeaje = valorPeaje;
    }

    void imprimir() {
    	System.out.println("Placa = " + placa);
    	System.out.println("Valor del peaje = " + valorPeaje);
    }
}
