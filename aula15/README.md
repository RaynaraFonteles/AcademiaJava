# Aula 16 - Gerenciamento de Projetos com Maven

Maven:
Apache Maven é uma ferramenta de gerenciamento de projetos usada para gerenciar projetos desenvolvidos usando principalmente linguagens JVM, como Java. Ele é baseado no conceito de POM. Maven também é chamado de ferramenta de construção ou ferramenta de gerenciamento de dependências.

Principais tarefas e praticidades:
- Construir o Código Fonte;
- Testar de código-fonte;
- Empacotar o código-fonte em um artefato (ZIP, JAR, WAR ou EAR);
- Lidar com o controle de versão e releases dos artefatos;
- Gerar JavaDocs a partir do código-fonte;
- Gerenciar Dependências do Projeto.

Estrutura do Maven:
- A pasta src é a raiz do código-fonte e dos testes de nosso aplicativo. Então, temos as seguintes subpastas:
- A pasta src/main/java contém o código-fonte java, do aplicativo;
- No src/main/resources estão os arquivos utilizados no projeto (ex.: Arquivos de propriedade, demais XML, CSV etc.). Caso se trate de um aplicativo, recursos estáticos também estarão nesta pasta;
- Na pasta src/test/java ficam as classes de teste do projeto;
- JRE System Library implementa as API ́s Java no projeto;
- Maven Dependencies ficam os arquivos .jar utilizados nessa aplicação e sob gestão do Maven;
- A pasta target armazena os arquivos de classe java compilados;
- Arquivo pom.xml que contém os metadados das dependências do projeto.

Arquivo POM:
O arquivo Project Object Model do projeto (também chamado de pom.xml) contém os metadados do projeto e também é responsável por
gerenciar dependências e configurar plug-ins que nos ajudam a automatizar muitas tarefas repetitivas.

Dependências:
Em qualquer projeto Java muitas vezes se faz necessário utilizar vários arquivos JAR de terceiros para desenvolvê-lo. Exemplos: Junit, Spring Framework, Selenium, etc.

SNAPSHOT e RELEASE:
Uma dependência pode ser categorizada de duas maneiras: SNAPSHOT e RELEASE.
1. Quando o projeto está em desenvolvimento geralmente usamos as dependências SNAPSHOT;
2. Quando o software está pronto para o lançamento, geralmente criamos uma versão RELEASE.

Escopos de Dependências:
Cada dependência Maven pode ser categorizada em 5 escopos diferentes.
- compile: este é o escopo padrão se nenhum for especificado. As dependências de tempo de compilação estão disponíveis no classpath do projeto;
- provided: Semelhante ao escopo compile, mas indica que o JDK ou o contêiner subjacente fornecerá a dependência no tempo de execução. A dependência estará disponível no momento da compilação, mas não empacotada no artefato;
- runtime: as dependências definidas com este escopo estarão disponíveis apenas em tempo de execução, mas não em tempo de compilação. Um exemplo de uso: Imagine se você estiver usando o driver MySQL dentro do seu projeto, você pode adicionar a dependência com escopo como tempo de execução, para garantir que a abstração da API JDBC seja usada em vez da API do driver MySQL durante a implementação. Se o código-fonte incluir qualquer classe que faça parte da API JDBC do MySQL, o código não será compilado, pois a dependência não está disponível no momento da compilação;
- test: as dependências estão disponíveis apenas no momento da execução dos testes, exemplos típicos incluem Junit;
- system: é semelhante ao escopo provided, mas a única diferença é que precisamos mencionar explicitamente onde a dependência pode ser encontrada no sistema, usando a tag systemPath: <systemPath>${basedir}/lib/some-dependency.jar</systemPath>.

Repositórios:
As dependências são armazenadas em um diretório especial chamado Repositório. Existem 2 tipos:
Local Repository: Um Repositório local é um diretório na máquina onde o Maven está sendo executado;
Remote Repository: Um repositório remoro é um site onde podemos baixar dependências Maven.

Ciclo de Vida Da Versão Maven:
Este ciclo de vida é dividido em 3 partes:
- default;
- clean;
- site.
Cada ciclo de vida é independente um do outro e podem ser executados juntos.

Plugins Compilação:
Para poder executar essas fases do ciclo de vida, o Maven nos fornece plugins para realizar cada tarefa. Cada plugin está associado a um objetivo específico.
1. Puglin Compilação: O plug-in de compilação Maven é responsável por compilar os arquivos Java nos arquivos .class. É equivalente a executar javac;
2. Plugins Maven Surefire: gera relatórios de texto e XML na pasta target/surefire-reports. Utilizado para execução de testes;
3. Instalação: é usado para empacotar o código-fonte em um artefato de nossa escolha como um JAR e instalá-lo no repositório local que é a pasta /.m2/repository. A instalação inclui fases anteriores do ciclo de vida: validate, compile, test, package e install;
4. Maven Clean: a fase da limpeza em que todo o conteúdo da pasta de destino será removido.

Existem uma diversidade de plugins que podem ser utilizados em um projeto com o Maven, os quais podem ser encontrados aqui: https://maven.apache.org/plugins/index.html
