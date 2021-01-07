package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bill;
import model.BillDetail;
import model.Cart;


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
		finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bill;
		
	}
	
	public List<BillDetail> getBillByUsername(String username){
		List<BillDetail> billDetail = new ArrayList<BillDetail>();
		Connection connection = JDBCConnection.getJDBCConnection();
		try {

			String sql = "select a.bill_id, book_id, quantity, bill_detail_id \r\n" + 
					"from bill a, bill_detail b\r\n" + 
					"where username = '"+ username +"' and a.bill_id = b.bill_id";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				int billDetail_id = rs.getInt("bill_detail_id");
				int bill_id = rs.getInt("bill_id");
				String book_id = rs.getString("book_id");
				int quantity = rs.getInt("quantity");
				BillDetail a = new BillDetail(billDetail_id, bill_id, book_id, quantity);
				billDetail.add(a);
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
		return billDetail;
	}
	
	public void addBill(String username, List<Cart> cart) {
		String billId = null;
		Connection connection = JDBCConnection.getJDBCConnection();
		long millis = System.currentTimeMillis();
    	Date date = new Date(millis);
    	sql = "select count(bill_id) cout from bill";
    	try {
    		Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				billId = String.valueOf(rs.getInt("cout") + 1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		sql = "INSERT INTO bill (bill_id, username, date_bill) "
				+ "VALUES ('" + billId +  "','" + username + "','" + date.toString() + "')";
		try {
			Statement st = connection.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int billdetailId = 0;
		
		sql = "select count(bill_detail_id) cout from bill_detail";
    	try {
    		Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				billdetailId = rs.getInt("cout");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(Cart i : cart) {
	    	sql = "INSERT INTO bill_detail (bill_detail_id, bill_id, book_id, quantity) "
					+ "VALUES ('" + (billdetailId + 1) +  "','" + billId + "','" + i.getProduct().getBook_id() + "','" + i.getQuantity() + "')";
			try {
				Statement st = connection.createStatement();
				st.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
		
		
	}
	
}
