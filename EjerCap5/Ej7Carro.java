package EjerCap5;

public class Ej7Carro {

	Ej7Motor motor; 
	Ej7Chasis chasis; 
	Ej7Llanta[] llantas;  
	Ej7Carrocería carrocería;
	Ej7Asiento asientoConductor;
    Ej7Asiento asientoAcompanante;
    Ej7Asiento asientoTrasero;
    Ej7ElementosSeguridad elementosSeguridad;
		
		public Ej7Carro(int volumen, Ej7tipoChasis claseChasis, String color,Ej7tipoCarrocería claseCarrocería,
			String marca, int diametro, int altura, int anchura, Ej7Asiento asientoConductor,
            Ej7Asiento asientoAcompanante, Ej7Asiento asientoTrasero, Ej7ElementosSeguridad elementosSeguridad) {
			motor = new Ej7Motor(volumen);
			chasis = new Ej7Chasis(claseChasis); 
			llantas = new Ej7Llanta[4];
			for (int i = 0; i < llantas.length; i++) {
				llantas[i] = new Ej7Llanta(marca,diametro,altura,anchura);
		    }
			carrocería = new Ej7Carrocería(color,claseCarrocería); 
			this.asientoConductor = asientoConductor;
	        this.asientoAcompanante = asientoAcompanante;
	        this.asientoTrasero = asientoTrasero;
	        this.elementosSeguridad = elementosSeguridad;
		}
		void imprimir() {
			System.out.println("Datos del Carro");
			System.out.println("Motor - Cilindros = " + motor.volumen);
			System.out.println("Chasis - Tipo = " + chasis.tipo);
			System.out.println("Carrocería - Tipo = " + carrocería.tipo + "Color =" + carrocería.color);
			System.out.println("Llantas - Cantidad = " + llantas.length);
			for (int i = 0; i < llantas.length; i++) {
				llantas[i].imprimir();
			}
			System.out.println("-----------------------------------------");
			System.out.println("\nComponentes adicionales:");
	        asientoConductor.imprimir();
	        asientoAcompanante.imprimir();
	        asientoTrasero.imprimir();
	        elementosSeguridad.imprimir();
			 
		}
	 
}
