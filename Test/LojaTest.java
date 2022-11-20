import org.junit.Test;

import static org.junit.Assert.*;

public class LojaTest {

    @Test
    public void cadastrarCliente() {
        String cpf;
        cpf = "311.418.751-50";
        assertEquals("311.418.751-50", cpf);

    }

    @Test
    public void buscarClientePorEspecificacao() {
    }

    @Test
    public void buscarClientePorCpf() {
    }
}