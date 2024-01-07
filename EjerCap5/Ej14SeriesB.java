package EjerCap5;

import java.util.Vector;

public class Ej14SeriesB {

	 String titulo;
	    Vector series;

	    boolean serieEncontrada;
	    public Ej14SeriesB() {
	        series = new Vector<>();
	    }

	    public void agregarSerie(Ej14Series nombre){
	        series.add(nombre);
	    }

	    public void eliminarSeries(Ej14Series nombre){
	        series.remove(nombre);

	        while (series.remove(nombre)) {}

	        System.out.println("Nueva lista: ");
	        for (int k = 0; k < series.size(); k++) {
	        	Ej14Series series1 = (Ej14Series) series.elementAt(k);
	            series1.imprimir();
	        }
	    }

	    public void buscarSerieTitulo(String titulo){
	        for (int k = 0; k<series.size(); k++){
	        	Ej14Series series1 = (Ej14Series) series.elementAt(k);
	            if(titulo.equals(series1.getTitulo())){
	                series1.imprimir();
	                serieEncontrada = true;
	                break;
	            }
	        }
	        if (!serieEncontrada){
	            System.out.println("No se encontró la Serie");
	        }
	    }

	    public void buscarSerieGenero(String genero){
	        for (int k = 0; k<series.size(); k++){
	        	Ej14Series series1 = (Ej14Series) series.elementAt(k);
	            if(genero.equals(series1.getGenero())){
	                series1.imprimir();
	                serieEncontrada = true;
	            }
	        }
	        if (!serieEncontrada){
	            System.out.println("No se encontró la Serie");
	        }
	    }

	    public void buscarSeriePais(String pais){
	        for (int k = 0; k<series.size(); k++){
	        	Ej14Series series1 = (Ej14Series) series.elementAt(k);
	            if(pais.equals(series1.getPais())){
	                series1.imprimir();
	                serieEncontrada = true;
	            }
	        }
	        if (!serieEncontrada){
	            System.out.println("No se encontró la Serie");
	        }
	    }
}
