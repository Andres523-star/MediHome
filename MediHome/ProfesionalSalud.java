public class ProfesionalSalud extends Usuario {
    private String numeroRegistroProfesional;
    private String especialidad;

    public ProfesionalSalud(String identificacion, String nombre, String correo, String numeroRegistroProfesional, String especialidad) {
        super(identificacion, nombre, correo);
        this.numeroRegistroProfesional = numeroRegistroProfesional;
        this.especialidad = especialidad;
    }

    public String getNumeroRegistroProfesional() { return numeroRegistroProfesional; }
    public void setNumeroRegistroProfesional(String numeroRegistroProfesional) { this.numeroRegistroProfesional = numeroRegistroProfesional; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}