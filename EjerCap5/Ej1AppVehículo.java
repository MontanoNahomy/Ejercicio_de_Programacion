package EjerCap5;

public class Ej1AppVehículo {

	public static void main(String[] args) {
		Ej1Peaje peaje = new Ej1Peaje("La lizana" , "Santander");
		Ej1Camion camion1 = new Ej1Camion("PKI-889", 2);
        peaje.anadirVehiculos(camion1);
        peaje.calcularPeaje(camion1);
        Ej1Camion camion2 = new Ej1Camion("KLM-123", 3);
        peaje.anadirVehiculos(camion2);
        peaje.calcularPeaje(camion2);
        Ej1Camion camion3 = new Ej1Camion("PQI-234", 4);
        peaje.anadirVehiculos(camion3);
        peaje.calcularPeaje(camion3);
        Ej1Moto moto1 = new Ej1Moto("ABC-123");
        peaje.anadirVehiculos(moto1);
        peaje.calcularPeaje(moto1);
        Ej1Moto moto2 = new Ej1Moto("XYZ-000");
        peaje.anadirVehiculos(moto2);
        peaje.calcularPeaje(moto2);
        Ej1Carro carro1 = new Ej1Carro("WVC-389");
        peaje.anadirVehiculos(carro1);
        peaje.calcularPeaje(carro1);
        Ej1Carro carro2 = new Ej1Carro("QWE-543");
        peaje.anadirVehiculos(carro2);
        peaje.calcularPeaje(carro2);
        peaje.imprimir();

        System.out.println("-----------------------------------------");
        
        Ej1Persona persona = new Ej1Persona("Nahomy ", "Montaño", "28/11/2004", "0850299702");
        persona.asignarVehiculo(carro1);
        System.out.println("El total del peaje de " + persona.nombre + "es de : " + persona.calcularPeajePersona());

    }
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 1 y 2
	 
	 Ej2:
	 Modificar el ejercicio anterior para modelar que una persona conduce un vehículo. 
	 La persona tiene los siguientes atributos: nombre, apellidos, número de documento 
	 de identidad y fecha de nacimiento. Se requieren métodos para:
		• Asignar un vehículo a una persona. Se debe tener en cuenta que una persona 
		  puede tener asignado varios vehículos de diferente tipo.
		• Desasignar un vehículo a una persona. Previamente, es necesario verificar 
		  que la persona tiene un vehículo asignado.
		• Al dar el nombre de una persona, se debe generar el total de dinero pagado 
		  en peajes por cada vehículo que esta persona tenga asignado.

	 Resultado:
	 	Peaje = La lizana
		Ubicación = Santander
		Total de carros = 2
		Total de motos = 2
		Total de camiones = 3
		Total de vehículos =  7
		Dinero total = 75000
		-----------------------------------------
		El total del peaje de Nahomy es de : 10000
	 
	*/
	
}
