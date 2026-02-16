package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.personas;

import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private int edad;
    private List<Animal> animalesFavoritos;
    private List<String> fotografias;

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.animalesFavoritos = new ArrayList<>();
        this.fotografias = new ArrayList<>();
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " está alimentando a " + animal.getNombre());
        animal.alimentarse();
    }

    public void darPropina(Cuidador cuidador, double cantidad) {
        System.out.println(nombre + " le dio $" + cantidad + " de propina a " + cuidador.getNombre());
    }

    public void subirFotografia(Animal animal) {
        String foto = "Foto de " + animal.getNombre() + " tomada por " + nombre;
        fotografias.add(foto);
        System.out.println(nombre + " subió una fotografía de " + animal.getNombre());
    }

    public void agregarAnimalFavorito(Animal animal) {
        if (!animalesFavoritos.contains(animal)) {
            animalesFavoritos.add(animal);
            System.out.println(animal.getNombre() + " fue agregado a favoritos de " + nombre);
        }
    }

    public void removerAnimalFavorito(Animal animal) {
        if (animalesFavoritos.remove(animal)) {
            System.out.println(animal.getNombre() + " fue removido de favoritos de " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Animal> getAnimalesFavoritos() {
        return new ArrayList<>(animalesFavoritos); // Retorna copia
    }

    public List<String> getFotografias() {
        return new ArrayList<>(fotografias); // Retorna copia
    }

    @Override
    public String toString() {
        return "Visitante: " + nombre + ", Edad: " + edad +
                ", Animales favoritos: " + animalesFavoritos.size() +
                ", Fotografías: " + fotografias.size();
    }
}