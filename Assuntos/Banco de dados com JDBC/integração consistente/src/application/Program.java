package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.Db;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = Db.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 7000 WHERE DepartmentId = 1");
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 1500 WHERE DepartmentId = 3");
			
			conn.commit();
			
			System.out.println("operação 1: " + rows1);
			System.out.println("operação 2: " + rows2);
			
		}catch(SQLException e){
			try {
				conn.rollback();
				throw new DbException("Operação reiniciada. Causa do erro: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro enquanto tentava voltar a aplicação !! Causa: " + e1.getMessage());
			}
		}finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}		
}
