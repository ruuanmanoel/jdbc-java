package dao;

import java.sql.Connection;
import java.util.List;

import entities.Aluno;

public class AlunoDAO {
	private Connection conn;
	
	public AlunoDAO(Connection conn) {
		this.conn =conn;
	}
	public void cadastrar(Aluno a) {
		
	}
	public List buscarTodos() {
		return null;
		
	}
	public Aluno buscarPorRA(int ra) {
		return null;
		
	}
	public void atualizar(Aluno a) {
		
	}
	public int excluir(int a) {
		
		return a;
		
	}
}
