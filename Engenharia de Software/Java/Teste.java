import org.junit.Test;
import static org.junit.Assert.*;

public class Teste{
    
    @Test
    public void test(){
        
        Escola escola = new Escola();        
        
        assertEquals(escola.getProfessores().size(), 0);
        
    }
}
