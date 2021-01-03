package service;

import java.util.ArrayList;
import java.util.List;

import model.Admin;
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
//		book.getAllBook();
//		book.getBoolNew();
//		book.getAllBook();
//		book.getBookGenre("Tiểu Thuyết");
//		book.getBookPrice(25000, 50000);
//		book.getBookHot();
//		book.getBookRandom();
//		book.getBookById("a2");
//		c.getAll();
		c.getCmtByBookId("a2");
		book.getBookByName("là");
		user.getAllUser();
		System.out.println(user.checkLoginUser("a", "a"));
		System.out.println(admin.checkLoginAdmin("a", "a"));
		System.out.println(admin.getAdminById("a").getUsername());
		System.out.println(user.getUserById("a"));
	}
}
