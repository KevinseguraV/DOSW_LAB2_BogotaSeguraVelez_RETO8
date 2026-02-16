package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

public abstract class AnimalDecorator implements AnimalComponent {
    protected AnimalComponent animal;

    public AnimalDecorator(AnimalComponent animal) {
        this.animal = animal;
    }

    @Override
    public String getDescripcion() {
        return animal.getDescripcion();
    }
}