package EjerCap4;

public class Ej12Ortopedista extends Ej12Medico{

	enum Tipologia{MAXILOFACIAL, PEDIATRICA};
    Tipologia tipo;

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }
}
