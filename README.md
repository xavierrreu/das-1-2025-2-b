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

# AULA 07/08/2025 e 11/08/2025

### SOLID
#### Os princípios SOLID são conhecidos como padrões a serem seguidos no desenvolvimento de qualquer produto de software. São eles:
    - *Single Responsibility Principle*
    - *Open/Closed Principle*
    - *Liskov Substitution Principle*
    - *Interface Segregation Principle*
    - *Dependency Inversion Principle*

#### Single Responsibility Principle
O princípio da responsabilidade única é uma aplicação direta do conceito de coesão. A proposta é simples: toda a classe deve ter uma, e somente uma, responsabilidade. Além disso, é válido compreendermos o princípio por meio da seguinte frase 'Deve haver um único motivo para alterar uma classe no sistema'.
#### Exemplo: A próxima classe ilustra uma violação do Princípio da Responsabilidade Única. O método calculaIndiceDesistencia da classe Disciplina possui duas responsabilidades: calcular o índice de desistência de uma disciplina e imprimi-lo no console do sistema.

    - class Disciplina {
    -
    -   void calculaIndiceDesistencia() {
    -     indice = "calcula índice de desistência"
    -     System.out.println(indice);
    -   }
    -
    - }

A solução seria segmentar a classe que realiza o cálculo do índice da classe que apresenta o resultado ao usuário na console.

#### Interface Segregation Principle
O princípio define que interfaces têm que ser pequenas, coesas e, mais importante ainda, específicas para cada tipo de cliente. O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar.

#### Dependency Inversion Principle
Um cliente deve estabelecer uma dependência com abstrações, prioritariamente, não com implementações completas. Abstrações - principalmente interfaces - são muito mais estáveis do que a própria classe.
O exemplo de utilização foi o projeto de fábrica de software, no qual criávamos uma dependência entre os controllers com as interfaces(abstrações), que buscavam a forma com a qual os processos deveriam ser implementados nos arquivos 'serviceXXXImpl.java'.

Clientes (controller) -> interfaces(service) -> implementações (serviceIMPL). Os controllers não conhecem as implementações, e vice-versa.

#### Prefira Composição à Herança
Herança deve ser evitada ao máximo, visto que é um dos principais fontes de problemas. *Sempre preferimos substituí-las por associações.*
Herança expõe muitos dados da super-classe (classe pai), e isso viola o encapsulamento da classe pai.
Heranças são somente utilizadas quando os filhos de uma super-classe não tiverem chance de se misturarem ou se substituírem. Quando forem totalmente apartados.
Lembrar-se do conceito de gato e cachorro. Se ambos herdarem dados de uma classe 'animal' não há problema, porque um nunca substituirá o outro.

#### Princípio de Demeter
Conhecido como do menor conhecimento, defende que a implementação de um método deve invocar apenas os seguintes outros métodos. "Devo conhecer somente o que me é mostrado ou o que faz parte de mim":
    - De sua própria classe;
    - De objetos passados como parâmetro;
    - De objetos criados pelo próprio método;
    - De atributos da classe do método;

#### Open/Close Principle
Uma classe deve estar fechada para modificações e aberta para extensões. Basicamente, eu preciso fazer com que a modificação seja dificultada no código fonte, mas devo permitir com que pessoas adicionem e customizem os objetos por meio de extensões, sem que a fonte do código seja afetada em si. Como se fossem novas camadas sobrepostas.

#### Princípio da Substituição de Liskov
O princípio de Liskov diz que, em caso de herança, todos os filhos devem implementar, no mínimo, exatamente todas os métodos da classe pai. Ou seja, se a classe pai tem os métodos A e B, o filho 01 DEVE implementar os métodos A e B e PODE implementar outros extras (c, e); e o filho 02 DEVE implementar os métodos A e B e PODE implementar outros  (d, f).
A aplicação desse princípio faz com que seja possível realizar a troca dos filhos sem grandes perdas ou quebras no código, já que os métodos da classe pai sempre são implementados por todas as classes-filho.

# AULA 18/08/2025
### Padrões de Projetos (Design Patterns)
São conjunto de soluções padrão para problemas comuns enfrentados em projetos de software.
Site: https://refactoring.guru/design-patterns

# AULA 28/08/2025
Arquitetura é sobre algo importante… seja lá o que for.

— Ralph Johnson

escrever uma arquitetura unicamente pela estrutura não exibe essa arquitetura em sua totalidade.“É uma arquitetura de microsserviços.” Nesse caso, o arquiteto fala apenas da estrutura do sistema, não da arquitetura do sistema.

### Caracteristicas: 
As características da arquitetura são outra dimensão da definição da arquitetura de software. As características definem os critérios de sucesso de um sistema, em geral ortogonal quanto à funcionalidade. Note que todas as características listadas não requerem conhecimento da funcionalidade do sistema, embora sejam necessárias para ele funcionar corretamente. - (Requisitos não duncionais).

### Decisões de arquitetura: 
É uma decição de qual modelo iremos utilizar para se trabalhar, onde buscamos escolher com base na maior familaridade com os prosutos de software e vuscamos agilidade e eficiencia na hora de fazer um modelo para se construir algo.(impedindo a camada de apresentação de fazer chamados diretos no banco de dados. As decisões da arquitetura formam os limites do sistema e orientam as equipes de desenvolvimento sobre o que é ou não permitido.)

### Princios de desiner: 
Impedindo a camada de apresentação de fazer chamados diretos no banco de dados. As decisões da arquitetura formam os limites do sistema e orientam as equipes de desenvolvimento sobre o que é ou não permitido.(Evitar o uso de acoplamento no desenvolvimento de software, utilização de mensagem assincrona entre os bancos de dados, utilizando uma boa pratica para evitar dependencias e maiores problemas)

# AULA  01/09/2025

## Expectativas de um Arquiteto
    - Tomar decisões de arquitetura;
    - Análise e melhoria contínua;
    - Manter-se atualizado com as últimas tendências;
    - Assegurar conformidade com as decisões;
    - Exposição e eperiência diversificadas;
    - Conhecimento sobre o domínio do negócio;
    - Habilidades interpessoais;
    - Entender e lidar bem com questões políticas
Basicamente, um arquiteto é a ponte entre a parte política e gestacional da empresa e a parte técnica. Deve haver um perfil de melhoria conínua, análise de oportunidades, visão de negócio e ir sempre além do quesito técnico.
Serve como o guia da equipe, é papel do arquiteto ser o tomador de decisões difíceis sobre questões críticas que direcionam o andamento do projeto/produto/serviço.

## DEVOPS
Filosofia ou área de atuação que tem como objetivo principal a maior agilidade e qualidade das entregas ao cliente final.

### PLANEJAR -> CRIAR -> INTEGRAÇÃO CONTÍNUA -> OPERAR -> COMENTÁRIOS CONTÍNUOS


# AULA 08/09/2025

## Trade-Offs
Trade-offs são trocas, ou seja, para todos os casos existe o lado bom e o lado ruim. Para cada parte de simplificação, existe, por exemplo, uma baixa na performance, ou algo nesse sentido.
O trabalho do engenheiro de software é, exatamente, saber medir os prós e contras de cada tipo de arquitetura e utilizar o BOM SENSO e o conhecimento técnico para equilibrar os pontos bons e ruins, visando otimização da arquitetura com base nas regras de negócio e funcionalidades do sistema em específico.

### Exemplo:
       #### - Em um sistema de leilões de alta escala, não é viável utilizarmos modificações diretamente em banco, visto que a performance será irrisória.
       #### - Em vez disso, podemos utilizar uma arquitetura similar ao design pattern 'Observer', porém entre máquinas distintas, na qual teremos um publisher, um tópico(broker) e diversos subscribers que receberão quaisquer atualizações feitas pelo publisher. (comunicação 1 para muitos).
        --- OBS: importante ressaltar que os subscribers receberão as notificações de forma passiva, ou seja, sem buscar nada (push notifications).
       #### - Outra alternativa é a utilização da arquitetura de filas. A diferença é que, dessa maneira, os receivers necessitam requisitar as mensagens à fila (pooling) para que as recebam. Além disso, existe uma ORDEM das menasgens e elas são ARMAZENADAS na fila e o sender (publicador) precisa mandar 1 cópia da mensagem para CADA FILA (relação 1 para 1).

       #### DIFERENÇAS: na arquitetura de tópico temos um menor acoplamento entre os elementos, porém, a mensagem enviada pelo publisher precisa ser muito mais complexa e extensa, visto que deve ser geral e servir para N casos, independente do que eles requerirem. Já na arquitetura de filas existe um acoplamento maior, mas as mensagens enviadas pelo sender são menos complexas, mais enxutas e mais específicas para cada fila que é associada a um único receiver.

       #### RESOLUÇÃO: FAN-OUT. Basicamente existe o publisher - > tópico -> (1 para muitos) N Filas -> (1 para 1) respecetivos receivers. Dessa forma temos menor acoplamento, ordenação das mensagens e armazenamento (buffer), mas ainda persistimos sem conseguir segregar mensagens especificas para cada receiver, todos vão receber todas.

# ---------------- SEGUNDO BIMESTRE --------------------
# AULA 06/10/25

## Definição das Características da Arquittura
    Durante o levantamento de requisitos para a criação de um produto de software devem ser considerados diversos fatores, incluindo aqueles que não se relacionam diretamente com alguma funcionalidade específica. Por exemplo: Auditoria, Desempenho, Segurança, Requisitos, Dados, Legalidade, Escalabilidade, etc. Esses requisitos são chamados de *Características da Arquitetura*.
    A Arquitetura, diferentemente da codificação e do design, têm como responsabilidade analisar o domínio do problema e, além disso, o domínio do negócio.

    ### Critérios de uma característica da arquitetura:
        - Especifica uma consideração de design fora do domínio;
            - Em vez de requisitos específicos, uma característica comum da arquitetura especifica certo nível de desempenho esperado pela aplicação.

        - Influencia algum aspecto estrutural de design;
            - Características de arquitetura dessa classificação normalmente respondem à pergunta: "a característica da arquitetura requer uma consideração estrutural especial para ter sucesso?". Não definem o comportamento, mas adaptam áreas do produto para que a funcionalidade tenha sucesso.

        - É essencial ou importante para o sucesso da aplicação
            - Quanto mais características da arquitetura, mais complexidade e mais custo envolvido. Portano, uma das tarefas de um Arquiteto de Software deve ser minimizar as características de arquitetura em QUANTIDADE, mas maximizá-las em QUALIDADE.
    
    ### Características Operacionais da Arquitetura
        São elas:
            - Disponibilidade: por quanto tempo o sistema precisa ficar disponível (de forma ininterrúpta);
            - Continuidade: capacidade de recuperação de desastres;
            - Desempenho: testes de estresse, análise de pico, tempos de resposta, etc;
            - Recuperabilidade: em caso de desastre, qual é o tempo necessário para que o sistema fique online novamente? Observa estratégias de backup, requisitos de hardware, etc;
            - Confiabilidade/Segurança: Avalia se o sistema tem missão crítica na forma com a qual afeta as pessoas. Em caso de falha, a perda financeira significará quanto para a empresa?
            - Robustez: capacidade de lidar com condições de erro e limites durante a conexão.
            - Escalabilidade: capacidade de rodar e operar com um número elástico de usuários ativos.

    ### Características Estruturais da Arquitetura
        Os arquitetos também devem se preocupar com a estrutura do código. Muitas vezes o arquiteto tem uma única função na avaliação estrutural de um código, como verificação de taxas de acoplamento, código legível, etc. Abaixo estão alguns termos:
            - Configuração: nível de autonomia que o usuário final tem de mudar os aspectos de configuração do software;
            - Extensão: facilidade de integrar novas partes das funcionalidades;
            - Instabilidade: Facilidade de instalação em diferentes plataformas;
            - Aproveitamento: capacidade de utilizar os mesmos componentes para diversos produtos;
            - Localização: suporte para vários idiomas nas telas de entrada, relatórios, requisitos de caracteres multibyte, unidades de medida, moedas, etc.
            - Manutenção: manutenibilidade do sistema no geral;
            - Portabilidade: capacidade de rodar em mais de uma plataforma (Oracle, SQLServer, SAP, etc);
            - Suporte: qual nível de suporte é necessário pela aplicação?
            - Atualização: capacidade de atualizar com facilidade/rapidez para versões diversas.

    ### Características Transversais da Arquitetura
        Características que não se encaixam em outras categorizações:
            - Acessibilidade;
            - Armazenamento: os dados precisarão ser excluídos após um período de tempo?
            - Autenticação: requisitos de segurança para aferir a real identidade dos usuários;
            - Autorização: requisitos de segurança para assegurar que os usuários acessem somente aquilo que precisam acessar. 
            - Legalidade: restrições legais abordadas pelo produto de software;
            - Privacidade: capacidade de ocultar as transações dos funcionários internos da empresa;
            - Segurança: capacidade de criptografia dos dados;
            - Suporte: nível de suporte necessário para a app;
            - Usabilidade: nível de treinamento necessário para que os usuários de fato consigam utilizar o sistema de forma satisfatória. 

#### É importante ressaltar que raramente os arquitetos encontram uma situação em que conseguem maximizar todas as características da arquitetura. Normalmente a escolha se basea na arquitetura "menos pior" dentre as possíveis.

# AULA 13/10/25
## Design Pattern: CQRS (Command Query Responsibility Segregation)
Basicamente, consiste em otimizar a aplicação para que se conecte em dois bancos de dados, ao invés de apenas 1. O ponto central é, justamente, termos um banco voltado para operações de escrita e outro apenas para leitura. 
Essa política auxilia no load balance, performance e também na segurança geral do ambiente, de certa forma. Já que, caso haja problemas em um dos bancos, existe uma cópia em outro servidor para que seja utilizada enquanto a primeira é recuperada.
O trade-off dessa arquitetura é, principalmente, o custo envolvido, já que os gastos com recursos para o banco de dados são duplicados.

## Padrões Arquiteturais
### A Grande Bola de Lama
    - Basicamente é uma confusão de código mal estruturado, desleixado e unido com fita adesiva e arame. É um projeto que foi construído totalmente de modo orgânico, com reparos pontuais, sem padronização e organização.

### Arquitetura Unitária
    - Um software que é executado em um único servidor (computador). Gravação de software em CD para instalação local nas máquinas que seriam responsáveis por executar os programas.

### Arquitetura Cliente/Servidor
    - Exite um servidor e diversos clientes. Todas as operações nos clientes são validadas no servidor.

### Arquitetura Desktop + servidor de banco de dados (database centric)
    - Existe um servidor central que hospeda o banco e uma instalação específica em cada máquina de usuário final. Lógica está no banco.

### Arquitetura Navegador + servidor web
    - A diferença para a arquitetura anterior é que existe um servidor web que é acessado por todas as máquinas finais e que, por sua vez, acessava o banco. Lógica está no servidor web.