package com.example;

import java.util.Scanner;

public class CLI {
    private static Scanner teclado = new Scanner(System.in);

    public static void mostrarValormemoria(int valor) {
        System.out.println("Estado da memória: " + valor);
    }

    public static void listarOpcoes() {
        String opcoes
            = "Opções:\n"
            + "\t(1) Somar\n"
            + "\t(2) Subtrair\n"
            + "\t(3) Multiplicar\n"
            + "\t(4) Dividir\n"
            + "\t(5) Limpar memória\n"
            + "\t(6) Sair do programa\n"
            + "Qual opção você deseja?\n";

        System.out.println(opcoes);
    }

    public static int leInteiro(){
        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, insira um valor inteiro: ");
            teclado.next();
        }
        return teclado.nextInt();
    }

}
