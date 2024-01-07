package EjerCap5;

public class Ej9LíneaPedido {

	private int identificador; 
	private int cantidad;
	private Ej9Producto producto; 
	
	public Ej9LíneaPedido(int identificador, int cantidad, Ej9Producto
			producto) {
			this.identificador = identificador;
			this.cantidad = cantidad;
			this.producto = producto;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Ej9Producto getProducto() {
		return producto;
	}
	public void setProducto(Ej9Producto producto) {
		this.producto = producto;
	}
	public int calcularSubtotalLíneaPedido() {
		return cantidad * producto.getPrecio();
	}
	public String toString() {
		return "Línea de Pedido [id = " + identificador + ", Cantidad = " +
				cantidad + ", Producto =" + producto + "]\n";
	}
	
}
