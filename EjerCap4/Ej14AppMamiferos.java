package EjerCap4;

public class Ej14AppMamiferos {

	public static void main(String args[]) {
		Ej14Ballena mobyDick = new Ej14Ballena(); 
		mobyDick.amamantarCrías();
		
		Ej14Ornitorrinco ornitorrinco1 = new Ej14Ornitorrinco();
		ornitorrinco1.amamantarCrías(); 
		ornitorrinco1.ponerHuevos();
		
	    System.out.println("-----------------------------------------");
		   
		Ej14Murcielago murcielago1 = new Ej14Murcielago();
	    murcielago1.amamantarCrias();
	    murcielago1.volar();
	    
	    }
	
	
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 14 y 15
	 
	 Ej15:
	 Agregar a la solución anterior una nueva interfaz denominada Volador que representa un 
	 animal que vuela. Dicha interfaz tiene un o volar que muestra en pantalla que un animal vuela. 
	 Además, agregar una nueva subclase de Mamífero llamada Murciélago que a su vez implementa 
	 la clase Volador. En la clase Prueba instanciar un murciélago e invocar los métodos heredados 
	 e implementados.
	 
	 
	 Resultado:
	 	La ballena amamanta a sus crías.
		El ornitorrinco amamanta a sus crías.
		El ornitorrinco pone huevos.
		-----------------------------------------
		El murciélago amamanta a sus crías.
		El murciélago vuela.
	 
	*/
}


