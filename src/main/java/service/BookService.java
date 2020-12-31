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
	private List<Book> getBook(){
		Connection connection = JDBCConnection.getJDBCConnection();
		List<Book> book = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				String book_id = rs.getString("book_id");
				String name = rs.getString("Book_name");
				int price = rs.getInt("price");
				int discount = rs.getInt("discount");
				int pages = rs.getInt("pages");
				String publisher = rs.getString("publisher");
				int publisher_year = rs.getInt("publishing_year");
				int purchased = rs.getInt("purchased");
				int rateturn = rs.getInt("rateturn");
				float rate = rs.getFloat("rate");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
//				System.out.println(book_id+ name + price+ discount+ pages+ 
//						publisher+publisher_year+ rate+ intro+ image);
				Book a = new Book(book_id, name, price, discount, pages, publisher, publisher_year, purchased, rateturn, rate, intro, image);
				book.add(a); 
						
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
		return book;
	}
	
	// trả về tất cả sách
	public List<Book> getAllBook(){
		sql = "SELECT * FROM BOOK limit 30";
		return getBook();
	}
	
	// trả về thể loại sách
	public List<Book> getBookGenre(String genre){
		sql = "SELECT *\r\n" + 
				"FROM BOOK, GENRE\r\n" + 
				"WHERE GENRE.NAME = '" + genre + "' AND BOOK.BOOK_ID = GENRE.BOOK_ID";
		return getBook();
	}
	
	// trả về sách có giá từ price1 dến price2
	public List<Book> getBookPrice(int price1, int price2){
		sql = "SELECT * FROM BOOK WHERE price between " + price1 + " and " + price2;
		return getBook();
	}
	
	// trả về sách mới
	public List<Book> getBoolNew(){
		sql = "SELECT *\r\n" + 
				"from book\r\n" + 
				"where year(curdate()) = publishing_year";
		return getBook();
	}
	
	// trả về sách bán chạy
	public List<Book> getBookHot(){
		sql = "SELECT * FROM BOOK\r\n" + 
				"ORDER BY PURCHASED DESC\r\n" + 
				"LIMIT 20";
		return getBook();
	}
	
	// trả về sách ngẫu nhiên
	public List<Book> getBookRandom(){
		sql = "SELECT * \r\n" + 
				"FROM BOOK\r\n" + 
				"ORDER BY RAND() LIMIT 20";
		return getBook();
	}
}
