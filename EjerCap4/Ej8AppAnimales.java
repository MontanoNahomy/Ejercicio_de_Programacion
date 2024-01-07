package EjerCap4;

public class Ej8AppAnimales {

	public static void main(String[] args) {
		Ej8Animal animal[] = new Ej8Animal[4];
        animal[0] = new Ej8Gato();
        animal[1] = new Ej8Leon();
        animal[2] = new Ej8Lobo();
        animal[3] = new Ej8Perro();

        for (int i = 0; i < animal.length; i++) { /* Recorre el array de
        	animales */
        	System.out.println(animal[i].getNombreCientífico());
        	System.out.println("Sonido: " + animal[i].getSonido());
        	System.out.println("Alimentos: " + animal[i].
        	getAlimentos());
        	System.out.println("Hábitat: " + animal[i].getHábitat());
        	System.out.println();
        }
    }
}
