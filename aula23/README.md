# Aula 23 - Servlet

O que são Servlets?
A tecnologia Servlet é uma classe Java, que consegue gerar páginas dinâmicas para a camada de apresentação de aplicações web. O principal objetivo é receber chamadas HTTP, sendo processada e devolvida uma resposta para o cliente. Os servlets trabalham juntamente com a tecnologia Java Server Pages (JSP).

Por que usar Servlets?
- Portabilidade - Os servlets permitem serem movidos para outros aplicações Java e sistemas operacionais;
- Desempenho - Ao contrário da tecnologia CGI, cada solicitação é gerenciada pelo processo do container;
- Agilidade - Possui acesso às bibliotecas Java, que ajudam no ciclo do desenvolvimento;
- Robustez - Pelos servlets serem gerenciados pela JVM, não tem muitos problemas de memória.

-----------------------------------------------------------------------------------------------------------------------------------------

O que é Servlet Container?
O servlet pode ser carregado ou executado através por um servidor web especial, conhecido como “Container”. Isso acontece, porque os Servlets não possuem um método main().

O que é Servlet Container?
O Container trata dos seguintes casos em uma aplicação web, quando envolve servlets que são:
- Criação do servlet ou da nova thread para tratar uma solicitação de resposta;
- Invocação do método doPost() ou doGet() do servlet;
- Tratamento do envio das solicitações de requisição e resposta HTTP;
- Gerenciamento da vida e morte dos recursos do servlet.

-----------------------------------------------------------------------------------------------------------------------------------------

Vantagens do Container:
O Container proporciona uma série de benefícios que são:
- Suporte para comunicações;
- Suporte a multithread;
- Segurança;
- Suporte ao JSP;
- Gerenciamento do ciclo de vida.

-----------------------------------------------------------------------------------------------------------------------------------------

Arquitetura do servlet:
A simulação desse diagrama acontece quando o Cliente (usuário) clica em um link que é chamado um servlet. Após isso, quando o container visualiza que a requisição (request) aponta para um servlet, ele cria dois objetos: HttpServletResponse e HttpServletRequest.
Sendo assim, o Container encontra o servlet correto baseado na URL da requisição, podendo criar ou alocar uma thread para essa requisição, passando os objetos de requisição (request) e resposta (response) para a thread do servlet.
Dependendo de como foi o tipo de solicitação, o Container chama o método doPost() ou doGet() ou service() do servlet. Esse método gera uma página dinâmica e a insere no objeto response. Esse processo termina com a thread, e o Container converte o objeto response em uma resposta HTTP, aonde envia de volta ao cliente e apaga os objetos request e response.
Em uma aplicação Servlet, podem ser incluídos conteúdos estáticos (páginas HTML, arquivos de imagem, entre outros). Como boas práticas é comum deixar que um servidor web fique na frente, para gerenciar todas as solicitações do cliente. O servidor web, serve o conteúdo estático que passa para a aplicação do Container Web.

-----------------------------------------------------------------------------------------------------------------------------------------

Mapeando um Servlet
Após a criação de um servlet, realize-se um processo de mapeamento que auxilia na flexibilidade e segurança da aplicação. Esse processo tem um fator positivo, pois ajuda a esconder do cliente o caminho e o nome do arquivo nos JSPs e as páginas HTML que usam algum servlet.
Geralmente quando o cliente chama o servlet, é visto na barra de endereço o pseudonome que foi dado ao servlet. Por trás desse nome, existe toda uma configuração sofrida na classe do servlet feita pelo programador, contendo o nome da classe e pacote, nome de arquivo e o caminho real.
O arquivo web.xml (WebContent\WEB-INF) conhecido como Deployment Descriptor (DD), serve para informar ao Container como executar os servlets e páginas web. 
Esse arquivo é detalhado na Listagem 1, onde são usados dois elementos XML para mapear as URLs aos servlets, que são: <servlet> - informa ao Container quais arquivos de classes pertencem na aplicação e <servlet-mapping> - informa qual servlet chamar para a url solicitada.
