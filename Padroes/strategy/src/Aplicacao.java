public class Aplicacao {

    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.setPlaca("ABC-4321");

        carro.setLocomocao(new Voo());

        carro.realizarLocomocao(carro.getPlaca().toString());

    }

}
