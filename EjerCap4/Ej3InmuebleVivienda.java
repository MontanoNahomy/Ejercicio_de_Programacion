package EjerCap4;

public class Ej3InmuebleVivienda extends Ej3Inmueble {

	public int numeroHabitacion, numeroBanios;

    public Ej3InmuebleVivienda (int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitacion = numeroHabitacion;
        this.numeroBanios = numeroBanios;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: " + numeroHabitacion );
        System.out.println("Número de baños: " + numeroBanios);
    }
}
