package application.model;

public class Book {
	private String title;
	private String author;
	private String rating;
	private String numRatings;
	
	public Book(String title, String author, String rating,  String numRatings){
		
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the numRatings
	 */
	public String getNumRatings() {
		return numRatings;
	}

	/**
	 * @param numRatings the numRatings to set
	 */
	public void setNumRatings(String numRatings) {
		this.numRatings = numRatings;
	}

}
