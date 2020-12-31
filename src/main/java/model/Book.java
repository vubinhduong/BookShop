package model;

import java.util.List;

public class Book {
	public Book() {
	}

	public Book(String book_id, String name, int price, int discount, int pages, String publisher, int publisher_year,
			int purchased, int rateturn, float rate, String intro, String image) {
		this.book_id = book_id;
		this.name = name;
		this.genre = service.GenreSevice.getAll(book_id);
		this.price = price;
		this.discount = discount;
		this.pages = pages;
		this.publisher = publisher;
		this.publisher_year = publisher_year;
		this.purchased = purchased;
		this.rateturn = rateturn;
		this.rate = rate;
		this.intro = intro;
		this.image = image;
		this.author = service.AuthorService.getBookAuthor(book_id);
	}

	private String book_id;
	private String name;
	private List<Genre> genre;
	private int price;
	private int discount;
	private int pages;
	private String publisher;
	private int publisher_year;
	private int purchased;
	private int rateturn;
	private float rate;
	private String intro;
	private String image;
	private List<Author> author;

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Genre> getGenre() {
		return genre;
	}

	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublisher_year() {
		return publisher_year;
	}

	public void setPublisher_year(int publisher_year) {
		this.publisher_year = publisher_year;
	}

	public int getPurchased() {
		return purchased;
	}

	public void setPurchased(int purchased) {
		this.purchased = purchased;
	}

	public int getRateturn() {
		return rateturn;
	}

	public void setRateturn(int rateturn) {
		this.rateturn = rateturn;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getImage() {
		return "/resources/user/images/" +  image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

}
