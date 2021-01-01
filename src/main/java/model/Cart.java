package model;

public class Cart {
	private Book product;
	private int quantity;
	
	public Cart() {
		super();
	}

	public Cart(Book product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	public Book getProduct() {
		return product;
	}
	public void setProduct(Book product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
