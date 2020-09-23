package main;

import java.util.ArrayList;
import java.util.List;

public class Filme{

	private String titulo;
	private int ano;
	private List<Papel> papeis;

	public Filme(String titulo, int ano){
		this.papeis = new ArrayList<>();
		this.titulo = titulo;
		this.ano = ano;
	}

	public String getTitulo(){
		return titulo;
	}

	public int getAno(){
		return ano;
	}

	public List<Papel> getPapeis(){
		return papeis;
	}
		
	public void addPapel(Ator ator,String nome,boolean principal){

		boolean hasPrincipal = false;
		for(Papel papel : this.papeis){
			if (papel.getPrincipal())hasPrincipal= true;
			}

			if(hasPrincipal && principal){
				throw new IllegalArgumentException("O Ator principal já está selecionado!");
			}
			else{
				Papel newPapel = new Papel(nome,principal,ator,this);
				this.papeis.add(newPapel);
			}

	}
	public Ator getPrincipal(){
			for(Papel papel : this.papeis) {
				if (papel.getPrincipal())
					return papel.getAtor();
				
			}
		return null;
	} 
		public List<Ator> getAtores(){

		List<Ator> listaAtores = new ArrayList<>();
		for(Papel papel : this.papeis) {
				listaAtores.add(papel.getAtor());
			}
		return listaAtores;
		}
}


