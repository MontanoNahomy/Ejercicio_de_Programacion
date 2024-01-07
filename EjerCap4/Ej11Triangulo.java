package EjerCap4;

public class Ej11Triangulo extends Ej11FiguraGeometrica{

	public double base, altura;

    public Ej11Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double areaFigura() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetroFigura() {
        return base + base + base;
    }

    public void imprimir(){
        System.out.println("Área del triángulo: " + areaFigura()); 
        System.out.println("Perímetro del triángulo: " + perimetroFigura());
    }
}
