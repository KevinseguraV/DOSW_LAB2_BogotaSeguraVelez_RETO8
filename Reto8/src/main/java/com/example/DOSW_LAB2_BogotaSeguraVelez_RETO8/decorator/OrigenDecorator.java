package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

public class OrigenDecorator extends AnimalDecorator {
    private String origen;

    public OrigenDecorator(AnimalComponent animal, String origen) {
        super(animal);
        this.origen = origen;
    }

    @Override
    public String getDescripcion() {
        return animal.getDescripcion() + ", Origen: " + origen;
    }

    public String getOrigen() {
        return origen;
    }
}