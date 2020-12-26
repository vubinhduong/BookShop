package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BillDetail;

public class BillDetailSevice {
	public static List<BillDetail> getDetail(int billId) {
		List<BillDetail> billDetail = new ArrayList<BillDetail>();
		try {
			Connection connection = JDBCConnection.getJDBCConnection();
			String sql = "SELECT * FROM bill_detail WHERE bill_id = " + billId;
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				int billDetail_id = rs.getInt("bill_detail_id");
				int bill_id = rs.getInt("bill_id");
				String book_id = rs.getString("book_id");
				BillDetail a = new BillDetail(billDetail_id, bill_id, book_id);
				billDetail.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return billDetail;
	}

}
