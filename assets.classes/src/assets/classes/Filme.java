package assets.classes;

import java.util.Objects;

public class Filme {

	private int id;
	private String filme;
	private String categoria;
	private String tempo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	public Filme(int id, String filme, String categoria, String tempo) {
		super();
		this.id = id;
		this.filme = filme;
		this.categoria = categoria;
		this.tempo = tempo;
	}	
	
	public Filme() {
			
	}
	public static void main (String args []){   
        Filme meuFilme = new Filme();   
        meuFilme.setId(0001);
        meuFilme.setFilme("A Lista de Schindler");
        System.out.println("Código do Filme: " + meuFilme.getId());
        System.out.println("Nome do Filme: " + meuFilme.getFilme());
    }   
}

