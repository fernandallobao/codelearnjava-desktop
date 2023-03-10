package br.com.projetofinal.dao;

import br.com.projetofinal.dao.*;

import br.com.projetofinal.pojo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projetofinal.pojo.Curso;


public class CursoDAO implements ICursoDAO {
    @Override
	public void cadastrar(Curso curso) throws SQLException {
		// TODO Auto-generated method stub	
    	
		PreparedStatement comando = null;
		try {
			Connection conexao = Conexao.conectar();
			String sql = "INSERT INTO curso(nome,cargaHoraria) VALUES(?,?)";//proteção do codigo	
			comando = conexao.prepareStatement(sql);
			comando.setString(1,curso.getNome());
			comando.setInt(2,curso.getCargaHoraria());	
			comando.executeUpdate();//executar tudo que a gente a gente fez.
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			System.out.println("mensagem ou funcionalidade padrão!");
			Conexao.conectar().close();	
			comando.close();
			
		}	
	
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void alterar(Curso curso) {
		// TODO Auto-generated method stub
		PreparedStatement comando = null;
		try {
			Connection conexao = Conexao.conectar();
			String sql = "UPDATE curso SET nome=?,cargaHoraria=? WHERE ID=?";//proteção do codigo	
			comando = conexao.prepareStatement(sql);
			comando.setString(1,curso.getNome());
			comando.setInt(2,curso.getCargaHoraria());
			comando.setInt(3,curso.getId());
			comando.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			System.out.println("mensagem ou funcionalidade padrão!");			
		}			
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub	
		PreparedStatement comando = null;
		try {
			Connection conexao = Conexao.conectar();
			String sql = "DELETE FROM curso WHERE ID = ?";//chupa hacker(lad.galinha) otário	
			comando = conexao.prepareStatement(sql);
			comando.setInt(1,id);
			comando.execute();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			System.out.println("mensagem ou funcionalidade padrão!");			
		}			
	}

	
}