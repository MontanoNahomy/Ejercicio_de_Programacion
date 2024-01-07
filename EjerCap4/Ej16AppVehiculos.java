package EjerCap4;

public class Ej16AppVehiculos {

	public static void main(String args[]) {
		Ej16Terrestre camioneta = new Ej16Terrestre(100, 250);
		System.out.println("Camioneta");
		camioneta.imprimir();
		camioneta.acelerar(50);
		System.out.println("Nueva Velocidad actual= " + camioneta.
		velocidadActual);
		Ej16Acuatico motoAcuática = new Ej16Acuatico(50, 110);
		System.out.println("Moto acuática");
		motoAcuática.imprimir();
		System.out.println("Revoluciones del motor = " +
		motoAcuática.calcularRevolucionesMotor(1200, 2));
		motoAcuática.recomendarVelocidad(20);
		
		System.out.println("-----------------------------------------");
		 
	    Ej16VehiculoAereo avion = new Ej16VehiculoAereo(200, 500);
	        System.out.println("Avión");
	        avion.imprimir();
	        avion.despegar();
	        avion.encender();
	        avion.volar();
	        avion.aterrizar();
	        avion.subirTrenAterrizaje();
	        avion.apagar();
	    
	}
	
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 16 y 17
	 
	 Ej17:
	 Agregar a la solución anterior una clase denominada VehiculoAereo, la cual tiene los 
	 métodos despegar, aterrizar y volar que muestran en pantalla la acción que están realizando.
     Agregar también dos nuevas interfaces:
	 •	Reactor que representa un motor de reacción. Esta interfaz tiene dos métodos encender 
	    y apagar.
	 •	Alas que representa las alas de un vehículo aéreo. Dicha interfaz tiene dos métodos 
	    soltar y subir tren de aterrizaje.
	 La clase VehiculoAereo debe implementar estas interfaces. Los métodos encender y 
	 apagar de Reactor muestran en pantalla que el reactor está encendido y apagado, 
	 respectivamente. Los métodos soltar y subir tren de aterrizaje muestran en pantalla 
	 dichas acciones.
	 En la clase de Prueba instanciar un vehículo aéreo e invocar los métodos heredados 
	 e implementados.

	 
	 Resultado:
	 	Camioneta
		Velocidad actual = 100
		Velocidad máxima = 250
		Nueva Velocidad actual= 150
		Moto acuática
		Velocidad actual = 50
		Velocidad máxima = 110
		Revoluciones del motor = 2400
	 	-----------------------------------------
	 	Avión
		Velocidad actual = 200
		Velocidad máxima = 500
		Despegando...
		Reactor encendido
		Volando...
		Aterrizando...
		Subiendo tren de aterrizaje
		Reactor apagado
	*/
}
