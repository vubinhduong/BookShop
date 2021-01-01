package model;

public class Genre {
	public Genre() {

	}

	public Genre(String genre_id, String name) {
		this.genre_id = genre_id;
		this.name = name;
	}

	private String genre_id;
	private String book_id;
	private String name;

	public String getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(String genre_id) {
		this.genre_id = genre_id;
	}

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

}
