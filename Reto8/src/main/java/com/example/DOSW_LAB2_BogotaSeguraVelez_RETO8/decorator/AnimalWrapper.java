package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator;

import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal.Animal;

public class AnimalWrapper implements AnimalComponent {
    private Animal animal;

    public AnimalWrapper(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getDescripcion() {
        return animal.toString();
    }

    public Animal getAnimal() {
        return animal;
    }
}