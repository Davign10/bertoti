import java.util.LinkedList;
import java.util.List;


public class Escola {
    
    private List<Professor> professores = new LinkedList<Professor>();
    
    public void cadastrarProfessor(Professor professor){
        professores.add(professor);
    }
    
    public List<Professor> buscarProfesorPorEspecificacao(Especificacao espec){
        List<Professor> professoresEncontrados = new LinkedList<Professor>();
        for(Professor professor:professores){
            if(professor.getEspec().comparar(espec)) professoresEncontrados.add(professor);
        }
        return professoresEncontrados;
    }
    
    public Professor buscarProfessorPorCpf(String cpf){
        for(Professor professor:professores){
            if(professor.getCpf().equals(cpf)){
                return professor;
            }
        }
        return null;
    }
    public List<Professor> getProfessores(){
        return this.professores;
    }
}
