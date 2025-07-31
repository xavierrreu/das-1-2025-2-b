# das-1-2025-2-B

# AULA 31/07

## Arquitetura de Código - Engenharia de Software Moderna(Cap.5)

### 1. O que é fazer um software?
Fazer um software é, simplesmente, resolver um problema. A maneira com a qual a computação lida com a resolução do problema e por meio das *abstrações*, que são representações simplificadas de diferentes entidades. 

### 2. Conceito de abstração
Uma abstração é uma representação simplificada de entidades. Funciona como a tradução da linguagem, objetos, personas do mundo real para uma linguagem lógica e computacionalmente condizentes com as necessidades e requisitos de um código.

### 3. Complexidade
A complexidade é uma das maiores barreiras enfrentadas quando utilizamos abstrações. A orientação a objetos, por exemplo, opera na tentativa de segmentar as diversas funções de um determinado código em partes menores e bem definidas, para que haja maior rastreabilidade e facilidade na manutenibilidade do programa como um todo.
O grau de complexidade de um projeto é, simplesmente, um reflexo da complexidade no qual este está envolvido, é função do programador, utilizando-se de ferramentas (como a abstração), buscar simplificar o máximo possível no momento de abstrair o problema real.

## Boas Práticas
### Utilização de Padrões:
É necessário padronizar a nomenclatura das variáveis de acordo com a linguagem que está sendo utilizada no projeto.

### Utilização de frameworks:
É importante aprender um framework, justamente porque as funcionalidades são muito parecidas e aprendendo uma, pode-se utilizar outras da mesma forma.


## Conceitos Gerais
### Ocultamento de Informação:
Não é necessário (nem desejável) que todos os detalhes de um programa sejam expostos ao usuário. Na verdade, é desejável que mascaremos o máximo possível a complexidade, por meio de classes, interfaces, etc.
#### Vantagens:
    - Desenvolvimento em paralelo.
    - Flexibilidade a mudanças. -> a utilização de entidades, por exemplo, permite com que as entidades 'conversem' entre si sem exatamente acessar o código fonte uma da outra.