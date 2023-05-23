package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Celular> celulares = new LinkedList<Celular>();

	public Model() {
		addCelular(new Celular("6#XBRB&SY%", new Especificacao("iPhone", "iPhone 13", "Preto")));
		addCelular(new Celular("WDF^E@4XHR", new Especificacao("Samsung", "Samsung Galaxy S20 FE", "Branco")));
		addCelular(new Celular("35$V83GLKP", new Especificacao("Xiaomi", "Redmi Note 11", "Azul")));
	}
	
	
	public void addCelular(Celular celular){
		celulares.add(celular);
	}
	
	public Celular buscarCodigo(String codigo){
		for(Celular celular:celulares){
			if(celular.getCodigo().equals(codigo)) return celular;
		}
		
		return null;
	}
	
	
	public List<Celular> buscarEspecificacao(Especificacao esp){
		List<Celular> celularesEncontrados = new LinkedList<Celular>();
		
		for(Celular celular:celulares){
			 if(esp.comparar(celular.getEspc())) celularesEncontrados.add(celular);
		}
		
		return celularesEncontrados;
		
	}
	
	
	public List<Celular> buscarModelo(String modelo){
		List<Celular> celularesEncontrados = new LinkedList<Celular>();
		for(Celular celular:celulares) {
			if(celular.getEspc().getModelo().equals(modelo)) celularesEncontrados.add(celular);
		}
		return celularesEncontrados;
	}
	
	public List<Celular> getCelulares(){
		return celulares;
	}

}
