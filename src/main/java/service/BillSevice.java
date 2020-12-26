package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bill;


public class BillSevice {
	private Connection connection = JDBCConnection.getJDBCConnection();
	String sql;
	ResultSet rs;
	
	public List<Bill> getBillAll(){
		List<Bill> bill = new ArrayList<Bill>();
		sql = "SELECT * FROM BILL";
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				int bill_id = rs.getInt("bill_id");
				String username = rs.getString("username");
				Date dateBill = rs.getDate("date_bill");
				String address = rs.getString("address");
			
				Bill a = new Bill(bill_id, username, dateBill, address);
				bill.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
		
	}
	public static void main(String[] args) {
		BillSevice a = new BillSevice();
		List<Bill> b = a.getBillAll();
		if(b == null)
			System.out.println("thất bại");
		else
			System.out.println("thành công");
	}
}
