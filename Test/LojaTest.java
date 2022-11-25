import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LojaTest extends Loja {

    Loja loja = new Loja();

    private List<Cliente> clientes = new LinkedList<Cliente>();

    @Test
    public void cadastrarCliente() {
        List <Cliente> clientes = new LinkedList<>();
        loja.cadastrarCliente(new Cliente("311.418.751-50", new Especificacao("Davi",
                "masculino","11/01/2001","davi@gmail.com"), new Endereco("RJ",
                "Rio de Janeiro","Copacabana","primeiro de março", "202"),
                new Compra("1","R$2.000,00"),
                new Celular("1","Samsung","A51","Preto")));
        System.out.println(clientes);
    }

    @Test
    public void buscarClientePorEspecificacao() {
        List<Cliente> clientesEncontrados = loja.buscarClientePorEspecificacao(new Especificacao("Davi","Masculino","16/02/2004","davi@gmail.com"));
        assertEquals(clientesEncontrados.get(0).getEspec().getNome(), "Davi");
    }

    @Test
    public void buscarClientePorCpf() {
        Cliente clientesEncontrados = loja.buscarClientePorCpf("311.418.751-50");

    }
}
