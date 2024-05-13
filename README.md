# Calculadora IOS Clone

Este é um projeto de calculadora desenvolvido em Java com uma interface gráfica semelhante à calculadora IOS, incluindo as mesmas cores e funcionalidades.

## Funcionalidades

- Interface gráfica similar à calculadora IOS.
- Suporte para operações básicas de adição, subtração, multiplicação e divisão.
- Botões de números, ponto decimal, e controle de sinal de números.
- Capacidade de limpar a tela e reiniciar o cálculo.
- Exibição dos resultados em tempo real.

## Demonstração

Aqui está um exemplo de como a calculadora se parece:

![Calculadora](https://github.com/Iuryppedrosa/Calculadora/blob/master/319290591-04146f90-ba5e-4c8d-9332-0fee219f2aee.png?raw=true)
![Calculadora2](https://github.com/Iuryppedrosa/Calculadora/blob/master/319290560-a6d74d4a-7292-4ae7-997e-02b0def359eb.png?raw=true)
## Estrutura do Projeto

- `src/`
  - `br.com.cod3r.calc.visao/`: Pacote contendo as classes responsáveis pela interface gráfica da calculadora.
    - `Botao.java`: Classe que representa os botões da calculadora.
    - `Calculadora.java`: Classe principal da calculadora, organiza a interface gráfica e as operações.
    - `Display.java`: Classe que representa a tela de exibição da calculadora.
  - `br.com.cod3r.calc.modelo/`: Pacote contendo as classes responsáveis pela lógica e modelo da calculadora.
    - `Memoria.java`: Classe responsável por manter o estado e processar as operações da calculadora.
    - `MemoriaObservador.java`: Interface funcional para observadores da memória.
  - `Main.java`: Arquivo de inicialização da aplicação.

## Requisitos

- Java Development Kit (JDK) 8 ou superior.
- Apache Maven (opcional, para gerenciamento de dependências).
