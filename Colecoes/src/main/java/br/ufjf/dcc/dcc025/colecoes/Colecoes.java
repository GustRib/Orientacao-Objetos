package br.ufjf.dcc.dcc025.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Colecoes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = teclado.nextLine();

        System.out.println("Frase invertida:");
        List<String> palavras = Palavra.quebraFraseEmPalavras(frase);
        List<String> palavrasInvertidas = inverteLista(palavras);

        for (String palavra : palavrasInvertidas) {
            System.out.print(palavra + " ");

        }
        System.out.println("");

        System.out.println("Quantidade de palavras sem repeticao:");
        System.out.println(contaPalavrasDistintas(palavras));

        System.out.println("Quantidade de palavras sem repeticao des. form.:");
        System.out.println(
                contaPalavrasDistintasDesconsiderandoFormatacao(palavras));
    
        System.out.println("A quantidade de cada palavra eh:");
        Map<String, Integer> contaPalavras = contaPalavras(palavras);
        
        for (String palavra : contaPalavras.keySet()) {
            System.out.println(
                    palavra+" ====> " + contaPalavras.get(palavra));
        }
        
    
    }

    public static List<String> inverteLista(List<String> palavras) {
        List<String> palavrasInvertidas = new ArrayList<>();

        for (int i = palavras.size() - 1; i >= 0; i--) {
            String palavra = palavras.get(i);
            palavrasInvertidas.add(palavra);
        }

        return palavrasInvertidas;
    }

    public static int contaPalavrasDistintas(List<String> palavras) {
        Set<String> palavrasSemRepeticao = new HashSet<>(palavras);

//        for (String palavra : palavras) {
//            palavrasSemRepeticao.add(palavra);
//        }
        return palavrasSemRepeticao.size();
    }

    public static int contaPalavrasDistintasDesconsiderandoFormatacao(List<String> palavras) {
        Set<String> palavrasSemRepeticao = new HashSet<>();

        for (String palavra : palavras) {
            palavrasSemRepeticao.add(palavra.toUpperCase());
        }

        return palavrasSemRepeticao.size();
    }

    public static Map<String, Integer> contaPalavras(List<String> palavras) {
        Map<String, Integer> contaPalavras = new HashMap<>();

        for (String palavra : palavras) {
            if (contaPalavras.keySet().contains(palavra)) {
                int quantidadePalavras = contaPalavras.get(palavra);
                contaPalavras.put(palavra, quantidadePalavras + 1);
            } else {
                contaPalavras.put(palavra, 1);
            }
        }

        return contaPalavras;
    }
}
