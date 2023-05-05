package entities;

public class Aluno {
	private int registroAcademico;
	private String nome;
	private int periodo;
	private double coeficiente;
	
	public Aluno() {
		
	}
	
	
	
	public int getRegistroAcademico() {
		return registroAcademico;
	}
	public void setRegistroAcademico(int registroAcademico) {
		this.registroAcademico = registroAcademico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	
}
