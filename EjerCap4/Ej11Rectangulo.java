package EjerCap4;

public class Ej11Rectangulo extends Ej11FiguraGeometrica{

	public double base, altura;

    public Ej11Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaFigura() {
        return base * altura;
    }

    @Override
    public double perimetroFigura() {
        return (2*base) + (2*altura);
    }

    public void imprimir(){
        System.out.println("Área del rectángulo: " + areaFigura());
        System.out.println("Perímetro del rectángulo " + perimetroFigura());
    }
}
