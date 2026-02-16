package main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8;

import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.animal.*;
import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.decorator.*;
import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.personas.Cuidador;
import main.java.com.example.DOSW_LAB2_BogotaSeguraVelez_RETO8.personas.Visitante;

import java.util.Arrays;
public class Application {

	public static void main(String[] args) {

		System.out.println("   SISTEMA DE GESTIÓN DEL ZOOLÓGICO");

		System.out.println("--- Creando animales ---");

		Animal leon = new Mamifero("Simba", 5, "ROAR!", "Carnívoro",
				"Carne de res", 190.5, 1.2,
				EstadoSalud.SANO, "Sabana africana");

		Animal elefante = new Mamifero("Dumbo", 15, "Barritar", "Herbívoro",
				"Heno y frutas", 5000.0, 3.5,
				EstadoSalud.SANO, "Pradera tropical");

		Animal loro = new Ave("Paco", 3, "¡Hola! ¡Hola!", "Omnívoro",
				"Semillas y frutas", 0.8, 0.35,
				EstadoSalud.SANO, "Bosque tropical");

		Animal aguila = new Ave("Zeus", 7, "¡SCREEECH!", "Carnívoro",
				"Peces", 4.5, 0.9,
				EstadoSalud.CUARENTENA, "Montañas");

		Animal cocodrilo = new Reptil("Cocodrilo", 12, "Gruñido bajo", "Carnívoro",
				"Pescado", 450.0, 4.2,
				EstadoSalud.ENFERMO, "Pantano");

		Animal tortuga = new Reptil("Tortu", 50, "Silencio", "Herbívoro",
				"Lechuga", 180.0, 0.8,
				EstadoSalud.SANO, "Estanque");

		System.out.println("✓ Animales creados exitosamente\n");
		System.out.println("--- Aplicando atributos dinámicos (Patrón Decorator) ---");

		AnimalComponent leonDecorado = new AnimalWrapper(leon);
		leonDecorado = new ColorDecorator(leonDecorado, "Dorado");
		leonDecorado = new OrigenDecorator(leonDecorado, "Tanzania");
		leonDecorado = new RarezaDecorator(leonDecorado, "Común");
		leonDecorado = new HistorialMedicoDecorator(leonDecorado, "Vacunas al día, última revisión: 01/02/2026");

		System.out.println(leonDecorado.getDescripcion());
		System.out.println();

		AnimalComponent elefanteDecorado = new AnimalWrapper(elefante);
		elefanteDecorado = new ColorDecorator(elefanteDecorado, "Gris oscuro");
		elefanteDecorado = new OrigenDecorator(elefanteDecorado, "India");
		elefanteDecorado = new RarezaDecorator(elefanteDecorado, "En peligro");

		System.out.println(elefanteDecorado.getDescripcion());
		System.out.println();

		AnimalComponent loroDecorado = new AnimalWrapper(loro);
		loroDecorado = new ColorDecorator(loroDecorado, "Verde y rojo");
		loroDecorado = new OrigenDecorator(loroDecorado, "Amazonia");

		System.out.println(loroDecorado.getDescripcion());
		System.out.println();

		System.out.println("--- Creando cuidadores ---");
		Cuidador cuidador1 = new Cuidador("Carlos Pérez", 35,
				Arrays.asList("Mamíferos", "Grandes felinos"));
		Cuidador cuidador2 = new Cuidador("María González", 28,
				Arrays.asList("Aves", "Reptiles"));
		System.out.println("✓ Cuidadores creados\n");

		System.out.println("--- Asignando animales a cuidadores ---");
		cuidador1.asignarAnimal(leon);
		cuidador1.asignarAnimal(elefante);
		cuidador2.asignarAnimal(loro);
		cuidador2.asignarAnimal(aguila);
		cuidador2.asignarAnimal(cocodrilo);
		cuidador2.asignarAnimal(tortuga);
		System.out.println();

		System.out.println("--- Demostrando polimorfismo (todos los animales hacen su sonido) ---");
		leon.hacerSonido();
		elefante.hacerSonido();
		loro.hacerSonido();
		aguila.hacerSonido();
		cocodrilo.hacerSonido();
		tortuga.hacerSonido();
		System.out.println();

		System.out.println("--- Cuidadores interactuando con animales ---");
		cuidador1.alimentarAnimal(leon);
		cuidador1.banarAnimal(elefante);
		cuidador1.limpiarHabitat(leon);
		System.out.println();

		cuidador2.alimentarAnimal(loro);
		cuidador2.limpiarHabitat(cocodrilo);
		System.out.println();

		System.out.println("--- Creando visitantes ---");
		Visitante visitante1 = new Visitante("Ana López", 25);
		Visitante visitante2 = new Visitante("Pedro Ramírez", 40);

		System.out.println("✓ Visitantes registrados\n");
		System.out.println("--- Visitantes interactuando ---");

		// Agregar animales favoritos
		visitante1.agregarAnimalFavorito(leon);
		visitante1.agregarAnimalFavorito(loro);
		visitante2.agregarAnimalFavorito(elefante);
		System.out.println();

		// Alimentar animales
		visitante1.alimentarAnimal(loro);
		System.out.println();

		// Subir fotografías
		visitante1.subirFotografia(leon);
		visitante1.subirFotografia(loro);
		visitante2.subirFotografia(elefante);
		System.out.println();

		visitante1.darPropina(cuidador1, 10.0);
		visitante2.darPropina(cuidador2, 15.0);
		System.out.println();


		System.out.println("           RESUMEN DEL SISTEMA");

		System.out.println(cuidador1);
		System.out.println(cuidador2);
		System.out.println(visitante1);
		System.out.println(visitante2);
		System.out.println("\n--- Estados de salud de los animales ---");
		System.out.println(leon.getNombre() + ": " + leon.getEstadoSalud());
		System.out.println(elefante.getNombre() + ": " + elefante.getEstadoSalud());
		System.out.println(loro.getNombre() + ": " + loro.getEstadoSalud());
		System.out.println(aguila.getNombre() + ": " + aguila.getEstadoSalud());
		System.out.println(cocodrilo.getNombre() + ": " + cocodrilo.getEstadoSalud());
		System.out.println(tortuga.getNombre() + ": " + tortuga.getEstadoSalud());


	}
}