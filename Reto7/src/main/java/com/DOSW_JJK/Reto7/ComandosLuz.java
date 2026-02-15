package com.DOSW_JJK.Reto7;

public class ComandosLuz implements Comando {
    private Luz luz;
    private String usuario;

    public ComandosLuz(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }

    @Override
    public void deshacer() {
        luz.apagar();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getNombre() {
        return "Encender Luz";
    }
}
