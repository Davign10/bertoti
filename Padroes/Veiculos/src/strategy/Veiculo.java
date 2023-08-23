package strategy;

public class Veiculo {

		private String marca;

		private String nome;
		
		private Locomocao locomocao;
		
		public void setLocomocao(Locomocao loc) { //Argumento polimorfico!!!! Forma de Voo, forma de Nado e etc
			locomocao = loc;
		}

		public void realizarLocomocao() {
			locomocao.locomover();
		}
		
}
