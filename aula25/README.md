# Aula 25 - Spring Boot

O que é Spring Boot?
O Spring Boot é um framework Java open source que tem como objetivo facilitar o processo de criação e configuração em aplicações Java. Consequentemente, ele traz mais agilidade para o processo de desenvolvimento, uma vez que devs conseguem reduzir o tempo gasto com as configurações iniciais. 

Com o Spring Boot conseguimos abstrair e facilitar a configuração de, por exemplo:
- Servidores; 
- Gerenciamento de dependências;
- Configurações de bibliotecas;
- Métricas & health checks (testes);
- Entre outros.

Como o Spring Boot funciona?
Para realizar todo esse processo o Spring Boot utiliza um conceito chamado convenção sobre configuração. Mas o que isso significa? Significa que é uma ferramenta que decide para você a melhor forma de se fazer algo. É o que chamamos de ferramenta opinativa, ela toma as decisões no nosso lugar baseado em convenções, aplicando configurações padrões e facilitando o trabalho. No entanto ela não é inflexível e ainda permite uma configuração diferente da default caso o 
usuário assim deseje. Por exemplo, você pode alterar para que ele utilize o Jetty como servidor ao invés do Tomcat que é a configuração padrão. Uma das maiores vantagens que o Spring Boot trouxe ao desenvolvimento é que toda essa configuração não necessita mais ser realizada pelos temidos XMLs, embora ele ainda suporte esse tipo de configuração. A maior parte da configuração pode ser feita de forma programática via anotações.

----------------------------------------------------------------------------------------------------------------------------------------

O Spring Boot é composto por vários módulos que ajudam nesse processo. Alguns deles são:

- Spring Boot: É o módulo principal que ajuda na configuração e integração dos outros módulos;
- Spring Boot Starters: Os starters são dependências que agrupam outras dependências com um propósito em comum. Dessa forma, somente uma configuração é realizada no seu gerenciador de dependências. Por exemplo, o spring-boot-starter-amqp, é um starter que permite a construção de soluções de mensageria baseadas em AMQP e RabbitMQ.

Alguns exemplos de starters disponíveis:
- Spring Boot Starter Web: Auxilia na construção de aplicações web trazendo já disponíveis para uso Spring MVC, Rest e o Tomcat como servidor;
- Spring Boot Starter Test: Contém a maioria das dependências necessárias para realizar testes da sua aplicação: Junit, AssertJ, Hamcrest, Mockito, entre outros;
- Spring Boot Starter Data JPA: Facilita a construção da nossa camada de persistência, ajudando na abstração do nosso banco de dados provendo uma série de facilidades para criação de repositories, escrita de queries, entre outros. Como podem ver, reduzem o número de dependências adicionadas, deixando meu arquivo muito mais limpo.

----------------------------------------------------------------------------------------------------------------------------------------

Spring Boot Autoconfigure
Como dito anteriormente o Spring Boot trabalha de forma opinativa, tomando decisões para você. Mas baseado em que? Essas decisões padrões são baseadas através do conteúdo do seu classpath. O Autoconfigure é responsável por ler este conteúdo e realizar as configurações necessárias para que a aplicação funcione. É ele quem gerencia todo o processo de configuração da aplicação.

Spring Boot Actuator
O Spring Boot Actuator é uma ferramenta que permite monitorar e gerenciar as aplicações implantadas. Dentre os recursos disponibilizados temos:
- Métricas: Obtém e disponibiliza diversos dados da nossa aplicação, como por exemplo, espaço em disco, memória, tempo de resposta etc;
- Logging: Facilita o acesso ao arquivo de log da aplicação por meio de um endpoint específico;
- HeathlChecks: Disponibiliza endpoints de health checks;
- Informações da Aplicação: Permite a disponibilização de informações da aplicação. Por exemplo, versão, informações do git, etc.

Spring Boot Test
O Spring Boot Test contém funcionalidades úteis e anotações que facilitam e ajudam a testar sua aplicação.

Spring Boot Devtools
Spring Boot Devtools é um conjunto de funcionalidades que ajuda o trabalho de qualquer dev. Como, por exemplo, restart automático da aplicação quando ocorre alguma mudança no código.

Spring Tool Suite
O Spring nos fornece uma IDE totalmente customizada para o desenvolvimento de aplicações do ecossistema spring: o Spring Tool Suite (STS). O STS é uma IDE baseada em Eclipse que já vem com algumas funcionalidades facilitadoras para projetos Spring. 

-----------------------------------------------------------------------------------------------------------------------------------------

Desafio:

Desenvolva uma aplicação Spring Boot que demonstre o uso de herança em modelos de dados e um endpoint para listar esses objetos. No projeto, modele uma classe base abstrata representando uma entidade genérica e duas subclasses representando especializações dessa entidade. Implemente um endpoint GET na classe principal do projeto que retorne uma lista da classe ABSTRATA que traga os dados das subclasses. Popule as subclasses antes de listar a classe abstrata, o endpoint terá o nome da classe abstrata.
