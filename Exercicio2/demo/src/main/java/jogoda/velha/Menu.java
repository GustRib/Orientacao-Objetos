package jogoda.velha;

import java.util.Scanner;

public class Menu {

    private static Scanner teclado = new Scanner(System.in);

    // Método para exibir a tela inicial
    public static void telaInicial() {
        String opcoes = "Como deseja jogar? \n"
                + "\t(1) Jogador 1 x Jogador 2\n"
                + "\t(2) Jogador 1 x Máquina\n"
                + "\t(3) Sair do programa\n";

        System.out.println(opcoes);
    }

    public static int leInteiro() {
        while (!teclado.hasNextInt()) {
            System.out.println("Insira um valor valido entre 1, 2 ou 3: ");
            teclado.next();
        }
        return teclado.nextInt();
    }

    // Método para criar jogadores de acordo com a opção selecionada
    public static Jogador[] criarJogadores(int opcao) {
        Jogador jogador1;
        Jogador jogador2;

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Jogador 1 x Jogador 2");
                jogador1 = new Jogador(1);
                jogador2 = new Jogador(2);
                break;
            case 2:
                System.out.println("Você escolheu Jogador 1 x Máquina");
                jogador1 = new Jogador(1);
                jogador2 = new Jogador(3);
                break;
            case 3:
                System.out.println("Saindo do programa...");
                System.exit(0);
                return null;
            default:
                System.out.println("Opcao invalida.");
                return null;
        }

        jogador1.exibirInformacoes();
        jogador2.exibirInformacoes();
        
        return new Jogador[]{jogador1, jogador2};
    }
}
