package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

public class HistorialMedicoDecorator extends AnimalDecorator {
    private String historialMedico;

    public HistorialMedicoDecorator(AnimalComponent animal, String historialMedico) {
        super(animal);
        this.historialMedico = historialMedico;
    }

    @Override
    public String getDescripcion() {
        return animal.getDescripcion() + ", Historial Médico: " + historialMedico;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }
}