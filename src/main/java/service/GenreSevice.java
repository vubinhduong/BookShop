package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Genre;

public class GenreSevice {
	public static List<Genre> getAll(String bookId){
		List<Genre> genre = new ArrayList<Genre>();
		Connection connection = JDBCConnection.getJDBCConnection();
		
		try {
			Statement statement = connection.createStatement();
			String sql = "select g.genre_id, name\r\n" + 
					"from book b, genre g, genrebook gb\r\n" + 
					"where b.book_id = '" + bookId + "' and b.book_id = gb.book_id and g.genre_id = gb.genre_id ";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				String genre_id = rs.getString("genre_id");
				String name = rs.getString("name");
				Genre a = new Genre(genre_id, name);
				genre.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return genre;
	}
}
