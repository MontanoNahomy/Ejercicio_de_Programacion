package EjerCap4;

public class Ej13Arr {

	public static void main(String[] args) {
        int[] arrayInt = new int [5];
        float[] arrayFloat = new float[5];
        Integer[] arrayInteger = new Integer[5];

        System.out.println(arrayInt instanceof Object);
        System.out.println(arrayInt instanceof int[]);
        System.out.println(arrayFloat instanceof Object);
        System.out.println(arrayFloat instanceof float[]);
        System.out.println(arrayInteger instanceof Object);
        System.out.println(arrayInteger instanceof Object[]);
        System.out.println(arrayInteger instanceof Integer[]);
    }
	
	//Resultado = Todo verdadero
}
