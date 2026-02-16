package com.DOSW_JJK.Reto7;

public class ComandosVolumen implements Comando {
    private Musica musica;
    private int volumen;
    private String usuario;

    public ComandosVolumen(Musica musica, int volumen, String usuario) {
        this.musica = musica;
        this.volumen = volumen;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        musica.cambiarVolumen(volumen);
    }

    @Override
    public void deshacer() {
        musica.silenciar();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getNombre() {
        return "Cambiar volumen música";
    }
}
