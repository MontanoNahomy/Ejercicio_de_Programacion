package EjerCap5;

public class Ej11Portero extends Ej11Jugador{

    int golesRecibidos;

    public Ej11Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellidos, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString() {
    	return "Portero{" +
                "Goles Recibidos=" + golesRecibidos +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                '}';
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

}
