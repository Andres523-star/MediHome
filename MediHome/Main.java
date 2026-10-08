import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar un Paciente
        Paciente paciente = new Paciente("123456", "Juan Perez", "juan@email.com", "3001234567", "Calle 123 #45-67");
        
        // 2. Instanciar un Profesional
        ProfesionalSalud profesional = new ProfesionalSalud("987654", "Dra. Ana Gomez", "ana@email.com", "MP-12345", "Medicina General");
        
        // 3. Instanciar un Servicio Domiciliario
        ServicioDomiciliario servicio = new ServicioDomiciliario("SRV-001", new Date(), "Calle 123 #45-67", "Control de signos vitales", "Programado");
        
        // 4. Instanciar una Atención Médica
        AtencionMedica atencion = new AtencionMedica(new Date(), new Date(), new Date(), "Paciente estable, sin complicaciones.", "Reposo por 48 horas.");
        
        // 5. Instanciar una Medición de Signos Vitales
        MedicionSignosVitales medicion = new MedicionSignosVitales(new Date(), 36.5, 80, 120, 80, 98.0);
        
        // 6. Presentar Reporte
        System.out.println("=========================================");
        System.out.println("     REPORTE DE ATENCION DOMICILIARIA    ");
        System.out.println("=========================================");
        System.out.println("PACIENTE: " + paciente.getNombre() + " (ID: " + paciente.getIdentificacion() + ")");
        System.out.println("DIRECCION: " + paciente.getDireccion());
        System.out.println("PROFESIONAL: " + profesional.getNombre() + " - " + profesional.getEspecialidad());
        System.out.println("SERVICIO: " + servicio.getCodigo() + " - " + servicio.getMotivo());
        System.out.println("ESTADO: " + servicio.getEstado());
        System.out.println("-----------------------------------------");
        System.out.println("OBSERVACIONES: " + atencion.getObservacionesClinicas());
        System.out.println("RECOMENDACIONES: " + atencion.getRecomendaciones());
        System.out.println("-----------------------------------------");
        System.out.println("SIGNOS VITALES:");
        System.out.println("Temperatura: " + medicion.getTemperatura() + " C");
        System.out.println("Frecuencia Cardiaca: " + medicion.getFrecuenciaCardiaca() + " bpm");
        System.out.println("Presion Arterial: " + medicion.getPresionSistolica() + "/" + medicion.getPresionDiastolica() + " mmHg");
        System.out.println("Saturacion de Oxigeno: " + medicion.getSaturacionOxigeno() + "%");
        System.out.println("=========================================");
    }
}
