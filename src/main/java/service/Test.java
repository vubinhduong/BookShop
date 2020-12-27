package service;

import java.util.List;

import model.Admin;

public class Test {
	public static void main(String[] args) {
		AdminService a = new AdminService();
		List<Admin> b = a.getAllAdmin();
		if(b == null)
			System.out.println("thất bại");
		else 
			System.out.println("thành công");
	}
}
