import java.util.Date;

public class ServicioDomiciliario {
    private String codigo;
    private Date fechaProgramada;
    private String direccionAtencion;
    private String motivo;
    private String estado;

    public ServicioDomiciliario(String codigo, Date fechaProgramada, String direccionAtencion, String motivo, String estado) {
        this.codigo = codigo;
        this.fechaProgramada = fechaProgramada;
        this.direccionAtencion = direccionAtencion;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Date getFechaProgramada() { return fechaProgramada; }
    public void setFechaProgramada(Date fechaProgramada) { this.fechaProgramada = fechaProgramada; }
    public String getDireccionAtencion() { return direccionAtencion; }
    public void setDireccionAtencion(String direccionAtencion) { this.direccionAtencion = direccionAtencion; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}