package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

public class RarezaDecorator extends AnimalDecorator {
    private String rareza;

    public RarezaDecorator(AnimalComponent animal, String rareza) {
        super(animal);
        this.rareza = rareza;
    }

    @Override
    public String getDescripcion() {
        return animal.getDescripcion() + ", Rareza: " + rareza;
    }

    public String getRareza() {
        return rareza;
    }
}