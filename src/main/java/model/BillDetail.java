package model;

public class BillDetail {
	public BillDetail() {

	}
	
	public BillDetail(int billDetail_id, int bill_id, String book_id, int quantity) {
		this.billDetail_id = billDetail_id;
		this.bill_id = bill_id;
		this.book_id = book_id;
		this.quantity = quantity;
	}

	private int billDetail_id;
	private int bill_id;
	private String book_id;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBillDetail_id() {
		return billDetail_id;
	}

	public void setBillDetail_id(int billDetail_id) {
		this.billDetail_id = billDetail_id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

}
