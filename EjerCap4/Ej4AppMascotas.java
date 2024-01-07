package EjerCap4;

public class Ej4AppMascotas {

	public static void main(String[] args) {
        
		Ej4GatosPeloLargo gatoPeloLargo = new Ej4GatosPeloLargo("Blanca", 1, "Blanco", 1.6, 1.8, "Balinés");
		
		Ej4PerrosPequeños perroPequeno = new Ej4PerrosPequeños("Tobby ",5, "Marrón ", 7, false, "Dachshund");
        
        Ej4GatosPeloCorto gatoPeloCorto = new Ej4GatosPeloCorto("Lima", 2, "Gris", 2, 2, "Manx");
        
        System.out.println("Información del gato de pelo largo:");
        System.out.println(gatoPeloLargo);
        
        System.out.println("Información del perro pequeño:");
        System.out.println(perroPequeno);
        
        System.out.println("Información del gato de pelo corto:");
        System.out.println(gatoPeloCorto);
        
    }
}
