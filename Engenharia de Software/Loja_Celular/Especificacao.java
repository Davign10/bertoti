import java.util.Date;

public class Especificacao {

    private String nome;
    private String sexo;
    private String data_nascimento;
    private String email;


    public Especificacao(String nome, String sexo, String data_nascimento, String email) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean comparar(Especificacao especificacao) {
        if (nome.equals(especificacao.nome) &&
                sexo.equals(especificacao.sexo) &&
                data_nascimento.equals(especificacao.data_nascimento) &&
                email.equals(especificacao.email)){
            return true;
        } else {
            return false;
        }
    }
}
