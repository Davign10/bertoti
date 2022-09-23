public class Especificacao {
    
    private String disciplina;
    private String curso;
    private String periodo;  

    public Especificacao(String disciplina, String curso, String periodo) {
        this.disciplina = disciplina;
        this.curso = curso;
        this.periodo = periodo;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }    
    
    public boolean comparar(Especificacao especificacao){
        if(disciplina.equals(especificacao.disciplina) &&
                curso.equals(especificacao.curso) &&
                periodo.equals(especificacao.periodo)){
            return true;
        } else {
            return false;   
        }
    }
}
