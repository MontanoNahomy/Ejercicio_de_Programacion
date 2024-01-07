package EjerCap5;

import java.util.Vector;

public class Ej15Evaluacion {
	Vector<Ej15Comentarios> comentarioVector;

    public Ej15Evaluacion() {
        this.comentarioVector = new Vector<>();
    }

    public void agregarComentario(Ej15Comentarios comentario) {
        comentarioVector.add(comentario);
    }

    public Vector<Ej15Comentarios> getComentarioVector() {
        return comentarioVector;
    }

    public void setComentarioVector(Vector<Ej15Comentarios> comentarioVector) {
        this.comentarioVector = comentarioVector;
    }
	
}
