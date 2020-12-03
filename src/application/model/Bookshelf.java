package application.model;

import java.util.ArrayList;

/**
 * Part of the application.model package: The class to represent a Bookself object, or a collection of
 * books by genre. Includes a String and an ArrayList of Books to represent the genre and the shelf
 * respectively. Also includes getters and setters for each instance variable,
 * 
 * @author  lvz774
 * @version 1.0
 */
public class Bookshelf {
	private String genre;
	private ArrayList<Book> shelf;
	
	/**
	 * Constructor: creates a new Bookshelf object, initializing the genre and creating the ArrayList of
	 * Book objects.
	 * 
	 * @param genre the genre of the books.
	 */
	public Bookshelf(String genre){
		setGenre(genre);
		this.shelf = new ArrayList<Book>();
	}
	/**
	 * Gets the genre of the shelf.
	 * 
	 * @return the String representing the genre.
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * Sets the genre of the shelf.
	 * 
	 * @param genre the genre to set.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * Adds a book to the bookshelf.
	 * 
	 * @param b the book to add.
	 */
	public void addBook(Book b){
		this.shelf.add(b);
	}
	
	/**
	 * Gets the books on the bookshelf.
	 * 
	 * @return the ArrayList of Book objects.
	 */
	public ArrayList<Book> getBooks(){
		return this.shelf;
	}
	
}
