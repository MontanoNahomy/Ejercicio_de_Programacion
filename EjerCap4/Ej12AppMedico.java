package EjerCap4;

import java.util.Vector;

public class Ej12AppMedico {

	public static void main(String[] args) {
        Vector listaMedicos = new Vector();
        Ej12Medico medico = new Ej12Medico();
        Ej12Ortopedista ortopedista = new Ej12Ortopedista();
        Ej12Pediatra pediatra = new Ej12Pediatra();
        listaMedicos.add(medico);
        listaMedicos.add(ortopedista);
        listaMedicos.add(pediatra);

        for(int i = 0; i <listaMedicos.size(); i++){
        	Ej12Medico me = (Ej12Medico) listaMedicos.elementAt(i);
            if (me instanceof Ej12Ortopedista){
                System.out.println("El objeto en el indice " + i + " es de la clase Ortopedista");
                continue;
            }
            if (me instanceof Ej12Pediatra){
                System.out.println("El objeto en el indice " + i + " es de la clase Pediatra");

                continue;
            }
            if (me instanceof Ej12Medico){
                System.out.println("El objeto en el indice " +i + " es de la clase Médico");
                continue;
            }
        }
    }
}
