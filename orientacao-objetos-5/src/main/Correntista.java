package main;

public class Correntista {
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;
    
    //get
   
    public Integer getCodigo() {
    	return codigo;
    }
    public String getNome() {
    	return nome;
    }
    public String getEmail() {
    	return email;
    }
    public String getTelefone() {
    	return telefone;
    }
    
    //set
    
    public void setCodigo(Integer codigo) {
    	this.codigo = codigo;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    public void setTelefone(String telefone) {
    	this.telefone = telefone;
    }
    
    //-----
    
    public void obterCodigo(Integer codigo) {
    	if(codigo <=0) {
    		throw new IllegalArgumentException("O código deve ser maior que zero.");
    	}
    	codigo = codigo + 1;
    }
    public void obterNome(String nome) {
    	if(nome == " ") {
    		throw new IllegalArgumentException("Adicione um nome.");
    	}
    	this.nome = nome;
    }
    public void obterEmail(String email) {
    	if(email == " ") {
    		throw new IllegalArgumentException("Adicione um email.");
    	}
    	this.email = email;
    }
    public void obterTelefone(String telefone) {
    	if(telefone == " ") {
    		throw new IllegalArgumentException("Adicione um telefone.");
    	}
    	this.telefone = telefone;
    }
    
    
    public String getNomeEmail() {
        return nome + " " + email;
    }
}
