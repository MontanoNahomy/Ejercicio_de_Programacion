package EjerCap5;

import java.util.Vector;

public class Ej13Departamento {

	String nombre;
    boolean encontrarMunicipio;
    Vector municipios;

    public Ej13Departamento(String nombre, Vector municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public void agregarMunicipio(String municipio){
        municipios.add(municipio);
    }

    public void eliminarMunicipio(){
        for (int k = 0; k<municipios.size(); k++){
        	Ej13Municipio municipio1 = (Ej13Municipio) municipios.elementAt(k);

            if(nombre.equals(municipio1.getNombre())){
                municipios.remove(municipio1);
                break;
            }
        }
    }

    public void buscarMunicipio(String nombre){
        for (int k = 0; k<municipios.size(); k++){
        	Ej13Municipio municipio1 = (Ej13Municipio) municipios.elementAt(k);

            if(nombre.equals(municipio1.getNombre())){
                municipio1.imprimir();
                break;
            }
            if(!nombre.equals(municipio1.getNombre())){
                System.out.println("Municipio no encontrado");
            }
        }
    }

    public void buscarMunicipioPoblMayor(int poblacion){
        for (int k = 0; k<municipios.size(); k++){
        	Ej13Municipio municipio = (Ej13Municipio) municipios.elementAt(k);
            if (municipio.getPoblacion() >= poblacion){
                System.out.println(municipio.getNombre());
            }
            encontrarMunicipio = true;
        }
        if (!encontrarMunicipio){
            System.out.println("No se encontró municipios con esa población");
        }
    }

    public int calcularPoblacion(){
        int total = 0;
        for (int k = 0; k <municipios.size(); k++){
        	Ej13Municipio municipio = (Ej13Municipio) municipios.elementAt(k);
            total += municipio.getPoblacion();
        }
        return total;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Vector municipios) {
        this.municipios = municipios;
    }
}
