package main;

import java.util.ArrayList;
import java.util.List;

public class Ator {
	 private String nome;
	  private List<Papel> papeis;
	  
	  public Ator(String nome){
	    this.nome = nome;
	    this.papeis = new ArrayList<>();
	  }

	  public String getNome(){
	    return nome;
	  }

	  public List<Papel> getPapeis(){
	    return papeis;
	  }

	  public void addPapel(Papel papel) {
			this.papeis.add(papel);
		}

		public List<Filme> getFilmes(){

			List<Filme> listaDeFilmes = new ArrayList<>();
			for(Papel papel : this.papeis) {
				if(papel.getAtor() == this)
					listaDeFilmes.add(papel.getFilme());
			}

			return listaDeFilmes;
		}

		public boolean atuouNoAno(int ano){

			for(Papel papel : this.papeis){
				if (papel.getFilme().getAno() == ano)
					return true;			
			}

			return false;		
		}
}
