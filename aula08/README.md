# Aula 09 - Programação Orientada a Objetos

Classe e Objetos | Interface

----------------------------------------------------------------------------------------------------------------------------------------

- Classe:
Blueprint ou modelo para criar objetos. Define atributos e comportamentos que os objetos terão.

- Objetos:
São instâncias de uma classe. Quando criados, estão usando a "receita" fornecida pela classe para criar uma instância concreta dela.

----------------------------------------------------------------------------------------------------------------------------------------

- Interface:
Uma interface é uma estrutura em linguagens de programação orientadas a objetos, como Java, que funciona com um "contrato" estabelecendo um conjunto de métodos que uma classe deve implementar. Interfaces definem o quê fazer, mas não como fazer. Ou seja, elas declaram métodos, mas não fornecem implementações concretas para eles.

- Métodos sem implementação:
Os métodos de uma interface geralmente não possuem um corpo; isto é, são métodos sem implementação. No entanto, desde o Java 8, as interfaces podem ter métodos com implementação padrão usando a palavra-chave default.

- Múltiplas interfaces:
Uma das maiores vantagens das interfaces é que, ao contrário de herança de classes, uma classe pode implementar várias interfaces. Isso resolve o problema da falta de herança múltipla em linguagens como Java.

- Abstração:
Interfaces fornecem uma forma de abstração. Elas permitem que você defina quais ações uma classe deve fazer, mas não como essas ações são realizadas.

- Polimorfismo:
Com interfaces, é possível referenciar objetos de diferentes classes de uma maneira uniforme desde que todas essas classes implementem a mesma interface.

- Flexibilidade:
Interfaces permitem que sistemas sejam mais flexíveis e escaláveis. Se uma classe precisa mudar, você pode criar uma nova interface para ela ou adicionar métodos à interface existente sem alterar as classes que já a implementam.

- Separação de Responsabilidades:
Ao usar interfaces, você pode separar a definição de uma operação de sua implementação, permitindo que diferentes classes implementem essa operação de diversas maneiras.
