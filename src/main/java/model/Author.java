package model;

public class Author {
	public Author() {

	}

	public Author(String author_id, String name, String intro, String image) {
		this.author_id = author_id;
		this.name = name;
		this.intro = intro;
		this.image = image;
	}

	private String author_id;
	private String name;
	private String intro;
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
