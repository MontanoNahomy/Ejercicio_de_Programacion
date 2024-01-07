package EjerCap4;

import java.util.Scanner;
import java.util.Vector;


public class Ej10Equipo {

	private String nombre; 
	private static double totalTiempo; 
	private String pais; 
	Vector listaCiclistas; 
	
	public Ej10Equipo(String nombre, String país) {
	this.nombre = nombre;
	this.pais = país;
	totalTiempo = 0; 
	listaCiclistas = new Vector();
	}
	
	public String getNombre() {
		return nombre;
	}
		
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	private String getPaís() {
		return pais;
	}
		
	private void setPaís(String pais) {
		this.pais = pais;
	}
		
	void añadirCiclista(Ej10Ciclista ciclista) {
		listaCiclistas.add(ciclista); 
	}
	
	void listarEquipo() {
		
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ej10Ciclista c = (Ej10Ciclista) listaCiclistas.elementAt(i); 
		   System.out.println(c.getNombre());
		  }
		}
		
		void buscarCiclista() {
		Scanner sc = new Scanner(System.in);
		String nombreCiclista = sc.next();
		for (int i = 0; i < listaCiclistas.size(); i++) { 
			Ej10Ciclista c = (Ej10Ciclista) listaCiclistas.elementAt(i); 
		if (c.getNombre().equals(nombreCiclista)) { 
		    System.out.println(c.getNombre());
		  }
		 }
		}
		
		void calcularTotalTiempo() {
		for (int i = 0; i < listaCiclistas.size(); i++) { 
			Ej10Ciclista c = (Ej10Ciclista) listaCiclistas.elementAt(i); 
			totalTiempo = totalTiempo + c.getTiempoAcumulado();
		  }
	    }
		
		void imprimir() {
			System.out.println("Nombre del equipo = " + nombre);
			System.out.println("País = " + pais);
			System.out.println("Total tiempo del equipo = " + totalTiempo);
		}
}
