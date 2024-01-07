package EjerCap5;

public class Ej13Municipio {

	 String nombre;
	    int poblacion;
	    double temperatura, altitud, latitud;

	    public Ej13Municipio(String nombre, int poblacion, double temperatura, double altitud, double latitud) {
	        this.nombre = nombre;
	        this.poblacion = poblacion;
	        this.temperatura = temperatura;
	        this.altitud = altitud;
	        this.latitud = latitud;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getPoblacion() {
	        return poblacion;
	    }

	    public void setPoblacion(int poblacion) {
	        this.poblacion = poblacion;
	    }

	    public double getTemperatura() {
	        return temperatura;
	    }

	    public void setTemperatura(double temperatura) {
	        this.temperatura = temperatura;
	    }

	    public double getAltitud() {
	        return altitud;
	    }

	    public void setAltitud(double altitud) {
	        this.altitud = altitud;
	    }

	    public double getLatitud() {
	        return latitud;
	    }

	    public void setLatitud(double latitud) {
	        this.latitud = latitud;
	    }

	    public void imprimir(){
	        System.out.println("Nombre = " + nombre + "\nPoblación = " + poblacion + "\nTemperatura promedio (C) = " + temperatura + "\nAltitud = " + altitud + "\nLatitud = " + latitud);
	    }
}
