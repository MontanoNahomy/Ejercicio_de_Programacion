package EjerCap4;

public class Ej11Cuadrado extends Ej11FiguraGeometrica{

	public double lado;

    public Ej11Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double areaFigura() {
        return lado*lado;
    }

    @Override
    public double perimetroFigura() {
        return (4*lado);
    }
}
