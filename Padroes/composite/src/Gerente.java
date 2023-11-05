public class Gerente implements Funcionario {

    private String nome;
    private long id;
    private String posicao;

    public Gerente(long id, String nome, String posicao)
    {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public void showFuncionarioDetails()
    {
        System.out.println(id+" " +nome);
    }


}
