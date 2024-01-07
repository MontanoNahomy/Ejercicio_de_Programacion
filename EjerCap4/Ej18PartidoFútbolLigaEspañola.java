package EjerCap4;

public class Ej18PartidoFútbolLigaEspañola  implements Ej18PartidoFutbol{

	String equipoLocal;
	String equipoVisitante;
	int golesEquipoLocal;
	int golesEquipoVisitante;
	
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal = nombreEquipo;
	}
	
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante = nombreEquipo;
	}
	
	public void setGolesEquipoLocal(int marcador) {
		this.golesEquipoLocal = marcador;
	}
	
	public void setGolesEquipoVisitante(int marcador) {
		this.golesEquipoVisitante = marcador;
	}
	
	void imprimirMarcador() {
		System.out.println("Equipo local: " + equipoLocal +  " : " +
		golesEquipoLocal + " - Equipo visitante: " + equipoVisitante +
		" : " + golesEquipoVisitante);
	}
}
