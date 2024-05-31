package com.luiz.funcionalidades;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar(Boolean pausado) {

        String res = pausado == false ? "Pausando..." : "Despausando...";

        System.out.println(res);
    }

    public void selecionarMusica(String musica) {

    }
}
