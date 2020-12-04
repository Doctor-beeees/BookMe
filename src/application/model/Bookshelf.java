package application.model;

import java.util.ArrayList;

/**
 * Part of the application.model package:
 * document.
 * 
 * @author	lvz774
 * @version 1.0
 */
public class Bookshelf {
	private String genre;
	private ArrayList<Book> shelf;
	
	public Bookshelf(String genre){
		setGenre(genre);
		this.shelf = new ArrayList<Book>();
	}
	
	
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void addBook(Book b){
		this.shelf.add(b);
	}
	
	public ArrayList<Book> getBooks(){
		return this.shelf;
	}
	
}
