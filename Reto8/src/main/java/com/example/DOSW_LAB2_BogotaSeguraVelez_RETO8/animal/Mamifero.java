package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal;

public class Mamifero extends Animal {

    public Mamifero(String nombre, int edad, String sonido, String dieta,
                    String alimentoPreferido, double peso, double altura,
                    EstadoSalud estadoSalud, String habitat) {
        super(nombre, edad, sonido, dieta, alimentoPreferido, peso, altura, estadoSalud, habitat);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: " + getSonido());
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " está comiendo " + getAlimentoPreferido() +
                " (Dieta: " + getDieta() + ")");
    }
}