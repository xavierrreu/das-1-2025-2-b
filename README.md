# das-1-2025-2-B

# AULA 31/07/2025

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
    - Facilidade do Entendimento. -> Justamente por ser mais setorizado e definido, o entendimento se torna mais simples. Não é mais necessário ler todas as linhas do código para determinar os pontos de melhoria/ajustes.
#### Getters e Setters
Getters e Setters são funcionalidades utilizadas para realizar o encapsulamento do objeto, ou seja, proteger as informações quanto à integridade e consistência dos dados utilizados.


# AULA 04/08/2025


### Coesão
É um atributo chave que faz parte do objetivo principal de todo o projeto. Toda a classe deve ser coesa, ou seja, deve implementar uma única funcionalidade. "Em um saco de farinha deve haver farinha, não açúcar".
#### Vantagens:
    - Facilidade no entendimento e manutenção;
    - Facilita o compartilhamento de responsabilidades dentre as classes, aumentando a "resistência" do projeto como um todo;
    - Facilita a reutilização e a realização de testes em uma classe específica.
    - Um objeto desempenha uma função de forma otimizada e bem-feita. Anti-generalista.

### Acoplamento
O acoplamento é o nome dado ao fator força de ligação entre duas classes. Uma interface, por exemplo, é totalmente independente. Portanto, possui um baixo nível de acoplamento. Quanto maior for a conexão e dependência entre duas classes, maior será o nível de acoplamento entre elas. Isso faz com que qualquer alteração em uma das classes afetará diretamente a segunda. 
Não é possível evitar totalmente o acoplamento, apenas minimizá-lo.
#### Exemplo:
    - Temos a classe A e classe B. A classe B tem um método exemplo(). A classe A acopla o método exemplo da classe B da seguinte forma:
    - class A { private B b; public A (){ b = new B(); b.exemplo();}}
#### OBS:
Durante o código de FABSOFT, utilizamos a cláusula AUTOWIRED no springboot para minimizar o acoplamento. Isso cria um elemento intermediário entre a classe A e B, de forma com que A e B não saibam que, no fim das contas, estão acessando uma a outra.
O AUTOWIRED utiliza uma terceira classe que atua como interface, apenas atuando como intermediária entre a classe que implementa os serviços e a classe que os "chama". Esse processo também é chamado de INJEÇÃO DE DEPENDÊNCIAS.
Além disso, a utilização do Spring Data JPA nos possibilitou um baixo acoplamento com relação aos bancos de dados, porque permitiu com que utilizássemos qualquer banco de dados relacional apenas alterando o dialeto no arquivo de configurações.

## MAXIMIZE A COESÃO E MINIMIZE O ACOPLAMENTO