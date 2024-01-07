package EjerCap4;

public class Ej16VehiculoAereo extends Ej16Vehiculo implements Ej16Reactor, Ej16Alas{

	public Ej16VehiculoAereo (int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    public void despegar() {
        System.out.println("Despegando...");
    }

    public void aterrizar() {
        System.out.println("Aterrizando...");
    }

    public void volar() {
        System.out.println("Volando...");
    }

    @Override
    public void encender() {
        System.out.println("Reactor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Reactor apagado");
    }

    @Override
    public void soltar() {
        System.out.println("Soltando tren de aterrizaje");
    }

    @Override
    public void subirTrenAterrizaje() {
        System.out.println("Subiendo tren de aterrizaje");
    }

	@Override
	public void acelerar(int velocidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar(int velocidad) {
		// TODO Auto-generated method stub
		
	}
}
