package strategy;

public class Teste {

		public static void main(String[] args) {
			
				Veiculo carro = new Veiculo();
				
				carro.setLocomocao(new Anda());
				
				carro.realizarLocomocao();
				
				carro.setLocomocao(new Voo());
				
				carro.realizarLocomocao();

		}
	
}
