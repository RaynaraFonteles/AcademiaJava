# Aula 20 - Servidores de Aplicação: Tomcat/Wildfly

Servidores de Aplicação: Um servidor de aplicação é um software que fornece um ambiente para executar aplicativos Java, geralmente aplicativos empresariais. Eles são responsáveis por gerenciar a execução de aplicativos Java,rotear solicitações HTTP, gerenciartransações, fornecer serviços de segurança e muito mais. Os desenvolvedores de aplicativos Java implantam seus aplicativos nesses servidores para que eles possam ser acessados por meio da web.

----------------------------------------------------------------------------------------------------------------------------------------

- Apache Tomcat:
é um servidor de aplicação web de código aberto que implementa as especificações Java Servlet e JavaServer Pages (JSP). Ele
atua como um contêiner web que hospeda aplicativos web baseados em Java. O Tomcat fornece um ambiente de execução para aplicativos Java web, permitindo que eles sejam acessados e executados por meio de um navegador da web.

- Características principais:  
1. Tomcat é conhecido por ser leve e de fácil configuração, tornando-o uma escolha popular para aplicativos web simples;
2. O Tomcat é uma solução de código aberto mantida pela Apache Software Foundation;
3. Ele adere rigorosamente às especificações Servlet e JSP, garantindo a portabilidade dos aplicativos Java web;
4. É possível estender suas funcionalidades por meio da inclusão de módulos e plugins;
5. Oferece suporte à criptografia SSL, permitindo a configuração de conexões seguras para aplicativos web.

----------------------------------------------------------------------------------------------------------------------------------------

- Wildfly (JBoss):
Wildfly, anteriormente conhecido como JBoss Application Server, é um servidor de aplicação Java de código aberto desenvolvido pela Red Hat. Ele oferece um ambiente de execução robusto e escalável para aplicativos Java EE (Enterprise Edition). O Wildfly implementa as especificações Java EE,tornando-o adequado para aplicativos empresariais que exigem recursos avançados.

- Principais características:
1. Suporte Java EE: Uma das principais diferenças em relação ao Tomcat é que o Wildfly oferece suporte completo às especificações Java EE, como Servlet, JSP, EJB (Enterprise JavaBeans), JMS (Java Message Service), CDI(Contexts and Dependency Injection), entre outras. Isso o torna mais adequado para aplicativos corporativos complexos que fazem uso extensivo dessas tecnologias;
2. Clustering: O Wildfly oferece recursos avançados de clustering e balanceamento de carga, o que o torna adequado para implantações de alta disponibilidade;
3. Gerenciamento avançado: O Wildfly possui uma interface de administração avançada que permite configurar e gerenciar servidores de aplicação de maneira mais conveniente e eficiente;
4. Microperfil: Além da versão completa do Wildfly, existe o Wildfly Swarm, que permite criar servidores de aplicação altamente otimizados para cargas de trabalho específicas.

----------------------------------------------------------------------------------------------------------------------------------------

- Comparação de recursos e capacidades:
O Tomcat é mais leve e adequado para aplicativos web simples, enquanto o Wildfly oferece suporte a um conjunto mais amplo de tecnologias Java EE, tornando-o adequado para aplicativos empresariais complexos;
O Wildfly oferece recursos avançados, como clustering e balanceamento de carga, que podem ser fundamentais para aplicações de alta disponibilidade.

- Cenários ideais para cada servidor:
Tomcat é ideal para pequenos projetos e aplicativos web simples, como blogs, sites estáticos e aplicativos de uma única página;
Wildfly é mais apropriado para empresas que desenvolvem aplicativos Java EE que exigem recursos avançados, como escalabilidade, clustering e segurança corporativa;

- É apropriado migrar de Tomcat para Wildfly à medida que os requisitos do projeto crescem.
