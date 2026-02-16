package com.DOSW_JJK.Reto7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto7Application {

	public static void main(String[] args) {
        Luz luz = new Luz();
        Musica musica = new Musica();

        ControlRemoto control = new ControlRemoto();

        // Lista de solicitudes (simulación de múltiples usuarios)
        List<Comando> solicitudes = new ArrayList();

        solicitudes.add(new ComandoLuzEncender(luz, "Ana"));
        solicitudes.add(new ComandoVolumenMusica(musica, 20, "Luis"));
        solicitudes.add(new ComandoVolumenMusica(musica, 5, "Carlos"));
        solicitudes.add(new ComandoLuzEncender(luz, "Maria"));

        // Procesar todas las solicitudes
        for (Comando c : solicitudes) {
            control.ejecutarComando(c);
        }

        // Deshacer última acción
        control.deshacerUltimo();

        // Mostrar resumen
        control.mostrarResumen();

	}

}
