package EjerCap5;

public class Ej7AppCarro {

	public static void main(String args[]) {
		Ej7Asiento asientoConductor = new Ej7Asiento("Cuero", true);
        Ej7Asiento asientoAcompanante = new Ej7Asiento("Tela", false);
        Ej7Asiento asientoTrasero = new Ej7Asiento("Tela", true);

        Ej7ElementosSeguridad elementosSeguridad = new Ej7ElementosSeguridad(true, true);
        
		Ej7Carro carro = new Ej7Carro(2,Ej7tipoChasis.
		MONOCASCO,"Rojo",Ej7tipoCarrocería.TUBULAR,
		"Goodyear",25,20,15, asientoConductor, 
		asientoAcompanante, asientoTrasero, elementosSeguridad); 
		carro.imprimir();
	}
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 7 y 8
	 
	 Ej8:
	 Agregar otros componentes que tiene un carro como:
		o Los tres asientos: el asiento del conductor; el asiento del acompañante y el 
		  asiento trasero. Los asientos tienen atributos como el tipo de material y si 
		  tiene o no funda.
		o Agregar otros elementos de un carro. Por ejemplo, los que componen el full 
		  equipo como airbags, frenos ABS, vidrios eléctricos, espejos eléctricos, sunroof. 
		  Considerar los atributos que se estimen convenientes.

	 Resultado:
	 	Datos del Carro
		Motor - Cilindros = 2
		Chasis - Tipo = MONOCASCO
		Carrocería - Tipo = TUBULARColor =Rojo
		Llantas - Cantidad = 4
		Marca = Goodyear
		Diámetro del rin = 25
		Altura = 20
		Anchura = 15
		Marca = Goodyear
		Diámetro del rin = 25
		Altura = 20
		Anchura = 15
		Marca = Goodyear
		Diámetro del rin = 25
		Altura = 20
		Anchura = 15
		Marca = Goodyear
		Diámetro del rin = 25
		Altura = 20
		Anchura = 15
		
		-----------------------------------------
		
		Componentes adicionales:
		Asiento - Tipo de material: Cuero
		Asiento - Tiene funda: Sí
		Asiento - Tipo de material: Tela
		Asiento - Tiene funda: No
		Asiento - Tipo de material: Tela
		Asiento - Tiene funda: Sí
		Elementos de seguridad - Airbags: Sí
		Elementos de seguridad - Frenos ABS: Sí
	 
	*/
}
