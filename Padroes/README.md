 <table>
      <thead>
        <th>Padrão</th>
        <th>Anti-Padrão</th>
        <th>Definição</th>
        <th>Solução</th>
        <th>Exemplo</th>
      </thead>
      <tbody>
        <tr>
          <td>Strategy</td>
          <td>Múltiplas Estratégias Idênticas</td>
          <td>
            Strategy é um padrão de design comportamental que permite definir
            uma família de algoritmos, colocar cada um deles em uma classe
            separada e tornar seus objetos intercambiáveis.
          </td>
          <td>
            O padrão Strategy sugere que tenha uma classe que faz algo
            específico de muitas maneiras diferentes e extraia todos esses
            algoritmos em classes separadas chamadas strategies.
          </td>
          <td>
            Métodos de pagamento em uma aplicação de e-commerce. Depois de
            selecionar um produto para comprar, o cliente escolhe uma forma de
            pagamento: Paypal ou cartão de crédito por exemplo.
          </td>
        </tr>
        <tr>
          <td>Observer</td>
          <td>Excesso de Notificações</td>
          <td>
            Observer é um padrão de design comportamental que permite definir um
            mecanismo de assinatura para notificar vários objetos sobre
            quaisquer eventos que ocorram com o objeto que eles estão
            observando.
          </td>
          <td>
            O padrão Observer é útil em situações em que vários objetos precisam
            ser notificados sobre mudanças em um objeto central.
          </td>
          <td>
            Um sistema de estoque, vários objetos, como a interface do usuário,
            o banco de dados e os relatórios, podem precisar ser atualizados
            sempre que o estoque de um produto mudar.
          </td>
        </tr>
        <tr>
          <td>Composite</td>
          <td>Uso Indiscriminado</td>
          <td>
            Composite é um padrão de projeto estrutural que permite compor
            objetos em estruturas de árvore e depois trabalhar com essas
            estruturas como se fossem objetos individuais.
          </td>
          <td>
            O padrão Composite é ideal para lidar com estruturas hierárquicas,
            como árvores ou grafos, onde os nós podem ser objetos individuais ou
            grupos de objetos.
          </td>
          <td>
            Um editor gráfico onde você pode ter formas simples, como círculos e
            quadrados, bem como grupos que contêm várias dessas formas. O padrão
            Composite permite que você trate tanto as formas individuais quanto
            os grupos de maneira consistente.
          </td>
        </tr>
        <tr>
          <td>Facade</td>
          <td>Fat Facade</td>
          <td>
            Facade é um padrão de design estrutural que fornece uma interface
            simplificada para uma biblioteca, uma estrutura ou qualquer outro
            conjunto complexo de classes.
          </td>
          <td>
            O padrão de design Facade é ideal quando há situações em que um
            sistema é composto por várias partes e você deseja fornecer uma
            interface simplificada para esse conjunto de subsistemas. Ele atua
            encapsulando e fornecendo uma visão mais simples e unificada para
            interações com vários componentes ou sistemas.
          </td>
          <td>
            Um sistema computacional, onde um usuário interage principalmente
            com a interface gráfica do sistema operacional e não precisa
            entender os detalhes internos do gerenciamento de hardware. O
            sistema operacional atua como uma facade, fornecendo uma interface
            simplificada para interações com o computador.
          </td>
        </tr>
        <tr>
          <td>Singleton</td>
          <td>Múltiplas Instâncias</td>
          <td>
            Singleton é um padrão de design criacional que permite garantir que
            uma classe tenha apenas uma instância, ao mesmo tempo que fornece um
            ponto de acesso global para essa instância.
          </td>
          <td>
            O padrão Singleton é usado quando você quer garantir que uma classe
            tenha apenas uma instância e fornece um ponto global de acesso a
            essa instância. Este padrão é útil em situações em que é crucial ter
            exatamente uma instância de uma classe disponível para coordenar
            ações em todo o sistema.
          </td>
          <td>
            O software de controle da impressora atua como um Singleton. Ele
            garante que há apenas uma instância para coordenar as ações
            relacionadas à impressora em todo o escritório, proporcionando
            acesso global e consistência nas configurações.
          </td>
        </tr>
      </tbody>
</table>
