public class Cliente {

    private String cpf;
    private Especificacao espec;
    private Endereco endereco;
    private Compra compra;
    private Celular celular;

    public Cliente(String cpf, Especificacao espec, Endereco endereco, Compra compra, Celular celular) {
        this.cpf = cpf;
        this.espec = espec;
        this.endereco = endereco;
        this.compra = compra;
        this.celular = celular;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Compra getCompra() {return compra;}

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Celular getCelular() {return celular;}

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

}
