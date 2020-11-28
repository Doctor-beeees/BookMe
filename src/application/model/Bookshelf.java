package application.model;

import java.util.ArrayList;

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
	
	
	
}
