import org.junit.Test;

import java.util.LinkedList;

import java.util.List;

import static org.junit.Assert.*;

public class LojaTest  {

    Loja loja = new Loja();


    @Test
    public void cadastrarCliente() {

        assertEquals(loja.getClientes().size(), 0);

        loja.cadastrarCliente(new Cliente(("311.418.751-50"), new Especificacao("Davi",
                "masculino", "11/01/2001", "davi@gmail.com"), new Endereco("RJ",
                "Rio de Janeiro", "Copacabana", "primeiro de março", "202"),
                new Compra("1", "R$2.000,00"),
                new Celular("1", "Samsung", "A51", "Preto")));

        assertEquals(loja.getClientes().size(), 1);

    }

    @Test
    public void buscarClientePorEspecificacao() {
        List<Cliente> clientesEncontrados = loja.buscarClientePorEspecificacao(new Especificacao("Davi",
                "masculino","11/01/2001","davi@gmail.com"));
        assertEquals(clientesEncontrados.get(0).getEspec().getNome(), "Davi");
    }

    @Test
    public void buscarClientePorCpf() {
        Cliente clientesEncontrados = loja.buscarClientePorCpf("311.418.751-50");
        assertEquals(clientesEncontrados.getEspec().getNome(), "Davi");
    }
}
