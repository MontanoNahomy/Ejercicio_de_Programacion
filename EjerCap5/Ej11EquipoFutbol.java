package EjerCap5;


public class Ej11EquipoFutbol {

	String nombre, pais;
	Ej11Tecnico tecnico;
	Ej11Portero portero;
	Ej11Defensa[] defensa;
	Ej11MedioCampo[] mediocampo;
	Ej11Delantero[] delantero;

    public Ej11EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Ej11EquipoFutbol(String nombre, String ciudad, Ej11Tecnico tecnico, Ej11Portero portero, Ej11Defensa[] defensa, Ej11MedioCampo[] mediocampo, Ej11Delantero[] delantero) {
        this(nombre,ciudad);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensa = defensa;
        this.mediocampo = mediocampo;
        this.delantero = delantero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimir(){

        System.out.println("Nombre del equipo: " +nombre);
        System.out.println(tecnico);
        System.out.println(portero);
        for (int k = 0; k<defensa.length;k++){
            System.out.println( k+1+ " "+ "Defensa: " + defensa[k]);
        }
        for (int k = 0; k< mediocampo.length; k++){
            System.out.println( k+1+ " " + "Mediocampo: " + mediocampo[k]);
        }
        for (int k = 0; k< delantero.length; k++){
            System.out.println(k+1+ " " + "Delantero: " + delantero[k]);
        }
    }

    private int puntos, partidosGanados, partidosEmpatados, partidosPerdidos, golesAnotados, golesRecibidos, diferenciaGoles;

    public void registrarPartido(int golesAnotados, int golesRecibidos){
        if(golesAnotados > golesRecibidos){
            puntos+= 3;
            partidosGanados++;
        } else if (golesAnotados == golesRecibidos) {
            puntos += 1;
            partidosEmpatados++;
        } else {
            partidosPerdidos++;
        }

        this.golesAnotados += golesAnotados;
        this.golesRecibidos += golesRecibidos;
        this.diferenciaGoles = this.golesAnotados - this.golesRecibidos;
    }

    public void resultadosFinales(){
        if (partidosPerdidos > 0){
            System.out.println("Perdió");
            System.out.println();
        }
        else if(partidosEmpatados > 0){
            System.out.println("Empató");
            System.out.println();
        } else{
            System.out.println("Ganó");
            System.out.println();
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }
}
