package EjerCap5;

import java.util.ArrayList;

public class Ej3AppCirculo {
	
	public static void main(String args[]) {
        Ej3Círculo círculo1 = new Ej3Círculo(2, 3, 5);
        círculo1.imprimir();
        
        System.out.println("-----------------------------------------");
        
        // Crear dos puntos para la recta
        Ej3Punto punto1 = new Ej3Punto(8, 2);
        Ej3Punto punto2 = new Ej3Punto(4, 1);

        // Crear una instancia de Recta con los dos puntos
        Ej3Recta recta = new Ej3Recta(punto1, punto2);

        // Calcular y mostrar la pendiente de la recta
        double pendiente = recta.calcularPendiente();
        System.out.println("La pendiente de la recta es: " + pendiente);

        // Calcular y mostrar la longitud de la recta
        double longitud = recta.calcularLongitud();
        System.out.println("La longitud de la recta es: " + longitud);
        
        System.out.println("-----------------------------------------");
        
        // Crear puntos
        Ej3Punto p1 = new Ej3Punto(2, 6);
        Ej3Punto p2 = new Ej3Punto(3, 5);
        Ej3Punto p3 = new Ej3Punto(3, 4);

        // Crear polígono con los puntos
        ArrayList<Ej3Punto> puntosPoligono = new ArrayList<>();
        puntosPoligono.add(p1);
        puntosPoligono.add(p2);
        puntosPoligono.add(p3);

        Ej3Poligono poligono = new Ej3Poligono("[Rectángulo]", puntosPoligono);

        // Mostrar puntos del polígono
        poligono.mostrarPuntos();

        // Calcular y mostrar perímetro del polígono
        double perimetro = poligono.calcularPerimetro();
        System.out.println("Perímetro del polígono: " + perimetro);

        // Calcular y mostrar área del polígono
        double area = poligono.calcularArea();
        System.out.println("Área del polígono: " + area);
    }
	
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 3 y 4
	 
	 Ej4:
	 Modificar el programa anterior para incluir las siguientes clases:
		o	Una clase Recta que contenga exactamente 2 puntos. Se debe definir los siguientes métodos para dicha clase:
			•	Un método que calcule la pendiente de la recta.
			•	Un método que calcule la longitud de la recta.
		o	Una clase Polígono que tenga un nombre y este conformada por mínimo 3 puntos. El orden de los puntos se tiene en cuenta en la especificación del polígono.


	 Resultado:
	 	El centro del círculo es la coordenada (2 , 3) y tiene un radio = 5
		-----------------------------------------
		La pendiente de la recta es: 0.25
		La longitud de la recta es: 4.123105625617661
		-----------------------------------------
		Puntos del polígono [Rectángulo]:
		(2, 6)
		(3, 5)
		(3, 4)
		Perímetro del polígono: 4.650281539872885
		Área del polígono: 0.5
	 
	*/
	
}
