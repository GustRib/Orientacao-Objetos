package jogoda.velha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
    //Atributos
    private char[][] tabuleiro;
    private static final int TAMANHO = 3;
    private Scanner teclado;
    private Jogador jogador1;
    private Jogador jogador2;
    private List<String> jogadas; 

        // Construtor
    public Tabuleiro(Jogador jogador1, Jogador jogador2) {
        this.tabuleiro = new char[TAMANHO][TAMANHO];
        this.teclado = new Scanner(System.in);
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadas = new ArrayList<>(); 
        inicializarTabuleiro();
    }

    //Métodos Especiais
    private void inicializarTabuleiro() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(" " + tabuleiro[i][j]);
                if (j < TAMANHO - 1) System.out.print(" |");
            }
            System.out.println();
            if (i < TAMANHO - 1) System.out.println("---+---+---");
        }
    }

    public void jogar() {
        Jogador jogadorAtual = jogador1;
        char simboloAtual = 'X';
        boolean jogoAtivo = true;
        int jogadasContadas = 0;

        while (jogoAtivo) {
            imprimirTabuleiro();
            System.out.println(jogadorAtual.getTipo() + " (" + simboloAtual + "), eh a sua vez.");

            int linha, coluna;

            if (jogadorAtual.isJogaAutomaticamente()) {
                int[] movimento = movimentoAutomatico();
                linha = movimento[0];
                coluna = movimento[1];
                System.out.println("Bot escolheu: linha " + (linha + 1) + ", coluna " + (coluna + 1));
            } else {
                linha = leInteiro("Digite a linha (1-3): ") - 1;
                coluna = leInteiro("Digite a coluna (1-3): ") - 1;
            }

            if (linha >= 0 && linha < TAMANHO && coluna >= 0 && coluna < TAMANHO && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = simboloAtual;
                jogadasContadas++;
                jogadas.add("Jogada " + jogadasContadas + ": " + jogadorAtual.getTipo() + " (" + simboloAtual + ") - Linha: " + (linha + 1) + ", Coluna: " + (coluna + 1));

                if (verificarVitoria(simboloAtual)) {
                    imprimirTabuleiro();
                    System.out.println(jogadorAtual.getTipo() + " (" + simboloAtual + ") venceu!");
                    jogoAtivo = false;
                } else if (jogadasContadas == TAMANHO * TAMANHO) {
                    imprimirTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
                    simboloAtual = (simboloAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("movimento invalido.");
            }
        }

        
        System.out.println("\nsequencia de jogadas:");
        for (String jogada : jogadas) {
            System.out.println(jogada);
        }
    }

    private int[] movimentoAutomatico() {
        Random rand = new Random();
        int linha, coluna;
        do {
            linha = rand.nextInt(TAMANHO);
            coluna = rand.nextInt(TAMANHO);
        } while (tabuleiro[linha][coluna] != ' ');
        return new int[]{linha, coluna};
    }

    private boolean verificarVitoria(char jogador) {
        for (int i = 0; i < TAMANHO; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }

    private int leInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!teclado.hasNextInt()) {
            System.out.println("insira um valor valido.");
            teclado.next();
            System.out.print(mensagem);
        }
        return teclado.nextInt();
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(1);
        Jogador jogador2 = new Jogador(3); 

        Tabuleiro jogo = new Tabuleiro(jogador1, jogador2);
        jogo.jogar();
    }
}
