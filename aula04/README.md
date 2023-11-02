# Aula 04 - Programação Orientada a Objetos

- Construtor:
Um construtor é um tipo especial de método que é chamado automaticamente quando um objeto de uma classe é criado. Sua principal função é inicializar o novo objeto. Isso pode incluir a alocação de memória, a definição de valores padrão para os atributos do objeto ou a execução de qualquer outra configuração ou operação inicial necessária. Pode ter parâmetros, o que permite configurar o objeto recém-criado de maneiras específicas no momento da criação.

----------------------------------------------------------------------------------------------------------------------------------------

- Encapsulamento:
Encapsulamento é um dos pilares da POO e refere-se à prática de ocultar os detalhes internos de implementação de uma classe e fornecer uma interface clara e bem definida para os objetos dessa classe. Isso é feito para proteger a integridade dos dados e garantir que os objetos se comportem de maneira previsível. É realizado usando modificadores de acesso (como private, protected e public em linguagens como Java e
C#) para restringir o acesso direto aos atributos ou métodos de uma classe.

----------------------------------------------------------------------------------------------------------------------------------------

- Public:
Pode ser acessado de qualquer lugar: seja de dentro da mesma classe, das classes derivadas ou de qualquer código externo. É o nível de acesso menos restritivo;

- Private:
Só pode ser acessado de dentro da mesma classe onde foi definido. É usado para esconder a implementação interna da classe e para evitar que o código externo modifique o estado interno da classe de maneiras não intencionais ou inseguras. É o nível de acesso mais restritivo;

- Protected:
Semelhante ao private, no sentido de que não pode ser acessado diretamente de fora da classe onde foi definido. Pode ser acessado por classes derivadas (subclasses) dessa classe.
