package com.DOSW_JJK.Reto7;

public interface Comando {
    void ejecutar();
    void deshacer();

    String getUsuario();
    String getNombre();
}
