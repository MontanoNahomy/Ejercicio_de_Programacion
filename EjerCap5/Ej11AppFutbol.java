package EjerCap5;

import java.util.Arrays;
import java.util.Comparator;

public class Ej11AppFutbol {

	public static void main(String[] args) {
	    Ej11Tecnico tecnico = new Ej11Tecnico("Xavi", "Hernandez", 42, 20, false);
	    Ej11Portero portero = new Ej11Portero("Marc-André", "ter Stegen", 29, true, 0);
	    Ej11Defensa[] defensa = new Ej11Defensa[4];
	    Ej11MedioCampo[] mediocampos = new Ej11MedioCampo[4];
	    Ej11Delantero[] delanteros = new Ej11Delantero[4]; 
	    defensa[0] = new Ej11Defensa("Gerard", "Piqué", 35, true);
	    defensa[1] = new Ej11Defensa("Jordi", "Alba", 33, true);
	    defensa[2] = new Ej11Defensa("Ronald", "Araújo", 23, true);
	    defensa[3] = new Ej11Defensa("Sergiño", "Dest", 21, true);
	    mediocampos[0] = new Ej11MedioCampo("Frenkie", "de Jong", 24, true, 8);
        mediocampos[1] = new Ej11MedioCampo("Sergio", "Busquets", 33, true, 5);
	    mediocampos[2] = new Ej11MedioCampo("Pedri", "González", 19, true, 3);
	    mediocampos[3] = new Ej11MedioCampo("Gavi", "Páez", 17, true, 1);
	    delanteros[0] = new Ej11Delantero("Memphis", "Depay", 27, true, 15);
	    delanteros[1] = new Ej11Delantero("Antoine", "Griezmann", 30, true, 12);
	    delanteros[2] = new Ej11Delantero("Ansu", "Fati", 19, true, 8);
	    delanteros[3] = new Ej11Delantero("Ousmane", "Dembele", 24, true, 10);

	    Ej11EquipoFutbol equipoBarcelona = new Ej11EquipoFutbol("Barcelona FC", "España", tecnico, portero, defensa, mediocampos, delanteros);
	    equipoBarcelona.imprimir();

        Ej11EquipoFutbol[] equipos = new Ej11EquipoFutbol[10];

        System.out.println();
        
        equipos[0] = crearEquipo("FC Barcelona", "España");
        equipos[1] = crearEquipo("Real Madrid", "España");
        equipos[2] = crearEquipo("Manchester City", "Inglaterra");
        equipos[3] = crearEquipo("Liverpool FC", "Inglaterra");
        equipos[4] = crearEquipo("Bayern Munich", "Alemania");
        equipos[5] = crearEquipo("Paris Saint-Germain", "Francia");
        equipos[6] = crearEquipo("Juventus", "Italia");
        equipos[7] = crearEquipo("AC Milan", "Italia");
        equipos[8] = crearEquipo("Chelsea FC", "Inglaterra");
        equipos[9] = crearEquipo("Atletico Madrid", "España");


        simularPartido(equipos[0], equipos[1], 3,2);
        simularPartido(equipos[2], equipos[3], 5,1);
        simularPartido(equipos[4], equipos[5], 0,0);
        simularPartido(equipos[6], equipos[7], 2,2);
        simularPartido(equipos[8], equipos[9], 2,1);

        tablaPosiciones(equipos);

    }
    static Ej11EquipoFutbol crearEquipo (String nombre, String pais){
        return new Ej11EquipoFutbol(nombre,pais);
    }
    static void simularPartido(Ej11EquipoFutbol equipo1, Ej11EquipoFutbol equipo2, int golesEquipo1, int golesEquipo2){
        equipo1.registrarPartido(golesEquipo1, golesEquipo2);
        equipo2.registrarPartido(golesEquipo2, golesEquipo1);
    }
    static void tablaPosiciones(Ej11EquipoFutbol[] equipoFutbols){
        Arrays.sort(equipoFutbols, Comparator.comparingInt(Ej11EquipoFutbol::getPuntos).reversed());
        System.out.println("Tabla de posiciones");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Equipo", "Puntos", "PG", "PE", "PP", "GF", "GC", "Dif. Goles");

        for (Ej11EquipoFutbol equipoFutbol : equipoFutbols){
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%n", equipoFutbol.getNombre(), equipoFutbol.getPuntos(),
                    equipoFutbol.getPartidosGanados(), equipoFutbol.getPartidosEmpatados(), equipoFutbol.getPartidosPerdidos(),
                    equipoFutbol.getGolesAnotados(), equipoFutbol.getGolesRecibidos(), equipoFutbol.getDiferenciaGoles());
            equipoFutbol.resultadosFinales();
        }
    }
}
