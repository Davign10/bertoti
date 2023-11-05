import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Funcionario {

    private List<Funcionario> funcionarioList = new ArrayList<Funcionario>();

    @Override
    public void showFuncionarioDetails()
    {
        for(Funcionario func:funcionarioList)
        {
            func.showFuncionarioDetails();
        }
    }

    public void addFuncionario(Funcionario func)
    {
        funcionarioList.add(func);
    }

    public void removeFuncionario(Funcionario func)
    {
        funcionarioList.remove(func);
    }

}
