package EjerCap4;

public class Ej4Perro extends Ej4Mascota {
	    private double peso;
	    private boolean muerde;

	    public Ej4Perro(String nombre, int edad, String color, double peso, boolean muerde) {
	        super(nombre, edad, color);
	        this.peso = peso;
	        this.muerde = muerde;
	    }

	    // Getters y setters

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public boolean isMuerde() {
	        return muerde;
	    }

	    public void setMuerde(boolean muerde) {
	        this.muerde = muerde;
	    }

	    public static void sonido() {
	        System.out.println("Los perros ladran");
	    }

	    @Override
	    public String toString() {
	        return "Perro: " +
	                "Nombre = " + getNombre() +
	                ", Edad = " + getEdad() +
	                ", Color = " + getColor() +
	                ", Peso = " + peso +
	                ", ¿Muerde? = " + muerde;
	    }

}
