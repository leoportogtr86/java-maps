package com.porto;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> nomesIdades = new HashMap<>();

        nomesIdades.put("Dave", 12);
        nomesIdades.put("Mary", 42);
        nomesIdades.put("Bill", 20);
        nomesIdades.put("Maria", 18);
        nomesIdades.put("João", 30);

        System.out.println(nomesIdades);
        System.out.println(nomesIdades.get("Maria"));

        if (nomesIdades.containsKey("Maria")){
            System.out.println("Possui a chave \"Maria\".");
            if (nomesIdades.get("Maria") == 18){
                System.out.println("Maria tem 18 anos.");
            }
        }

        nomesIdades.remove("Bill");
        System.out.println(nomesIdades);

        for (Map.Entry<String, Integer> entradas : nomesIdades.entrySet()){
            System.out.println("---------------------");
            System.out.println("Chave: " + entradas.getKey() + "\nValor: " + entradas.getValue());
        }

        System.out.println(nomesIdades.size());
        nomesIdades.clear();
        System.out.println(nomesIdades.size());
    }
}

//1. **Criação de um Mapa**
//        - Crie um `HashMap` que mapeie nomes de pessoas para suas idades.
//        Adicione cinco pares chave-valor e imprima o mapa.

//2. **Acessar Valores**
//        - A partir do mapa criado no exercício 1, recupere e
//        imprima a idade de uma pessoa específica.

//3. **Verificação de Chaves e Valores**
//        - Verifique se o mapa criado no exercício 1 contém uma determinada
//        chave (nome) e valor (idade).

//4. **Remoção de Elementos**
//        - Remova uma entrada específica do mapa criado no exercício 1 e imprima o mapa resultante.

//5. **Iteração sobre um Mapa**
//        - Itere sobre todas as entradas do mapa criado no exercício 1 e imprima cada chave e valor.

//6. **Tamanho do Mapa**
//        - Imprima o tamanho do mapa criado no exercício 1.

//7. **Limpar o Mapa**
//        - Limpe todas as entradas do mapa criado no exercício 1 e verifique se está vazio.
