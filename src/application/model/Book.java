package application.model;

/**
 * Part of the application.model package: The class to define the Book object of four instance String
 * variables: the title, the author, the rating, and the number of ratings. Also includes getters and
 * setters for each instance variable.
 * 
 * @author	lvz774
 * @version 1.0
 */
public class Book {
	private String title;
	private String author;
	private String rating;
	private String numRatings;
	
	/**
	 * Constructor: Default constructor to create a new object to represent a book.
	 * 
	 * @param title			the title of the book.
	 * @param author		the author of the book.
	 * @param rating		the rating of the book.
	 * @param numRatings	the number of ratings.
	 */
	public Book(String title, String author, String rating,  String numRatings){
		
	}

	/**
	 * Gets the title of the book.
	 * 
	 * @return the String representing the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title of the book.
	 * @param title the title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author of the book.
	 * 
	 * @return the String representing the author.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author of the book.
	 * 
	 * @param author the author to set.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the rating of the book.
	 * 
	 * @return the String representing the rating.
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * Sets the rating of the book.
	 * 
	 * @param rating the rating to set.
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * Gets the number of ratings in String format.
	 * 
	 * @return the String representing the number of ratings.
	 */
	public String getNumRatings() {
		return numRatings;
	}

	/**
	 * Sets the number of ratings as a String.
	 * @param numRatings the number of ratings to set.
	 */
	public void setNumRatings(String numRatings) {
		this.numRatings = numRatings;
	}

}
