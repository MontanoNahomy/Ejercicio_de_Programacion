package EjerCap4;

public class Ej12Pediatra extends Ej12Medico{

	enum Tipologia {NEUROLOGO, PSICOLOGO};
    Tipologia tipo;

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }
}
