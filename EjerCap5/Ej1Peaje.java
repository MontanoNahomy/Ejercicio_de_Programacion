package EjerCap5;

import java.util.Vector;

public class Ej1Peaje {
	
	String nombre; 
	String departamento;
    Vector vehiculos;
    int totalPeaje= 0;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCarros = 0;

    public Ej1Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void anadirVehiculos(Ej1Vehículo vehiculo){
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Ej1Vehículo vehiculo){
        if (vehiculo instanceof Ej1Carro){
            totalCarros++;
            totalPeaje+= Ej1Carro.valorPeaje;
            return Ej1Carro.valorPeaje;
        }
        else if (vehiculo instanceof Ej1Moto){
            totalMotos++;
            totalPeaje += Ej1Moto.valorPeaje;
            return Ej1Moto.valorPeaje;
        }
        else if (vehiculo instanceof Ej1Camion){
            totalCamiones++;
            Ej1Camion camion = (Ej1Camion) vehiculo;
            totalPeaje += camion.numeroEjes * Ej1Camion.valorPeaje;
        }
        else
            return -1;
        return totalPeaje;
    }

    public void imprimir(){
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos ); 
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehículos = totalCarros + totalMotos +totalCamiones;
        System.out.println("Total de vehículos =  " + totalVehículos); 
        System.out.println("Dinero total = " + totalPeaje);

    }
}
