    Scanner scanner = new Scanner(System.in);

    // Se o modo de jogo for contra a máquina e o jogador escolhido for 'O', a máquina joga primeiro
    if (modoContraMaquina && jogadorAtual == 'O') {
        int linhaBot, colunaBot;
        System.out.println("A máquina está pensando...");
        // Simular a jogada da máquina
        do {
            linhaBot = new Random().nextInt(3);
            colunaBot = new Random().nextInt(3);
        } while (tabuleiro[linhaBot][colunaBot] != ' ');
        tabuleiro[linhaBot][colunaBot] = jogadorMaquina;
        jogadorAtual = jogadorMaquina; // Alterar o jogador atual para a máquina
    }

    // Loop principal do jogo
    while (true) {
        System.out.println("Jogador " + jogadorAtual + ", é sua vez.");
        exibirTabuleiro();

        // Solicitar ao jogador as coordenadas
        System.out.print("Digite a linha (0-2): ");
        int linha = scanner.nextInt();
        System.out.print("Digite a coluna (0-2): ");
        int coluna = scanner.nextInt();

        // Fazer o movimento
        fazerMovimento(linha, coluna, jogadorAtual);

        // Verificar se houve um vencedor ou empate
        if (verificarVencedor(jogadorAtual)) {
            exibirTabuleiro();
            System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
            break;
        } else if (tabuleiroCompleto()) {
            exibirTabuleiro();
            System.out.println("Empate!");
            break;
        }

        // Alternar para o próximo jogador
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
    scanner.close();
}