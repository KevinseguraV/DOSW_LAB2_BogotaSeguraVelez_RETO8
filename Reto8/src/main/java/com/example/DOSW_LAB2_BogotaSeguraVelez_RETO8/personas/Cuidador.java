package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.personas;

import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private String nombre;
    private int edad;
    private List<String> especialidad;
    private List<Animal> animalesAsignados;

    public Cuidador(String nombre, int edad, List<String> especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.animalesAsignados = new ArrayList<>();
    }

    public void alimentarAnimal(Animal animal) {
        if (animalesAsignados.contains(animal)) {
            System.out.println(nombre + " está alimentando a " + animal.getNombre());
            animal.alimentarse();
        } else {
            System.out.println(nombre + " no está asignado para cuidar a " + animal.getNombre());
        }
    }

    public void banarAnimal(Animal animal) {
        if (animalesAsignados.contains(animal)) {
            System.out.println(nombre + " está bañando a " + animal.getNombre());
        } else {
            System.out.println(nombre + " no está asignado para cuidar a " + animal.getNombre());
        }
    }

    public void limpiarHabitat(Animal animal) {
        if (animalesAsignados.contains(animal)) {
            System.out.println(nombre + " está limpiando el hábitat de " + animal.getNombre());
        } else {
            System.out.println(nombre + " no está asignado para cuidar a " + animal.getNombre());
        }
    }

    public void asignarAnimal(Animal animal) {
        if (!animalesAsignados.contains(animal)) {
            animalesAsignados.add(animal);
            System.out.println(animal.getNombre() + " ha sido asignado a " + nombre);
        }
    }

    public void removerAnimal(Animal animal) {
        if (animalesAsignados.remove(animal)) {
            System.out.println(animal.getNombre() + " ha sido removido de la lista de " + nombre);
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

    public List<String> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<String> especialidad) {
        this.especialidad = especialidad;
    }

    public List<Animal> getAnimalesAsignados() {
        return new ArrayList<>(animalesAsignados); // Retorna copia para evitar modificación externa
    }

    @Override
    public String toString() {
        return "Cuidador: " + nombre + ", Edad: " + edad +
                ", Especialidades: " + especialidad +
                ", Animales asignados: " + animalesAsignados.size();
    }
}