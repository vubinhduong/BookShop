package service;

import java.util.ArrayList;
import java.util.List;

import model.Admin;
import model.Cart;
import model.Genre;

public class Test {
	public static void main(String[] args) {
		AdminService a = new AdminService();
		CommentService c = new CommentService();
		ArrayList<Genre> gen = (ArrayList<Genre>) GenreSevice.getAll("1");
		for(Genre i : gen) {
			System.out.println(i.getGenre_id() + " " + i.getName());
		}
		BookService book = new BookService();
		UserService user = new UserService();
		AdminService admin = new AdminService();
		CommentService cmt = new CommentService();
		BillSevice bill = new BillSevice();
//		book.getAllBook();
//		book.getBoolNew();
//		book.getAllBook();
//		book.getBookGenre("Tiểu Thuyết");
//		book.getBookPrice(25000, 50000);
//		book.getBookHot();
//		book.getBookRandom();
//		book.getBookById("a2");
//		c.getAll();
//		c.getCmtByBookId("a2");
//		book.getBookByName("là");
//		user.getAllUser();
//		System.out.println(user.checkLoginUser("a", "a"));
//		System.out.println(admin.checkLoginAdmin("a", "a"));
//		System.out.println(admin.getAdminById("a").getUsername());
//		System.out.println(user.getUserById("a"));
		book.rateService("a3", 5);
		System.out.println(book.getBookById("a3").getRate());
//		cmt.addCommentByBookId("a5", "addsff", "1");
		Cart cart = new Cart();
		cart.setProduct(book.getBookById("a3"));
		cart.setQuantity(2);
		List<Cart> car = new ArrayList<Cart>();
		car.add(cart);
		bill.addBill("a", car);
		
		
		
		
		
	}
	
	
}
