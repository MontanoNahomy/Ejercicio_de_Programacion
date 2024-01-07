package EjerCap4;

public class Ej18AppDeportes {

	public static void main(String args[]) {
		Ej18PartidoFútbolLigaEspañola partido = new Ej18PartidoFútbolLigaEspañola();
		System.out.println("Duración del partido = " + Ej18PartidoFútbolLigaEspañola.duraciónPartidoFútbol);
		partido.setEquipoLocal("Real Madrid");
		partido.setEquipoVisitante("Barcelona");
		partido.setGolesEquipoLocal(3);
		partido.setGolesEquipoVisitante(3);
		partido.imprimirMarcador();
		
		System.out.println("-----------------------------------------");
		
		Ej18PartidoBaloncestoLigaColombiana partidoBaloncesto = new Ej18PartidoBaloncestoLigaColombiana();
		System.out.println("Duración del partido = " + Ej18PartidoBaloncestoLigaColombiana.duraciónPartidoBaloncesto);
        partidoBaloncesto.setEquipoLocal("Lakers");
        partidoBaloncesto.setEquipoVisitante("Heat");
        partidoBaloncesto.setCestasEquipoLocal(80);
        partidoBaloncesto.setCestasEquipoVisitante(75);
        partidoBaloncesto.imprimirMarcador();
	}
	
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 18 y 19
	 
	 Ej19: 
	 Agregar a la solución anterior, una clase PartidoBaloncestoLigaColombiana con nuevos 
	 métodos, que implementen los métodos requeridos por la interfaz PartidoBaloncesto. 
	 Modificar la clase de Prueba para instanciar un objeto de dicho tipo.
	 
	 Resultado:
	 	Duración del partido = 90
        Equipo local: Real Madrid : 3 - Equipo visitante: Barcelona : 3
		-----------------------------------------
		Duración del partido = 40
		Equipo local: Lakers : 80 - Equipo visitante: Heat : 75
	*/
	   
}
