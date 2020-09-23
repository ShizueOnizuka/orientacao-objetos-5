package main;

public class Papel {
	private String nome;
	private Filme filme;
	private Ator ator;
	private boolean principal;

	public Papel(String nome,boolean principal,Ator ator,Filme filme){
		this.nome = nome;
	    this.filme = filme;
			this.ator = ator;
	    this.principal = principal;
		}

	public String getNome() {
			return nome;
		}

	public Filme getFilme() {
			return filme;
		}   
		
	public Ator getAtor() {
			return ator;
		}
		
	public boolean getPrincipal() {
			return principal;
		}
	
}
