import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Colecoes {

}

public static List<String> inverteLista(List<String> palavras) {
    List<String> palavrasInvertidas = new ArrayList<>();

    for(int i = palavras.size() -1; i >= 0; i--) {
        String palavra = palavras.get(i);
        palavrasInvertidas.add(palavra);
    }
}

public static int contaPalavrasDistintas(List<String> palavras) {
    Set<String> palavrasSemRepeticao = new hashSet<>();

    for(String palavra : palavras) {
        palavrasSemRepeticao.add(palavra.toUpperCase());
    }


    return palavrasSemRepeticao.size();
}

public static Map<String, Integer> contaPalavra(List<String> palavra) {
    Map<String, Integer> contaPalavras = new HashMap<>();

    for(String palavra : palavras) {
        if(contaPalavras.keySet().contains(palavra)) {
            int quantidadePalavras = contaPalavras.get(palavra);
            contaPalavras.put(palavra, quantidadePalavras + 1);
        } else {
            contaPalavras.put(palavra, 1);
        }
    }

    return contaPalavras;
}