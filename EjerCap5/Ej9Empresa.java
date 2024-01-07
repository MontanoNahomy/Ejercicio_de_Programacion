package EjerCap5;

public class Ej9Empresa extends Ej9Cliente {

	private String nombreEmpresa;
    private String nit;
    private String telefono;
    private String direccion;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombreEmpresa + "\nNIT: " + nit + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }
}
