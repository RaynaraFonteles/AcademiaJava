# Aula 29 - Spring Security

O que é o Spring Security?
Primeiramente o Spring Security é um framework do projeto Spring que possui um sistema de autenticação e autorização de alto nível e altamente customizável para aplicações Java. A framework inclusive é a solução oficial para implementação de recursos de segurança em aplicações Spring Boot, porém ele também pode ser utilizado em conjunto com outras frameworks.

Funcionalidades do Spring Security: 
Ainda que o foco do Spring Security seja o sistema de autenticação e autorização, ele possui outras funcionalidades que aumentam a segurança de nossas aplicações Java, aqui vai uma lista de algumas de suas principais funcionalidades:
- Sistema de autenticação;
- Sistema de autorização;
- Proteção contra ataques como session fixation, clickjacking e cross site request forgery;
- Integração com a Servlet API;
- Integração opcional com o Spring Web MVC;
- Fácil instalação através de um starter Spring Boot.

----------------------------------------------------------------------------------------------------------------------------------------

Autenticação

Basicamente podemos dizer que a autenticação é o login na nossa aplicação. Trata-se da etapa de verificação se um determinado usuário possui credenciais (geralmente, combinação de login e senha) válidas para acessar a nossa aplicação. Especificamente o sistema de autenticação do Spring Security pode ser configurado para que utilize diferentes estratégias de autenticação, pois o mesmo trabalha com o conceito de providers de autenticação. Os providers de autenticação são as estruturas responsáveis por efetivar as informações sobre os usuários que acessam a aplicação. Dessa maneira, você pode ter uma série de providers diferentes para utilizar nas aplicações.
O próprio Spring Security já expõe alguns providers para serem prontamente utilizados, como os providers baseados na JPA.

----------------------------------------------------------------------------------------------------------------------------------------

Autorização

Já a autorização é um processo que acontece depois da autenticação. É o momento onde a aplicação verifica se o usuário atualmente autenticado tem permissão de acesso a um determinado recurso. O sistema de autorização do Spring Security também é bastante flexível, pois nos permite definir com facilidade quais são os possíveis tipos de usuários da nossa aplicação, como o sistema relaciona cada
usuário com o seu determinado tipo e quais rotas de nossa aplicação cada tipo de usuário terá acesso.

----------------------------------------------------------------------------------------------------------------------------------------

Criptografia 

Além dos sistemas de autenticação, autorização e proteção contra diferentes tipos de vulnerabilidades de aplicações web, o Spring Security também disponibiliza algoritmos de criptografias que evitam que sua aplicação guarde as senhas de seus usuários em texto puro no banco de dados. Os algoritmos disponibilizados no Spring Security são o bcrypt, PBKDF2, scrypt e argon2. Sendo o bcrypt o mais utilizado pela comunidade.

----------------------------------------------------------------------------------------------------------------------------------------

JWT - Json Web Token
JWT (JSON Web Token) é um método RCT 7519 padrão da indústria para realizar autenticação entre duas partes por meio de um token assinado que autentica uma requisição web. Esse token é um código em Base64 que armazena objetos JSON com os dados que permitem a autenticação da requisição.

Como funciona o JWT:
O usuário envia uma requisição para o servidor informando o usuário e senha e o O servidor devolve o token JWT.

Composição do Token JWT:
- Header: É o cabeçalho do token e contém dois campos: alg, que informa o algoritmo usado para criar a hash da assinaturas; e typ, que indica que este se trata de um token JWT;
- Payload: É onde se encontram os dados referentes a autenticação. Por ser codificado em Base64, não é recomendado utilizar dados sensíveis;
- Signature: É a assinatura única de cada token, gerada através de um algoritmo de criptografia, o mais comum é o HS256.
