import java.util.Date;

public class AtencionMedica {
    private Date fecha;
    private Date horaInicio;
    private Date fechaHoraFin;
    private String observacionesClinicas;
    private String recomendaciones;

    public AtencionMedica(Date fecha, Date horaInicio, Date fechaHoraFin, String observacionesClinicas, String recomendaciones) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.observacionesClinicas = observacionesClinicas;
        this.recomendaciones = recomendaciones;
    }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public Date getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Date horaInicio) { this.horaInicio = horaInicio; }
    public Date getFechaHoraFin() { return fechaHoraFin; }
    public void setFechaHoraFin(Date fechaHoraFin) { this.fechaHoraFin = fechaHoraFin; }
    public String getObservacionesClinicas() { return observacionesClinicas; }
    public void setObservacionesClinicas(String observacionesClinicas) { this.observacionesClinicas = observacionesClinicas; }
    public String getRecomendaciones() { return recomendaciones; }
    public void setRecomendaciones(String recomendaciones) { this.recomendaciones = recomendaciones; }
}