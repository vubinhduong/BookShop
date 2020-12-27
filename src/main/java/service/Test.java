package service;

import java.util.ArrayList;
import java.util.List;

import model.Admin;
import model.Genre;

public class Test {
	public static void main(String[] args) {
		AdminService a = new AdminService();
		List<Admin> b = a.getAllAdmin();
		if(b == null)
			System.out.println("thất bại");
		else 
			System.out.println("thành công");
		ArrayList<Genre> gen = (ArrayList<Genre>) GenreSevice.getAll("1");
		for(Genre i : gen) {
			System.out.println(i.getGenre_id() + " " + i.getName());
		}
		BookService book = new BookService();
		book.getAllBook();
		
	}
}
