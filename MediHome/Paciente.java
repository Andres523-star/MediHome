public class Paciente extends Usuario {
    private String telefono;
    private String direccion;

    public Paciente(String identificacion, String nombre, String correo, String telefono, String direccion) {
        super(identificacion, nombre, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}