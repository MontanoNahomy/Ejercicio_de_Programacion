package EjerCap4;

public class Ej11AppFiguraGeometrica {

	public static void main(String[] args) {
		Ej11Circulo circulo = new Ej11Circulo(9);
        circulo.imprimir();
        
        System.out.println("-----------------------------------------");

        Ej11Rectangulo rectangulo = new Ej11Rectangulo(5, 9);
        rectangulo.imprimir();
        
        System.out.println("-----------------------------------------");

        Ej11Triangulo triangulo = new Ej11Triangulo(4,8);
        triangulo.imprimir();
        
        System.out.println("-----------------------------------------");
        
        Ej11TrianguloRectangulo trianguloRectangulo = new Ej11TrianguloRectangulo(9,10);
        trianguloRectangulo.imprimir();

    }
}
