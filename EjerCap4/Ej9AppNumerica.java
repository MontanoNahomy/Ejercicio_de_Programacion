package EjerCap4;

public class Ej9AppNumerica {

	public static void main(String[] args) {
		
		Ej9Fraccion fraccion1 = new Ej9Fraccion(2,4);
		Ej9Fraccion fraccion2 = new Ej9Fraccion(6,8);
		Ej9Fraccion fraccion3 = new Ej9Fraccion(10,12);
		
        System.out.println("Fracción 1: " + fraccion1.toString());
        System.out.println("Fracción 2: " + fraccion2.toString());
        System.out.println("Fracción 3: " + fraccion3.toString());
        
        System.out.println("-----------------------------------------");
        
        System.out.println("+ : " + fraccion1.sumar(fraccion2).toString());
        System.out.println("÷ : " + fraccion1.dividir(fraccion2).toString());
        System.out.println("- : " + fraccion1.restar(fraccion2).toString());
        System.out.println("x : " + fraccion1.multiplicar(fraccion2).toString());
        
    }
}
