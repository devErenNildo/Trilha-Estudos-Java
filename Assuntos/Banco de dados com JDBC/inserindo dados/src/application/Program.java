package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.Db;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = Db.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS
			);
			
			st.setString(1, "ErenNildo");
			st.setString(2, "developer.erenildo@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/12/2003").getTime()));
			st.setDouble(4, 5000.0);
			st.setInt(5, 1);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Pronto ! ID = " + id);
				}
			}else {
				System.out.println("Nenhuma linha foi alterada !");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		} finally {
			Db.closeStatement(st);
			Db.closeConnection();
		}
		
	}
		
}
