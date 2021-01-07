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

	private List<Book> getBook() {
		Connection connection = JDBCConnection.getJDBCConnection();
		List<Book> book = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
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
				Book a = new Book(book_id, name, price, discount, pages, publisher, publisher_year, purchased, rateturn,
						rate, intro, image);
				book.add(a);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return book;
	}

	// trả về tất cả sách
	public List<Book> getAllBook() {
		sql = "SELECT * FROM BOOK limit 50";
		return getBook();
	}

	// trả về thể loại sách
	public List<Book> getBookGenre(String genre) {
		sql = "select b.book_id, Book_name, price, discount, pages, publisher, publishing_year, purchased, rateturn, rate, intro, image\r\n"
				+ "from book b, genre g, genrebook gb\r\n" + "where g.name = '" + genre
				+ "' and g.genre_id = gb.genre_id and b.book_id = gb.book_id";
		return getBook();
	}

	// trả về sách có giá từ price1 dến price2
	public List<Book> getBookPrice(int price1, int price2) {
		sql = "SELECT * FROM BOOK WHERE price between " + price1 + " and " + price2;
		return getBook();
	}

	public List<Book> getBookDiscount() {
		sql = "SELECT * FROM BOOK WHERE discount > 0 ORDER BY discount DESC ";
		return getBook();
	}

	// trả về sách mới
	public List<Book> getBoolNew() {
		sql = "SELECT *\r\n" + "from book\r\n" + "where year(curdate()) - 1 = publishing_year";
		return getBook();
	}

	// trả về sách bán chạy
	public List<Book> getBookHot() {
		sql = "SELECT * FROM BOOK\r\n" + "ORDER BY PURCHASED DESC\r\n" + "LIMIT 30";
		return getBook();
	}

	// trả về sách ngẫu nhiên
	public List<Book> getBookRandom() {
		sql = "SELECT * \r\n" + "FROM BOOK\r\n" + "ORDER BY RAND() LIMIT 30";
		return getBook();
	}

	public Book getBookById(String bookid) {
		sql = "SELECT * FROM BOOK WHERE BOOK_ID = '" + bookid + "'";
		Connection connection = JDBCConnection.getJDBCConnection();
		Book book = new Book();
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				book.setBook_id(rs.getString("book_id"));
				book.setName(rs.getString("Book_name"));
				book.setPrice(rs.getInt("price"));
				book.setDiscount(rs.getInt("discount"));
				book.setPages(rs.getInt("pages"));
				book.setPublisher(rs.getString("publisher"));
				book.setPublisher_year(rs.getInt("publishing_year"));
				book.setPurchased(rs.getInt("purchased"));
				book.setRateturn(rs.getInt("rateturn"));
				book.setRate(rs.getFloat("rate"));
				book.setIntro(rs.getString("intro"));
				book.setImage(rs.getString("image"));
				System.out.println(rs.getString("book_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return book;
	}

	// tìm kiếm sách theo tên
	public List<Book> getBookByName(String name) {
		sql = "SELECT * \r\n" + "FROM book b\r\n" + "where b.book_name like '%" + name + "%'";
		return getBook();
	}

	public void rateService(String bookId, int number) {
		sql = "update book \r\n" + "set rate = (rateturn * rate + " + number
				+ ") / (rateturn + 1), rateturn = rateturn + 1\r\n" + "where book_id = '" + bookId + "'";
		Connection connection = JDBCConnection.getJDBCConnection();

		try {
			Statement st = connection.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public boolean checkBook(String bookId) {
		List<Book> book = getAllBook();
		for(Book i : book) {
			if(i.getBook_id().equals(bookId))
				return true;
		}
		return false;
	}
	
	public void addBook(String bookId, String bookName, int pages, String NXB, int nam, 
						int price, int discount, String image,String content) {
		sql = "INSERT INTO book (book_id, Book_name, price, discount, pages, publisher, publishing_year, intro, image)\r\n" + 
				" VALUES ('" + bookId + "','"+ bookName +"', '" + price + "', '"+ discount + "', '" + pages +"', '"+ NXB + "', '"+ nam +"', '"+ content +"', '"+ image +"')";
    	Connection connection = JDBCConnection.getJDBCConnection();
    	
		try {
			Statement st = connection.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	

}
