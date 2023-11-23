<h1 align="center">Command</h1>

<p>O Command é um padrão de projeto comportamental que transforma um pedido em um objeto independente que 
  contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, 
  atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas.
</p>

##

#### Exemplo 

<p>
Meu exemplo simula um controle remoto que pode ligar e desligar uma TV. Ele utiliza o padrão de projeto Command para encapsular essas operações em objetos específicos.

  - Operacao (ou Comando):

    É uma interface que declara métodos para executar a operação (realizar) e desfazê-la (cancelar).

- LigarTV e DesligarTV:

  Implementam a interface Operacao.
  Representam comandos específicos (ligar e desligar a TV).
  Encapsulam a lógica associada a cada comando.

- ControleRemoto:

  Representa o dispositivo controlado (no caso, a TV).
  Tem métodos para ligar e desligar a TV.

- ControleRemotoInvoker:

  Mantém uma lista de comandos.
  Pode executar esses comandos, como ligar e desligar a TV.
</p>


