# Aula 26 - JavaServer Faces (JSF)

O que é Java Server Faces (JSF): JSF é uma estrutura de aplicativo web Java usada para simplificar o desenvolvimento de interfaces de usuário em Java EE.

Por que usar JSF: JSF fornece uma série de vantagens, como a reutilização de componentes, manipulação de eventos, validação de dados, internacionalização e acessibilidade.

Breve histórico e versões do JSF: JSF foi introduzido pela primeira vez em 2004 e desde então passou por várias atualizações, a mais recente sendo a JSF 2.3.

-----------------------------------------------------------------------------------------------------------------------------------------

Arquitetura JSF:
- Modelo MVC (Model-View-Controller): JSF segue o padrão MVC, o que facilita a manutenção e a clareza do código;
- Componentes principais da arquitetura JSF: Managed Beans (backing beans que contêm a lógica de negócios), Navigation Model (controla o fluxo entre páginas), UI Components (elementos de interface do usuário), Renderers (responsáveis por gerar HTML), Validators (verificar a validade dos dados), Converters (converter entre tipos de dados), Event and Listener Model (tratar eventos), Messages (exibir mensagens de erro ou informação).

-----------------------------------------------------------------------------------------------------------------------------------------

Sobre o MVC:

MVC é a sigla para Model-View-Controller, ou Modelo-Visão-Controlador em português. É um padrão de arquitetura de software que separa a aplicação em três componentes principais: Modelo, Visão e Controlador.

- Modelo (Model): É a camada responsável pela lógica de negócios e pela manipulação dos dados. Nela, estão todas as informações e regras de negócio da aplicação. Por exemplo, se você tem uma aplicação que gerencia uma loja, o modelo seria responsável por armazenar os dados dos produtos, calcular descontos, gerenciar o estoque, etc;
- Visão (View): É a camada responsável pela apresentação dos dados ao usuário. Normalmente, ela é composta por interfaces gráficas, como páginas web ou interfaces de aplicativos móveis. A visão pega os dados do modelo e os apresenta ao usuário de uma forma amigável;
- Controlador (Controller): É a camada que faz a ligação entre o Modelo e a Visão. Ele recebe as entradas do usuário através da Visão, processa essas entradas (possivelmente com a ajuda do Modelo) e atualiza a Visão de acordo. Por exemplo, se o usuário clicar em um botão para adicionar um produto ao carrinho de compras, o Controlador seria responsável por receber esse evento, atualizar o Modelo (adicionando o produto ao carrinho) e depois atualizar a Visão (mostrando ao usuário que o produto foi adicionado ao carrinho).

O padrão MVC é muito popular em aplicações web e móveis, pois ele ajuda a separar as responsabilidades e a tornar o código mais organizado e reutilizável.
