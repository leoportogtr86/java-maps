package com.porto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex8 {
    public static void main(String[] args) {
        List<String> palavras = List.of("teste", "teste1", "teste2", "teste");

        System.out.println(contaFrequencia(palavras));
    }

    public static Map<String, Integer> contaFrequencia(List<String> palavras) {
        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        return contagem;
    }
}

//8. **Contagem de Frequências**
//        - Crie um método que receba uma lista de palavras e retorne um mapa
//        com a contagem de frequência de cada palavra.
