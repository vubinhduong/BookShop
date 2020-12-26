package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Book;

public class BookService {
	private String sql;
	ResultSet rs;
	private Connection connection = JDBCConnection.getJDBCConnection();
	
	public List<Book> getAllBook(){
		List<Book> book = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			sql = "SELECT * FROM BOOK";
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				String book_id = rs.getString("book_id");
				String name = rs.getString("Book_name");
				String genre = rs.getString("genre");
				int price = rs.getInt("price");
				int discount = rs.getInt("discount");
				int pages = rs.getInt("pages");
				String publisher = rs.getString("publisher");
				int publisher_year = rs.getInt("publishing_year");
				int rate = rs.getInt("rate");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
				System.out.println(book_id+ name+ genre+ price+ discount+ pages+ 
						publisher+publisher_year+ rate+ intro+ image);
				Book a = new Book(book_id, name, genre, price, discount, pages, 
						publisher,publisher_year, rate, intro, image);
				book.add(a); 
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public List<Book> getBookGenre(String genre){
		List<Book> book = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			sql = "SELECT * FROM BOOK WHERE GENRE = '" + genre + "'";
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				String book_id = rs.getString("book_id");
				String name = rs.getString("Book_name");
				String genres = rs.getString("genre");
				int price = rs.getInt("price");
				int discount = rs.getInt("discount");
				int pages = rs.getInt("pages");
				String publisher = rs.getString("publisher");
				int publisher_year = rs.getInt("publishing_year");
				int rate = rs.getInt("rate");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
				System.out.println(book_id+ name+ genres+ price+ discount+ pages+ 
						publisher+publisher_year+ rate+ intro+ image);
				Book a = new Book(book_id, name, genres, price, discount, pages, 
						publisher,publisher_year, rate, intro, image);
				book.add(a); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
	
	public List<Book> getBookPrice(int price1, int price2){
		List<Book> book = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			sql = "SELECT * FROM BOOK WHERE price between " + price1 + " and " + price2;
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				String book_id = rs.getString("book_id");
				String name = rs.getString("Book_name");
				String genres = rs.getString("genre");
				int price = rs.getInt("price");
				int discount = rs.getInt("discount");
				int pages = rs.getInt("pages");
				String publisher = rs.getString("publisher");
				int publisher_year = rs.getInt("publishing_year");
				int rate = rs.getInt("rate");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
				System.out.println(book_id+ name+ genres+ price+ discount+ pages+ 
						publisher+publisher_year+ rate+ intro+ image);
				Book a = new Book(book_id, name, genres, price, discount, pages, 
						publisher,publisher_year, rate, intro, image);
				book.add(a); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
//	public static void main(String[] args) {
//		BookService a = new BookService();
//		a.getBookGenre("tieu thuyet");
//		a.getAllBook();
//		a.getBookPrice(2000, 400000);
//	}

}
