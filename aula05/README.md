# Aula 05 - Controle de Versão

O que é Controle de Versão?
Controle de versão, é um sistema que registra as mudanças feitas em arquivos, usado principalmente em códigos.

Por que usar o Controle de Versão?
O controle de versão oferece uma série de vantagens para o desenvolvimento de software, a gestão de documentos e outras atividades que envolvem a criação e modificação de arquivos ao longo do tempo. Rastreabilidade, Colaboração, Backup, etc...

Tipos de sistemas de controle de versão:
1. Controle de Versão Local (Local VCS): Mais arquivista do que colaborativa;
2. Controle de Versão Centralizado (Centralized VCS): Em um server, colaborativo;
3. Controle de Versão Distribuído (Distributed VCS): Trabalha-se offline e depois envia-se para o servidor.

----------------------------------------------------------------------------------------------------------------------------------------

- Introdução ao GIT:
O Git é um sistema de controle de versão distribuído, gratuito e de código aberto, projetado para lidar com tudo, desde projetos pequenos a muito grandes, com rapidez e eficiência. Foi criado por Linus Torvalds em 2005 para desenvolvimento do kernel Linux.

1. Instalando o Git:
Windows: https://gitforwindows.org/;

2. Configuração inicial (identidade, editor):
git config --global user.name "Seu nome" git config --global user.email "seuemail@example.com"

- Fundamentos do GIT:
1. Inicializando o repositório: git init;
2. Rastreando e comprometendo mudanças: git add & git commit;
3. Visualizando histórico: git log;
4. Revertendo mudanças: git checkout, git reset;
5. Ramificação e mesclagem: git branch, git merge;
6. Resolvendo conflitos.

- Repositórios Remotos:
1. Conectando a um repositório remoto: git remote;
2. Enviando e buscando mudanças: git push, git pull;
3. Clonando repositórios: git clone.
