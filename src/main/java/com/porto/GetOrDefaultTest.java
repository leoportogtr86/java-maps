package com.porto;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultTest {
    public static void main(String[] args) {
        Map<String, String> nomesProfissoes = new HashMap<>();

        nomesProfissoes.put("Leonardo", "programador");
        nomesProfissoes.put("Davi", "estudante");
        nomesProfissoes.put("Liz", "estudante");
        nomesProfissoes.put("Chris", "fonoaudióloga");

        System.out.println(nomesProfissoes.getOrDefault("Leo", "Analista de TI"));
    }
}
