# Trabalho de POO: Cofrinho de Moedas em Java

Projeto em console desenvolvido para a matéria de Programação Orientada a Objetos no curso de Análise e Desenvolvimento de Sistemas (UNINTER). É um simulador simples de cofrinho no terminal para praticar os conceitos fundamentais de POO em Java.

---

## O que o projeto faz
* Permite adicionar e remover moedas de Real, Dólar e Euro.
* Lista as moedas atualmente guardadas no cofrinho.
* Calcula o total do cofrinho convertido para Real (BRL) usando taxas de câmbio fixas definidas no código.

---

## Como o código está estruturado (POO)
O projeto foi pensado para aplicar na prática os pilares de POO:
* **Classe Abstrata (`Moeda`):** Define a base com o atributo `valor` e o método `converter()`.
* **Herança:** As classes `Real`, `Dolar` e `Euro` estendem a classe `Moeda`.
* **Polimorfismo:** A conversão de moeda (`converter()`) e o método `toString()` são sobrescritos nas classes filhas. O cofrinho gerencia tudo dinamicamente usando um `ArrayList<Moeda>` e chamando os métodos de forma genérica.
* **Tratamento de Exceções:** Menu interativo no terminal feito com `Scanner` tratando entradas inválidas para evitar travamentos do programa.

---

## Como rodar o programa

### Pré-requisitos
* Java JDK instalado (versão 11 ou superior).

### Passo a passo no terminal
1. Entre na pasta `src/` do projeto:
   ```bash
   cd src
   ```
2. Compile as classes do pacote:
   ```bash
   javac empresa/*.java
   ```
3. Execute o programa:
   ```bash
   java empresa.Principal
   ```

---

## Exemplo de uso no terminal
Ao iniciar o programa, um menu interativo será exibido no console:

```text
Menu
1 - Adicionar
2 - Remover
3 - Listar
4 - Calcular total convertido para Real
0 - Encerrar
```
