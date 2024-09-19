package com.example;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int opcao, valor = 0;
        do{
            CLI.mostrarValormemoria((calculadora.getValorMemoria()));
            CLI.listarOpcoes();
            opcao = CLI.leInteiro();

            if(opcao >= 1 && opcao <= 4)
            System.out.println("Digite um valor inteiro:");
            valor = CLI.leInteiro();

            switch (opcao) {
                case 1:
                    calculadora.soma(valor);
                    break;

                case 2:
                    calculadora.subtracao(valor);
                    break;

                case 3:
                    calculadora.multiplicacao(valor);
                    break;

                case 4:
                    calculadora.divisao(valor);
                    break;

                case 5:
                    calculadora.limpaMemoria(valor);
                    break;

                case 6:
                    System.out.println("Tchau!");
                    break;
                
                default:
                    System.out.println("Opcao invalida!");
            }

        }while (opcao != 6);

    }
}
