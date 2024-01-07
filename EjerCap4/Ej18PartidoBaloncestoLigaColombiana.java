package EjerCap4;

public class Ej18PartidoBaloncestoLigaColombiana implements Ej18PartidoBaloncesto {

	    String equipoLocal;
	    String equipoVisitante;
	    int cestasEquipoLocal;
	    int cestasEquipoVisitante;

	    public void setEquipoLocal(String nombreEquipo) {
	        this.equipoLocal = nombreEquipo;
	    }

	    public void setEquipoVisitante(String nombreEquipo) {
	        this.equipoVisitante = nombreEquipo;
	    }

	    public void setCestasEquipoLocal(int marcador) {
	        this.cestasEquipoLocal = marcador;
	    }

	    public void setCestasEquipoVisitante(int marcador) {
	        this.cestasEquipoVisitante = marcador;
	    }

	    void imprimirMarcador() {
	        System.out.println("Equipo local: " + equipoLocal + " : " +
	                cestasEquipoLocal + " - Equipo visitante: " + equipoVisitante +
	                " : " + cestasEquipoVisitante);
	    }
	
}
