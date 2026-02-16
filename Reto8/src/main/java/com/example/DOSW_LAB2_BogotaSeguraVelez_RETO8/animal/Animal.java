package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal;

public abstract class Animal {
    private String nombre;
    private int edad;
    private String sonido;
    private String dieta;
    private String alimentoPreferido;
    private double peso;
    private double altura;
    private EstadoSalud estadoSalud;
    private String habitat;

    public Animal(String nombre, int edad, String sonido, String dieta,
                  String alimentoPreferido, double peso, double altura,
                  EstadoSalud estadoSalud, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.sonido = sonido;
        this.dieta = dieta;
        this.alimentoPreferido = alimentoPreferido;
        this.peso = peso;
        this.altura = altura;
        this.estadoSalud = estadoSalud;
        this.habitat = habitat;
    }

    public abstract void hacerSonido();

    public abstract void alimentarse();

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

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public EstadoSalud getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(EstadoSalud estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return nombre + " (" + getClass().getSimpleName() + ") - Edad: " + edad +
                ", Estado: " + estadoSalud + ", Hábitat: " + habitat;
    }
}