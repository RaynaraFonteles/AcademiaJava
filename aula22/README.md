# Aula 22 - JPA e Hibernate

Introdução ao ORM (Object Relational Mapper) ou (Mapeamento de Objeto Relacional)
ORM (Object Relational Mapper) é uma técnica de mapeamento objeto relacional que permite fazer uma relação dos objetos com os dados que os mesmos representam. Essa ferramenta vem crescendo bastante nos últimos anos.
Este crescimento tem se dado principalmente pelo fato de muitos desenvolvedores não se sentirem a vontade em escrever código SQL e pela
produtividade que esta técnica nos proporciona. Existem ótimos ORM's como Hibernate, NHibernate, Entity Framework e etc.

Existem dois mundos: o relacional e o orientado a objetos:
1- No mundo relacional prevalecem princípios matemáticos com a finalidade de armazenar e gerenciar corretamente os dados, de forma segura e se trabalha com a linguagem SQL que é utilizada para dizer o banco de dados “O QUE?” fazer e não como fazer;
2- Já no mundo orientado a objetos trabalhamos com classes e métodos, ou seja, trabalhamos fundamentados na engenharia de software e seus princípios que nos dizem “COMO” fazer. O ORM é justamente, a ponte entre estes dois mundos, ou seja, é ele quem vai permitir que você armazene os seus objetos no banco de dados;
Para isto precisamos fazer um mapeamento dos seus objetos para as tabelas do banco de dados.

-----------------------------------------------------------------------------------------------------------------------------------------

O que é ORM?

É uma técnica de desenvolvimento utilizada para reduzir o atrito da OO utilizada com bancos de dados relacionais. Sua “mágica” é trabalhar com mapeamentos. Vamos entendê-lo através de um exemplo: você tem uma classe Cliente e uma tabela no seu banco de dados
tb_Cliente. Para você ligar ambos você usa uma técnica de mapeamento padrão do ORM chamada Data Mapper. Que nada mais é que o
mapeamento da sua classe com seus respectivos atributos e como ele vai ser inserido dentro do banco de dados. Você usa mecanismos como XML, JSON ou Anotations para fazer o mapeamento entre objeto e tabela, entretanto usaremos Anotations. No JPA para cada atributo de uma classe que corresponde um atributo da tabela você usa uma anotação sendo bem semelhante às anotações: @Override e @Overload.

-----------------------------------------------------------------------------------------------------------------------------------------

JPA (Java Persitence API):

JPA ou Java Persistence API é uma camada que descreve uma interface comum para frameworks ORM, sendo a especificação padrão da plataforma Java EE (Enterprise Edition) para mapeamento objeto-relacional e persistência de dados. Para trabalhar com JPA é preciso incluir no projeto uma implementação, como o Hibernate. Exemplo: Você tem seus objetos persistentes, tal como os de Cliente e quer persistir seus atributos no banco, a JPA, fará o intermédio.
Os mapeamentos se dão através de @anotations que colocamos nas classes. Já as configurações são feitas em um arquivo chamado persistence.xml e nele colocamos coisas básicas como a url do banco, nome e senha do usuário do SGBD (Sistema Gerenciador de Banco de Dados), dentre outras.

-----------------------------------------------------------------------------------------------------------------------------------------

HIBERNATE:

É um framework ORM, sendo a implementação física do que se usará para persistir, remover, atualizar ou buscar dados do banco. Ele que vai seguir as especificações do JPA no seu projeto, inclusive é responsável por todo trabalho de baixa serialização de dados como, por exemplo, a criação de uma query a ser consumida pelo JPA. Então, basicamente o Hibernate, seguindo as especificações do JPA, irá fazer a conversão de objetos em entidades baseadas em SQL, ou seja, ele faz todo o trabalho de baixo nível para converter dados entre paradigmas ER e OO.

-----------------------------------------------------------------------------------------------------------------------------------------

HIBERNATE x JPA:

O JPA é apenas uma interface que define mapeamentos das classes e algumas configurações e o Hibernate apenas a classe que vai implementar essa interface. Sabendo disso, você já consegue entender que o JPA por ser uma interface nunca atua sozinho, enquanto o Hibernate por ser independente pode atuar com outras ferramentas do ecossistema do Java.

-----------------------------------------------------------------------------------------------------------------------------------------

Exercício: 

Baseado no que foi trabalhado na aula, implementar um exemplo utilizando JPA-Hibernate para apresentar em aula. Pode ser operações de inserir, alterar, excluir ou atualizar dados em um banco de dados como foi visto em aula.
