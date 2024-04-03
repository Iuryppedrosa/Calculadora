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

![Calculadora](https://private-user-images.githubusercontent.com/89420889/319290591-04146f90-ba5e-4c8d-9332-0fee219f2aee.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTIxNjU2NjIsIm5iZiI6MTcxMjE2NTM2MiwicGF0aCI6Ii84OTQyMDg4OS8zMTkyOTA1OTEtMDQxNDZmOTAtYmE1ZS00YzhkLTkzMzItMGZlZTIxOWYyYWVlLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MDMlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDAzVDE3MjkyMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTA1NmEyMmNmM2Y4NDhkNDAzYmRkNWMzZWNkZDJjOGIwYWI0ODM3MjY5YTcxMzUzMjAxZmI2OGU3NTQ2OGQzNGQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.6jymI07_mr1zALCCiRg-Jtujup3RPrrMoL4J_8GBhXc)

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
