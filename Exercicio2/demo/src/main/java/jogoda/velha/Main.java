package jogoda.velha;

public class Main {
    public static void main(String[] args) {
        Menu.telaInicial();
        int opcao = Menu.leInteiro();
        Jogador[] jogadores = Menu.criarJogadores(opcao);

        if (jogadores != null) {
            Tabuleiro jogo = new Tabuleiro(jogadores[0], jogadores[1]);
            jogo.jogar();
        }
    }
}
