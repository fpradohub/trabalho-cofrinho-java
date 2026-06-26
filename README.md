# Cofrinho de Moedas - Programação Orientada a Objetos (Java)

Este é um projeto acadêmico desenvolvido em Java como parte do curso de **Análise e Desenvolvimento de Sistemas (UNINTER)**. O sistema simula um cofrinho de moedas no terminal, permitindo a adição, remoção e listagem de moedas de diferentes nacionalidades, além de calcular o valor total convertido para Reais (BRL).

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 11 ou superior)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **IDE Recomendada:** Eclipse, IntelliJ IDEA ou VS Code

---

## 💡 Conceitos de POO Demonstrados
O projeto foi desenvolvido com foco na aplicação prática dos pilares da Programação Orientada a Objetos:

1. **Abstração:** Representada pela classe abstrata `Moeda`, que define a estrutura comum para qualquer tipo de moeda (atributo `valor` e método abstrato `converter()`).
2. **Herança:** As moedas específicas (`Real`, `Dolar` e `Euro`) estendem a classe abstrata `Moeda`, herdando seus comportamentos e atributos básicos.
3. **Polimorfismo:** 
   * O método `converter()` é implementado individualmente por cada moeda, aplicando sua própria taxa de conversão.
   * O `Cofrinho` gerencia um `ArrayList<Moeda>` e percorre a lista chamando o método de conversão de forma genérica, sem precisar saber o tipo exato da moeda em tempo de execução.
4. **Encapsulamento:** Organização lógica em pacotes (`empresa`) e delegação de responsabilidades de cada classe de maneira isolada e segura.

---

## 📥 Como Rodar o Projeto

### Pré-requisitos
Certifique-se de ter o **Java JDK** instalado e configurado nas suas variáveis de ambiente.

### Execução via Terminal
1. Clone o repositório ou baixe os arquivos.
2. Navegue até a pasta `src` do projeto:
   ```bash
   cd src
   ```
3. Compile as classes do pacote `empresa`:
   ```bash
   javac empresa/*.java
   ```
4. Execute a classe principal:
   ```bash
   java empresa.Principal
   ```

---

## 🖥️ Exemplo de Uso
Ao iniciar o programa, o seguinte menu interativo será exibido no console:

```text
Menu
1 - Adicionar
2 - Remover
3 - Listar
4 - Calcular total convertido para Real
0 - Encerrar
```

Você poderá escolher depositar ou retirar moedas nas seguintes opções de moeda:
* **Dólar (USD)**
* **Euro (EUR)**
* **Real (BRL)**
