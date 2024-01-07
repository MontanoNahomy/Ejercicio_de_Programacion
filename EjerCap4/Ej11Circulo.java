package EjerCap4;

public class Ej11Circulo {

	public double radio;

    public Ej11Circulo(double radio) {
        this.radio = radio;
    }

    
    public double areaFigura() {
        return Math.PI*(Math.pow(radio,2));
    }

    
    public double perimetroFigura() {
        return 2*Math.PI*radio;
    }

    public void imprimir(){
        System.out.println("Área del circulo: " + areaFigura());
        System.out.println("Perímetro del círculo : " + perimetroFigura());
    }
}
