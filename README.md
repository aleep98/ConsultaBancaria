# Consulta Bancária

Uma aplicação de console simples em Java para simular operações bancárias básicas.

## 📋 Funcionalidades

O sistema identifica o usuário e oferece um menu interativo com as seguintes opções:

1.  **Ver Saldo**: Exibe o saldo atual disponível na conta.
2.  **Fazer Transferência**: Permite transferir valores, realizando a validação se o saldo é suficiente antes de concluir a operação.
3.  **Depositar**: Adiciona o valor informado ao saldo da conta.
4.  **Sair**: Encerra a execução do programa.

## 🚀 Como Executar

### Pré-requisitos

*   **Java JDK 15 ou superior**: O código utiliza *Text Blocks* (blocos de texto com `"""`), que se tornaram padrão a partir do Java 15.

### Passo a passo

1.  Abra um terminal na pasta raiz do projeto (a pasta que contém o diretório `src`).

2.  Execute o arquivo diretamente com o seguinte comando. Ele irá compilar e rodar o programa em um único passo:
    ```bash
    java src/ConsultaBancaria.java
    ```
    > **Nota**: Este método de execução direta de arquivos `.java` é um recurso disponível a partir do Java 11, sendo compatível com os pré-requisitos do projeto.

## 🛠️ Tecnologias Utilizadas

*   **Java**: Linguagem principal.
*   **java.util.Scanner**: Para captura de entradas do usuário via terminal.
