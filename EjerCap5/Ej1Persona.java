package EjerCap5;

import java.util.Vector;

public class Ej1Persona {

	String nombre, apellido, fechaNac, cedula;
    Vector<Ej1Vehículo> personas;

    public Ej1Persona(String nombre, String apellido, String fechaNac, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.cedula = cedula;
        this.personas = new Vector<>();
    }

    public void asignarVehiculo(Ej1Vehículo vehiculo){
        personas.add(vehiculo);
    }
    public void quitarVehiculo(Ej1Vehículo vehiculo){
        personas.remove(vehiculo);
    }

    public int calcularPeajePersona(){
        int totalPeaje = 0;
        for (Ej1Vehículo vehiculo: personas){
            if (vehiculo instanceof Ej1Carro){
                totalPeaje= Ej1Carro.getValorPeaje();
            }
            else if (vehiculo instanceof Ej1Camion){
                totalPeaje= Ej1Camion.getValorPeaje();
            }
            else if (vehiculo instanceof Ej1Moto){
                totalPeaje= Ej1Moto.getValorPeaje();
            }
        }
        return totalPeaje;
    }
    
}
