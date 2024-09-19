package br.ufjf.dcc.dcc025.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Palavra {
    
    public static  List<String> quebraFraseEmPalavras(String frase){
        
        List<String> palavras = new ArrayList<>();
        String[] arrayPalavras = frase.split(" ");
         
        for(String palavra : arrayPalavras) {
            palavras.add(palavra);
        }

        //Arrays.asList(frase.split(" "))
        return palavras;
    }
    
}
