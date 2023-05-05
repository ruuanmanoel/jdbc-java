package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entities.Curso;

public class CursoDAO {
	private Connection conn;
	
	public CursoDAO(Connection conn){
		this.conn = conn;
	}
	
	public void cadastrar(Curso curso) throws SQLException {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("insert into curso(nome, periodo, duracao) values(?,?,?)");
			st.setString(1, curso.getNome());
			st.setString(2, curso.getPeriodo());
			st.setInt(3, curso.getDuracao());
			st.executeUpdate();
		}finally {
			BancoDados.finaliazarStatement(st);
			BancoDados.desconectar();
		}
		
	}
	public List buscarTodos() {
		return null;
		
	}
	public Curso buscarPorRA(int ra) {
		return null;
		
	}
	public void atualizar(Curso a) {
		
	}
	public int excluir(int a) {
		
		return a;
		
	}
}
