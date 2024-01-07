package EjerCap4;

public class Ej9Fraccion extends Ej9Numerica{

	private int numerador;
    private int denominador;

    public Ej9Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Ej9Fraccion otraFracción = (Ej9Fraccion) ob;
        return numerador == otraFracción.numerador && denominador == otraFracción.denominador;
    }

    @Override
    public Ej9Numerica sumar(Ej9Numerica numero) {
    	if (numero instanceof Ej9Fraccion) {
    		Ej9Fraccion num = (Ej9Fraccion) numero;
            return new Ej9Fraccion(this.numerador * num.denominador + num.numerador * this.denominador, this.denominador * num.denominador);
        }
    	else{
            System.out.println("Deben ser igual");
        }
        return numero;
    
    }

    @Override
    public Ej9Numerica restar(Ej9Numerica numero) {
    	if (numero instanceof Ej9Fraccion) {
    		Ej9Fraccion num = (Ej9Fraccion) numero;
            return new Ej9Fraccion(this.numerador * num.denominador - num.numerador * this.denominador, this.denominador * num.denominador);
        } 
    	else{
            System.out.println("Deben ser igual");
        }
        return numero;
    
    }

    @Override
    public Ej9Numerica multiplicar(Ej9Numerica numero) {
    	if (numero instanceof Ej9Fraccion){
            Ej9Fraccion num = (Ej9Fraccion) numero;
            return new Ej9Fraccion(this.numerador * num.numerador, this.denominador * num.denominador);
        } 
    	else{
            System.out.println("Deben ser igual");
        }
        return numero;
    
    }

    @Override 
    public Ej9Numerica dividir(Ej9Numerica numero) {
    	if (numero instanceof Ej9Fraccion){
    		Ej9Fraccion num = (Ej9Fraccion) numero;
            return new Ej9Fraccion(this.numerador * num.denominador, this.denominador * num.numerador);
        } else{
            System.out.println("Deben ser igual");
        }
        return numero;
    
    }
	
}
