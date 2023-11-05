public class Desenvolvedor implements Funcionario {

    private String nome;
    private long id;
    private String posicao;

    public Desenvolvedor(long id, String nome, String posicao) {
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
