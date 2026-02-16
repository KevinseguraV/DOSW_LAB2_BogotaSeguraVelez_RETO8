package com.DOSW_JJK.Reto7;

import java.util.*;

public class ControlRemoto {
    private List<Comando> historial = new ArrayList();

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.add(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            Comando ultimo = historial.remove(historial.size() - 1);
            ultimo.deshacer();
        }
    }

    public void mostrarResumen() {
        System.out.println("\n-------------- RESUMEN FINAL ------------");
        for (Comando c : historial) {
            System.out.println(c.obtenerNombre() + " -> Usuario: " + c.obtenerUsuario());
        }
    }
}
