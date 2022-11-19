public class Cliente {

    private String cpf;
    private Especificacao espec;

    public Cliente(String cpf, Especificacao espec) {
        this.cpf = cpf;
        this.espec = espec;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
}
