# Aula 15 - Debbuging, Logging e Profilling

- Logging:

É uma API que permite rastrear o erro gerado a partir de classes específicas. Um logger ajuda no mecanismo de registro em tempo real, adicionando carimbos de data/hora e os terminais onde é preenchido.
Ajuda a manter o controle de eventos como um registro de um log. Os registros ajudam a localizar a causa raiz dos problemas que aconteceram auxiliando na correção, para que os mesmos não venham a ocorrer novamente.

Níveis de importância para Logging:
1. SEVERE;
2. WARNING;
3. INFO;
4. CONFIG;
5. FINE;
6. FINER;
7. FINEST -- menor importancia.

APIs para Logging:
- Log4j https://logging.apache.org/log4j/2.x/
- LogBack https://logback.qos.ch/
- tinylog https://www.tinylog.org/
- SLF4J https://www.slf4j.org/

- Debugging:
Possibilita a execução do código linha a linha, facilitando o entendimento e ajudando a encontrar bugs.

Ferramentas da IDE:
- Debug (F11): Roda em modo debug;
- Breakpoint (ctrl + shift + B): A IDE irá parar quando estiver em modo debug e encontrar um breakpoint apontado antes do início da depuração;
- Step into (F5): Executa a linha onde o cursor está, e avança para a próxima. Se a próxima linha chama um método, ele entrará nesse método;
- Step over (F6): Executa a linha onde o cursor está, porém, escapa de chamadas de métodos e laço de repetição, por exemplo;
- Skip All Breakpoints (ctrl + alt + B): Desabilita todos os breakpoints do seu projeto. Para reativar é só clicar novamente no botão, ou usar as teclas de atalho.

- Profiling:
É usado para descrever o processo de medição do tempo de execução dos métodos, para que assim possamos localizar e corrigir gargalos de desempenho.

Razões para usarmos os profilers:
1. Investigar o uso do heap e a frequência que está ocorrendo a coleta de lixo;
2. Pesquisar a alocação de objetos e referências para encontrar e corrigir vazamentos de memória;
3. Investigar a alocação e a sincronização de threads para encontrar problemas de bloqueio e de concorrência no acesso a dados;
4. Otimizar tempos de acesso ao banco de dados;
5. Identificar métodos custosos;
6. Investigar uma aplicação em tempo de execução para que possamos entender a sua estrutura.
