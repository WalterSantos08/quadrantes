# Identificação de Quadrantes em Java 📊

Este programa em Java determina em qual quadrante um ponto se encontra no plano cartesiano com base em suas coordenadas X e Y.

## 📝 Descrição

O programa:

1. Solicita ao usuário que insira os valores de X e Y.
2. Analisa as coordenadas para determinar sua localização:
   - **Origem**: Se X e Y forem ambos 0.
   - **Eixo X**: Se Y for 0 e X for diferente de 0.
   - **Eixo Y**: Se X for 0 e Y for diferente de 0.
   - **Quadrante 1**: Se X e Y forem positivos.
   - **Quadrante 2**: Se X for negativo e Y for positivo.
   - **Quadrante 3**: Se X e Y forem negativos.
   - **Quadrante 4**: Se X for positivo e Y for negativo.
3. Exibe a saída correspondente à posição do ponto.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac quadrantes.java
   ```
4. Execute o programa:
   ```bash
   java quadrantes
   ```

## 📌 Exemplo de Uso

### Entrada:

```
Digite o valor de X: 
3
Digite o valor de Y: 
-2
```

### Saída:

```
quadrante 4
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura dos valores X e Y**: Captura os números digitados pelo usuário.
- **Verificação da posição**: Utiliza uma série de condicionais para determinar a localização do ponto.
- **Exibição do resultado**: Informa ao usuário onde o ponto se encontra no plano cartesiano.


