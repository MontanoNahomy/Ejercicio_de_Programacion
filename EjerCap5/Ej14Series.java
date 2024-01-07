package EjerCap5;

public class Ej14Series {

	String titulo, genero, pais;
    int anioPublicacion;


   public Ej14Series(String titulo, String genero, String pais, int anioPublicacion) {
       this.titulo = titulo;
       this.genero = genero;
       this.pais = pais;
       this.anioPublicacion = anioPublicacion;
   }


   public void imprimir(){
       System.out.println("*[Título de serie] " + titulo + " \nGénero de serie: " + genero + "\nPaís de serie: " + pais + "\nAño de publicación: " + anioPublicacion);
   }

   public String getTitulo() {
       return titulo;
   }

   public void setTitulo(String titulo) {
       this.titulo = titulo;
   }

   public String getGenero() {
       return genero;
   }

   public void setGenero(String genero) {
       this.genero = genero;
   }

   public String getPais() {
       return pais;
   }

   public void setPais(String pais) {
       this.pais = pais;
   }

   public int getAnioPublicacion() {
       return anioPublicacion;
   }

   public void setAnioPublicacion(int anioPublicacion) {
       this.anioPublicacion = anioPublicacion;
   }
}
