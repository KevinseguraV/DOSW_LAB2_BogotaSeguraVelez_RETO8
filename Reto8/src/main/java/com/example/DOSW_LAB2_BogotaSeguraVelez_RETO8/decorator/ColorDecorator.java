package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

public class ColorDecorator extends AnimalDecorator {
    private String colorPelaje;

    public ColorDecorator(AnimalComponent animal, String colorPelaje) {
        super(animal);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String getDescripcion() {
        return animal.getDescripcion() + ", Color de pelaje: " + colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }
}