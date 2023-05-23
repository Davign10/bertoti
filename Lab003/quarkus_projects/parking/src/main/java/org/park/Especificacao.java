package org.park;

public class Especificacao {

	
	private String marca;
	private String modelo;
	private String cor;
	
	
	public Especificacao(String marca, String modelo, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}
	
	public String getCor(){
		return cor;
	}
	
	public boolean comparar(Especificacao esp){
		if(marca.equals(esp.marca) && modelo.equals(esp.modelo) && cor.equals(esp.cor)){
			return true;
		} else {
			return false;
		}
	}
}
