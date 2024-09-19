import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];
    private static boolean modoContraMaquina;
    private static char jogadorAtual;
    private static char jogadorMaquina;

    public static void main(String[] args) {
        BoasVindas();
        ModoDeJogo();
        iniciarJogo();
        jogar();
    }

    private static void BoasVindas() {
        System.out.println("==============================================\r\n" + //
                        "=== Seja bem-vindo ao Jogo da Velha!!! ===\r\n" + //
                        "==============================================");
        System.out.println("Por favor, escolha o modo de jogo:");
        System.out.println("1. Jogador vs Jogador");
        System.out.println("2. Jogador vs Máquina");
    }

    private static void ModoDeJogo() {
        Scanner scanner = new Scanner(System.in);
        int posicao;
        do {
            System.out.print("Digite sua escolha: ");
            posicao = scanner.nextInt();
            if (posicao != 1 && posicao != 2) {
                System.out.println("escolha inválida. Por favor, escolha novamente.");
            }
        } while (posicao != 1 && posicao != 2);
        modoContraMaquina = (posicao == 2);
        if (modoContraMaquina) {
            System.out.print("Deseja jogar como Jogador X ou Jogador O? (X/O): ");
            char posicaoJogador = Character.toUpperCase(scanner.next().charAt(0));
            while (posicaoJogador != 'X' && posicaoJogador != 'O') {
                System.out.print("posicao inválida. Por favor, posicao novamente (X/O): ");
                posicaoJogador = Character.toUpperCase(scanner.next().charAt(0));
            }
            jogadorAtual = posicaoJogador;
            jogadorMaquina = (jogadorAtual == 'X') ? 'O' : 'X';
        } else {
            jogadorAtual = 'X';
        }
    }

    private static void iniciarJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void Tabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    private static boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    private static void fazerMovimento(int linha, int coluna, char jogador) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
            System.out.println("Coordenadas inválidas. As coordenadas devem estar entre 0 e 2.");
            return;
        }
        if (tabuleiro[linha][coluna] == ' ') {
            tabuleiro[linha][coluna] = jogador;
        } else {
            System.out.println("Posição já ocupada. Tente novamente.");
            return;
        }
    }
    
    private static void fazerJogadaMaquina() {
        Random random = new Random();
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != ' ');
        System.out.println("A máquina jogou na linha " + linha + " e coluna " + coluna);
        fazerMovimento(linha, coluna, jogadorMaquina);
    }
    
    
    private static void jogar() {
        Scanner scanner = new Scanner(System.in);
        int linha = -1;
        int coluna = -1;
    
        while (true) {
            System.out.println("Jogador " + jogadorAtual + ", é sua vez.");
            Tabuleiro();

            if (jogadorAtual != jogadorMaquina) {
                System.out.print("Digite a linha (0-2): ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna (0-2): ");
                coluna = scanner.nextInt();
                if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
                    System.out.println("Coordenadas inválidas. As coordenadas devem estar entre 0 e 2. Tente novamente.");
                    continue; 
                }
                fazerMovimento(linha, coluna, jogadorAtual);
            } else {
                fazerJogadaMaquina();
            }
            if (verificarVencedor(jogadorAtual)) {
                Tabuleiro();
                if (jogadorAtual == jogadorMaquina) {
                    System.out.println("A máquina venceu! hahaha");
                } else {
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                }
                break;
            } else if (tabuleiroCompleto()) {
                Tabuleiro();
                System.out.println("Empate!");
                break;
            }
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
    private static boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
