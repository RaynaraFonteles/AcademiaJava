# Aula 28 - SpringBoot e Http - Estrutura

HTTP - HTTP (Hypertext Transfer Protocol) é o protocolo fundamental usado na World Wide Web para transferência de dados. Ele define como as mensagens são formatadas e transmitidas, e quais ações os servidores e navegadores devem tomar em resposta a comandos diversos.

Método HTTP - As chamadas HTTP são caracterizadas por métodos que indicam a ação desejada a ser realizada para um recurso identificado. Os métodos HTTP mais comuns são:

- GET: Solicita a representação de um recurso específico. GET solicitações devem ser apenas de recuperação de dados e não devem causar efeitos colaterais no servidor;
- POST: Envia dados para serem processados para um recurso específico. Frequentemente usado para submeter formulários ou fazer upload de dados;
- PUT: Substitui todas as representações atuais do recurso de destino pelos dados da requisição;
- DELETE: Remove um recurso específico.

----------------------------------------------------------------------------------------------------------------------------------------

Cabeçalhos HTTP - Cabeçalhos HTTP fornecem informações adicionais sobre a requisição ou resposta. Por exemplo, cabeçalhos podem indicar o tipo de conteúdo da mensagem (Content-Type), autenticação, cache, entre outros.

Corpo da Mensagem - Nem todas as requisições HTTP têm um corpo. Por exemplo, as requisições GET geralmente não têm. Em requisições POST e PUT, o corpo da mensagem contém os dados a serem enviados ao servidor.

REST (Representational State Transfer) - REST é um estilo arquitetural frequentemente usado em APIs da Web. Em APIs REST, as operações HTTP são usadas de maneira padronizada sobre os recursos, como usar GET para recuperar um recurso, POST para criar um novo recurso, PUT para atualizar um recurso e DELETE para remover um recurso.

----------------------------------------------------------------------------------------------------------------------------------------

Códigos de Status de Resposta - Após uma requisição ser feita, o servidor responde com um código de status HTTP. Alguns dos códigos de status comuns incluem:

- 200 OK: A requisição foi bem-sucedida;
- 201 Created: A requisição foi bem-sucedida e um novo recurso foi criado;
- 400 Bad Request: A requisição não foi entendida devido a má formação;
- 401 Unauthorized: Autenticação é necessária e falhou ou ainda não foi fornecida;
- 403 Forbidden: O servidor entendeu a requisição, mas se recusa a autorizá-la;
- 404 Not Found: O recurso requisitado não foi encontrado;
- 500 Internal Server Error: Erro genérico quando o servidor encontra uma condição inesperada.

----------------------------------------------------------------------------------------------------------------------------------------

Model - O "Model" em uma aplicação Spring Boot, especialmente quando se usa o Spring Data JPA, refere-se geralmente às classes de entidade que são mapeadas para tabelas em um banco de dados. Essas classes de entidade são o cerne do padrão ORM (Object-Relational Mapping), que permite interagir com um banco de dados relacional usando objetos Java. 

----------------------------------------------------------------------------------------------------------------------------------------

Controller - Um controller é um componente fundamental em muitos frameworks de desenvolvimento web, incluindo o Spring MVC (Model-View Controller), que ajuda a gerenciar o fluxo de uma aplicação web e a lidar com solicitações HTTP vindas dos clientes. A principal responsabilidade de um controller é receber as solicitações do cliente, processá-las e determinar qual ação deve ser tomada em resposta a essas solicitações. Os controllers são parte essencial da arquitetura MVC, que separa a lógica de negócios (Model), a apresentação (View) e o controle de fluxo (Controller) em uma aplicação web. Isso permite uma melhor organização do código e a reutilização de componentes, tornando o desenvolvimento mais eficiente e manutenível. Em resumo, um controller em um framework web é responsável por receber, processar e responder a solicitações HTTP, desempenhando um papel crucial na interação entre o cliente e a aplicação web.

----------------------------------------------------------------------------------------------------------------------------------------

Service - A camada Service em uma aplicação Spring Boot é onde a lógica de negócios é implementada. Esta camada atua como um intermediário entre a camada de apresentação (normalmente os Controllers) e a camada de acesso a dados (os Repositories). O propósito principal dos Services é encapsular a lógica de negócios complexa, regras de aplicação, e transações.

Características dos Services:

- Encapsulamento da Lógica de Negócios: Services são responsáveis por operações de negócios mais complexas e regras específicas, mantendo esta lógica separada e independente da lógica de acesso a dados ou da lógica de apresentação;
- Transações: Muitas vezes, um Service pode envolver a execução de várias operações de banco de dados que devem ser realizadas como uma única transação. Os Services são ideais para gerenciar tais transações;
- Reutilização: A lógica dentro de um Service pode ser reutilizada por diferentes Controllers ou até mesmo outros Services, promovendo a reutilização de código e reduzindo a duplicação;
- Separação de Responsabilidades: Ao manter a lógica de negócios separada dos Controllers e Repositories, os Services contribuem para uma arquitetura mais limpa e manutenível;
- Facilita os Testes: Com a lógica de negócios centralizada nos Services, torna-se mais fácil escrever testes unitários e de integração para essas funcionalidades específicas.

----------------------------------------------------------------------------------------------------------------------------------------

Repository - Os Repositories no Spring Boot são interfaces que abstraem a camada de acesso a dados, facilitando a interação com o banco de dados sem que haja necessidade de implementar métodos de consulta comuns. Eles são parte do padrão Repository, que separa a lógica de negócios da lógica de acesso a dados. O Spring Data JPA é frequentemente usado para implementar essas interfaces, pois fornece métodos CRUD prontos e a capacidade de definir consultas personalizadas de forma declarativa.

Características dos Repositories:

- Abstração de Acesso a Dados: Fornece uma camada abstrata para acessar dados, o que permite mudar a implementação de acesso a dados sem alterar a lógica de negócios;
- Métodos CRUD Prontos: Spring Data JPA fornece implementações padrão para operações CRUD, reduzindo a quantidade de código boilerplate necessária;
- Consulta Declarativa: Permite a criação de consultas personalizadas usando anotações ou seguindo convenções de nomenclatura de métodos;
- Integração com o ORM: Trabalha em conjunto com frameworks ORM como Hibernate para mapear entidades de banco de dados para objetos Java.
