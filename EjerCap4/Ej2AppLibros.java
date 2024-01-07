package EjerCap4;

public class Ej2AppLibros {

	public static void main(String[] args) {
        // Crear objetos de las clases
        Ej2Libro libro = new Ej2Libro("Heist", "Ariana Godoy");
        libro.setPrecio(15);
        libro.visualizar();
        
        System.out.println("-----------------------------------------");
        
        Ej2LibroTexto libroTexto = new Ej2LibroTexto("Literatura", "Karen Arizala", "3BGU");
        libroTexto.setPrecio(40);
        libroTexto.visualizar();
        
        System.out.println("-----------------------------------------");
        
        Ej2LibroTextoUnc libroTextoUnc = new Ej2LibroTextoUnc("Programacion en C++", " Luis Joyanes Aguilar ", "4to", "Tecnologías de la Información");
        libroTextoUnc.setPrecio(50);
        libroTextoUnc.visualizar();
        
        System.out.println("-----------------------------------------");

        Ej2Novela novela = new Ej2Novela("Cien años de soledad", "Gabriel García Márquez ", "Fantasía");
        novela.setPrecio(28);
        novela.visualizar();
        
        
        
    }
}
