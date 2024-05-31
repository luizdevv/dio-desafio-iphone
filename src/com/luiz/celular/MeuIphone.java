package com.luiz.celular;

import com.luiz.funcionalidades.AparelhoTelefonico;
import com.luiz.funcionalidades.NavegadorInternet;
import com.luiz.funcionalidades.ReprodutorMusical;

public class MeuIphone {

    public static void main(String[] args) {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();

        //aparelho.ligar("11983156144");
        //aparelho.atender();
        //aparelho.iniciarCorreioVoz();

        ReprodutorMusical spotify = new ReprodutorMusical();

        //spotify.tocar();
        //spotify.pausar(false);
        //spotify.pausar(true);

        NavegadorInternet chrome = new NavegadorInternet();

        chrome.adicionarNovaAba();
        chrome.exibirPagina("www.google.com");
        chrome.atualizarPagina();
    }
}
