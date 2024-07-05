### Uso do Método `getOrDefault` em Java

O método `getOrDefault` é uma adição relativamente recente ao Java Collections Framework, introduzido na versão 8 da
linguagem. Ele oferece uma maneira conveniente e eficiente de lidar com valores ausentes em Mapas. Neste artigo, vamos
explorar em detalhes o método `getOrDefault`, sua sintaxe, funcionamento e alguns exemplos práticos de uso.

#### O que é o Método `getOrDefault`?

O método `getOrDefault` é usado para recuperar o valor associado a uma chave específica em um Mapa. Se a chave não
estiver presente no Mapa, o método retorna um valor padrão especificado. Isso elimina a necessidade de verificações
manuais de nulidade ou ausência da chave, tornando o código mais conciso e legível.

#### Sintaxe

A assinatura do método `getOrDefault` é a seguinte:

```java
V getOrDefault(Object key, V defaultValue)
```

- `key`: a chave cuja presença no Mapa está sendo verificada.
- `defaultValue`: o valor a ser retornado se a chave não estiver presente no Mapa.

#### Como Funciona?

Quando o método `getOrDefault` é chamado:

1. Ele verifica se a chave especificada está presente no Mapa.
2. Se a chave estiver presente, ele retorna o valor associado a essa chave.
3. Se a chave não estiver presente, ele retorna o valor padrão fornecido.

#### Exemplo Prático

Vamos considerar um exemplo onde usamos um `HashMap` para armazenar a contagem de palavras em uma lista de palavras. O
método `getOrDefault` será utilizado para simplificar o processo de contagem.

```java
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploGetOrDefault {

    public static void main(String[] args) {
        // Lista de palavras
        List<String> palavras = List.of("java", "c", "python", "java", "c", "java");

        // Mapa para armazenar a contagem de palavras
        Map<String, Integer> contagem = new HashMap<>();

        // Itera sobre cada palavra na lista
        for (String palavra : palavras) {
            // Usa getOrDefault para obter a contagem atual ou 0 se a palavra não estiver presente
            int contagemAtual = contagem.getOrDefault(palavra, 0);

            // Atualiza a contagem no mapa
            contagem.put(palavra, contagemAtual + 1);
        }

        // Imprime o resultado
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println("Palavra: " + entrada.getKey() + ", Contagem: " + entrada.getValue());
        }
    }
}
```

#### Vantagens do Uso de `getOrDefault`

1. **Simplicidade e Legibilidade**: Reduz a necessidade de verificações explícitas de nulidade, tornando o código mais
   fácil de entender.

   Antes do `getOrDefault`:

   ```java
   int contagemAtual;
   if (contagem.containsKey(palavra)) {
       contagemAtual = contagem.get(palavra);
   } else {
       contagemAtual = 0;
   }
   contagem.put(palavra, contagemAtual + 1);
   ```

   Com `getOrDefault`:

   ```java
   contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
   ```

2. **Eficiência**: Reduz a sobrecarga de múltiplas chamadas de método, melhorando a performance em cenários onde a
   verificação de ausência de chaves é frequente.

3. **Código Conciso**: Menos linhas de código para alcançar o mesmo objetivo, facilitando a manutenção e a leitura do
   código.

#### Casos de Uso Comuns

1. **Contagem de Frequências**: Como visto no exemplo acima, contar a frequência de elementos em uma coleção.
2. **Configurações e Parâmetros**: Recuperar valores de configuração com valores padrão caso a chave não esteja
   definida.
3. **Inicialização de Valores**: Evitar a inicialização manual de valores ausentes em Mapas.

#### Conclusão

O método `getOrDefault` é uma ferramenta poderosa e conveniente para lidar com valores ausentes em Mapas. Ele simplifica
o código, melhora a legibilidade e pode levar a uma escrita mais eficiente e menos propensa a erros. Ao
utilizar `getOrDefault`, os desenvolvedores podem escrever código mais limpo e robusto, especialmente em cenários onde a
presença de chaves no Mapa é incerta.