public class Empresa {

    public static void main (String[] args)
    {
        Desenvolvedor dev1 = new Desenvolvedor(01, "Bertoti", "Desenvolvedor Sênior");
        Desenvolvedor dev2 = new Desenvolvedor(02, "Davi", "Desenvolvedor Junior");

        Diretorio engDiretorio = new Diretorio();
        engDiretorio.addFuncionario(dev1);
        engDiretorio.addFuncionario(dev2);

        Gerente ger1 = new Gerente(100, "Maria", "Gerente Comercial");
        Gerente ger2 = new Gerente(101, "João", "Gerente de Projetos");

        Diretorio accDiretorio = new Diretorio();
        accDiretorio.addFuncionario(ger1);
        accDiretorio.addFuncionario(ger2);

        Diretorio diretorio = new Diretorio();
        diretorio.addFuncionario(engDiretorio);
        diretorio.addFuncionario(accDiretorio);
        diretorio.showFuncionarioDetails();
    }
}
