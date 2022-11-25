import java.util.LinkedList;
import java.util.List;

public class Loja  {

    private List<Cliente> clientes = new LinkedList<Cliente>();

    public List<Cliente> cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        return clientes;
    }

    public List<Cliente> buscarClientePorEspecificacao(Especificacao espec){
            List<Cliente> clientesEncontrados = new LinkedList<Cliente>();
        for(Cliente cliente:clientes){
            if(cliente.getEspec().comparar(espec)) clientesEncontrados.add(cliente);
        }
        return clientesEncontrados;
    }

    public Cliente buscarClientePorCpf(String cpf){
        for(Cliente cliente:clientes){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }
}
