package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Db;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = Db.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?"
			);
			
			st.setInt(1, 5);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Pronto ! Linhas afetadas: " + rowsAffected);
			
		}catch(SQLException e){
			throw new DbIntegrityException(e.getMessage());
		}finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
	}		
}
