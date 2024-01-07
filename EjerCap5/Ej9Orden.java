package EjerCap5;

import java.util.Vector;

public class Ej9Orden {
	
	private int identificador;
	private Vector itemsPedido;
	private Ej9Cliente cliente;
	
	public Ej9Orden(int identificador) {
		this.identificador = identificador;
		itemsPedido = new Vector();
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int calcularTotalOrden() {
	int totalOrden = 0;
	for(int i = 0; i < itemsPedido.size(); i++) { 
		Ej9LíneaPedido línea = (Ej9LíneaPedido) itemsPedido.elementAt(i);
		totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
	}
		return totalOrden;
	}
	public String toString() {
		return "Orden [id = " + identificador +"]\n" + "Items del pedido\n"
		+ itemsPedido +
		"\nTotal orden = $" + calcularTotalOrden()+"\n";
	}
	public void añadirItem(int identificador, int cantidad, Ej9Producto producto) {
		Ej9LíneaPedido línea= new Ej9LíneaPedido(identificador, cantidad,
			producto);
			itemsPedido.add(línea); 
	}
	 public Ej9Orden(int identificador, Ej9Cliente cliente) {
	        this.identificador = identificador;
	        itemsPedido = new Vector();
	        this.cliente = cliente;
     }
     public Ej9Cliente getCliente() {
	        return cliente;
	 }

	 public void setCliente(Ej9Cliente cliente) {
	        this.cliente = cliente;
	 }
}
