### Guia Completo sobre Mapas em Java

Os Mapas (ou `Maps`) são uma parte essencial das estruturas de dados em Java. Eles permitem a associação de chaves a
valores, facilitando a recuperação eficiente de dados. Neste artigo, abordaremos os conceitos fundamentais dos Mapas em
Java, as operações mais importantes e alguns casos de uso práticos.

#### O que é um Mapa?

Um Mapa é uma coleção que mapeia chaves para valores. Cada chave é única, mas pode ser associada a um valor duplicado. A
interface `Map<K, V>` faz parte do Java Collections Framework e é implementada por várias classes,
como `HashMap`, `TreeMap`, `LinkedHashMap`, e `Hashtable`.

#### Principais Implementações de Mapas

1. **HashMap**
    - Não garante a ordem dos elementos.
    - Permite uma chave `null` e vários valores `null`.
    - Melhor performance em operações de inserção, exclusão e busca.

2. **TreeMap**
    - Mantém as chaves ordenadas de acordo com a ordenação natural ou um `Comparator` fornecido.
    - Não permite chaves `null`.

3. **LinkedHashMap**
    - Mantém a ordem de inserção dos elementos.
    - Permite uma chave `null` e vários valores `null`.

4. **Hashtable**
    - Semelhante ao `HashMap`, mas sincronizado.
    - Não permite chaves ou valores `null`.

#### Operações Mais Importantes

Vamos explorar as operações básicas e mais comuns dos Mapas em Java:

##### Criação de um Mapa

```java
Map<String, Integer> map = new HashMap<>();
```

##### Inserção de Elementos

```java
map.put("um",1);
map.

put("dois",2);
map.

put("três",3);
```

##### Acessar um Valor

```java
int valor = map.get("dois"); // retorna 2
```

##### Verificar a Presença de uma Chave ou Valor

```java
boolean contemChave = map.containsKey("um"); // retorna true
boolean contemValor = map.containsValue(3); // retorna true
```

##### Remover um Elemento

```java
map.remove("três"); // remove a entrada com a chave "três"
```

##### Tamanho do Mapa

```java
int tamanho = map.size(); // retorna o número de pares chave-valor no mapa
```

##### Iterar sobre um Mapa

```java
for(Map.Entry<String, Integer> entrada :map.

entrySet()){
        System.out.

println("Chave: "+entrada.getKey() +", Valor: "+entrada.

getValue());
        }
```

##### Limpar o Mapa

```java
map.clear(); // remove todos os elementos do mapa
```

##### Operações Especiais

1. **Obter valores padrão para chaves ausentes**

```java
int valor = map.getOrDefault("quatro", 0); // retorna 0 se a chave "quatro" não estiver presente
```

2. **Computar um valor se a chave estiver ausente**

```java
map.computeIfAbsent("quatro",k ->4); // adiciona a chave "quatro" com valor 4 se não estiver presente
```

3. **Atualizar um valor baseado na chave**

```java
map.computeIfPresent("dois",(k, v) ->v +2); // atualiza o valor associado à chave "dois" para 4
```

#### Casos de Uso

##### Contagem de Frequências

Um dos casos de uso mais comuns para Mapas é contar a frequência de elementos em uma coleção.

```java
String[] palavras = {"java", "c", "python", "java", "c", "java"};
Map<String, Integer> contagem = new HashMap<>();

for(
String palavra :palavras){
        contagem.

put(palavra, contagem.getOrDefault(palavra, 0) +1);
        }
```

##### Implementação de Cache

Usar `LinkedHashMap` para criar um cache LRU (Least Recently Used).

```java
int capacidade = 4;
Map<Integer, String> cacheLRU = new LinkedHashMap<Integer, String>(capacidade, 0.75f, true) {
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > capacidade;
    }
};

cacheLRU.

put(1,"A");
cacheLRU.

put(2,"B");
cacheLRU.

put(3,"C");
cacheLRU.

put(4,"D");
cacheLRU.

get(2); // acessa o valor "B"
cacheLRU.

put(5,"E"); // remove o valor "A" por ser o mais antigo
```

#### Conclusão

Mapas são ferramentas poderosas e versáteis em Java. Compreender as diferentes implementações e operações disponíveis
pode ajudar a resolver uma ampla gama de problemas de programação de forma eficiente. Ao escolher a implementação
correta e usar as operações apropriadas, você pode otimizar o desempenho e a funcionalidade do seu código.