package EjerCap5;

public class Ej9Producto {

	private int identificador; 
	private String nombre; 
	private String descripción;
	private int precio; 
	
	public Ej9Producto(int identificador, String nombre, String descripción,
	int precio) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
	}
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String toString() {
		return "id = " + identificador + ", Nombre ="  + nombre + 
				",Descripción = " + descripción + ", Precio = $ " + precio;
	}
}
