package EjerCap5;

import java.util.Vector;

public class Ej14AppSeries {

	public static void main(String[] args) {
     Vector series = new Vector();

     Ej14Series series1 = new Ej14Series("¿Quién es Erin Carter?", "Suspenso", "Barcelona", 2023);
     Ej14Series series2 = new Ej14Series("Anne with an E", "Drama", "Canadá", 2017);
     Ej14Series series3 = new Ej14Series("Estamos muertos", "Terror", "Corea", 2022);
     Ej14Series series4 = new Ej14Series("Dulce hogar", "Drama", "Corea", 2020);
     Ej14Series series5 = new Ej14Series("Peaky Blinders", "Drama", "EEUU", 2013);

     Ej14SeriesB seriesb = new Ej14SeriesB();
     seriesb.agregarSerie(series1);
     seriesb.agregarSerie(series2);
     seriesb.agregarSerie(series3);
     seriesb.agregarSerie(series4);
     seriesb.agregarSerie(series5);
     seriesb.agregarSerie(series1);
     System.out.println("----------------------- Búsqueda por el Título ------------------------------ ");
     seriesb.buscarSerieTitulo("Estamos muertos");
     System.out.println("----------------------- Búsqueda por el Género ------------------------------ ");
     seriesb.buscarSerieGenero("Drama");
     System.out.println("------------------------ Búsqueda por el País ------------------------------- ");
     seriesb.buscarSeriePais("Corea");

     System.out.println("------------------------ Eliminando Serie ------------------------------- " );
     seriesb.eliminarSeries(series1);
    }
}
