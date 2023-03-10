package br.com.projetofinal.pojo;

public class Competencia{
	//atributos
	private int id;
	private String descricao;
	private int minutos;
	private static int contador;//Fernanda
	//private static int contador;//Douglas
	
	public Competencia() {
		//construtor vazio
		contador++; //contador= contador+1
		
	}
	//construtor
	public Competencia(int id,String descricao,int minutos) {
		super();//papa da poo - Object
		this.id = id;
		this.descricao = descricao;		
		this.minutos = minutos;
		contador++; //contador = contador+1
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	//para mostrar o contador
	public static int getContador() {
		return contador;
	}	
	
	
	
}