package EjerCap4;

public class Ej10AppCarreraCiclistica {

	public static void main(String args[]) {
		Ej10Equipo equipo1 = new Ej10Equipo("Sky","Estados Unidos");
		Ej10Velocista velocista1 = new Ej10Velocista(123979, "Geraint Thomas",
		320, 25);
		Ej10Escalador escalador1 = new Ej10Escalador(123980, "Egan Bernal",
		25, 10);
		Ej10Contrarrelojista contrarrelojista1 = new Ej10Contrarrelojista(123981,
		"Jonathan Castroviejo", 120);
		equipo1.añadirCiclista(velocista1);
		equipo1.añadirCiclista(escalador1);
		equipo1.añadirCiclista(contrarrelojista1);
		velocista1.setTiempoAcumulado(365);
		escalador1.setTiempoAcumulado(385);
		contrarrelojista1.setTiempoAcumulado(370);
		equipo1.calcularTotalTiempo();
		equipo1.imprimir();
		equipo1.listarEquipo();
		}
}
