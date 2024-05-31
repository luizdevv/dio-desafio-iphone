package com.luiz.funcionalidades;

import java.util.Locale;
import java.util.Scanner;

public class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atender? (sim/não)");

        String res = scanner.next();
        System.out.println("---------------------------------------");

        if (res.toLowerCase(Locale.ROOT) == "sim")
            System.out.println("Você atendeu.");
        else
            System.out.println("Você desligou");

        scanner.close();
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
