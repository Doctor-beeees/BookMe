package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Part of the application.model package: The class to represent a Library object with instance varables
 * of lib and name, which are an ArrayList of Bookshelf objects and String respective name. Also has
 * getter and setter methods for each class field, and methods to get a book.
 * 
 * @author lvz774
 * @author Alec Soliz
 * @author Jalyn Merritt
 */
public class Library {
	private ArrayList<Bookshelf> lib; 
	private String name;
	
	public Library(String name){
		setName(name);
		this.lib = new ArrayList<Bookshelf>();
	}
	
	/**
	 * Gets the name of the library.
	 * 
	 * @return the String representing the name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the library.
	 * 
	 * @param name the name to set to.
	 */
	public void setName(String name) {
		this.name = name;
	} 
	
	/**
	 * Adds a Bookshelf object, which contains an ArrayList of Books and genre as a String, to the
	 * library.
	 * 
	 * @param b the Bookshelf object to add.
	 */
	public void addShelf(Bookshelf b){
		this.lib.add(b);
	}
	
	/**
	 * Gets the collection of Bookshelves from the library.
	 * 
	 * @return the ArrayList of Bookshelf objects.
	 */
	public ArrayList<Bookshelf> getShelf(){
		return this.lib;
	}
	
	/**
	 * Loads the book data from the path passed to the parameter and stores each book into a bookshelf
	 * by genre, then loads the bookshelf into the library.
	 * 
	 * @param	path		the path to locate the books file.
	 * @throws	IOException	if there was an error openning the file.
	 */
	public void loadBooks(String path) throws IOException {
		File file = new File(path); 
		
		try{
			Scanner input = new Scanner(file);
			while(input.hasNextLine())
			{
				
				int found = 0;
				String data = input.nextLine();
				String values[] = data.split(",");
				String title = values[0];
				String author = values[1];
				String rating = values[2];
				String numRating = values[3];
				String genre = values[3];


				Book b = new Book(title,author, rating, numRating);
				
				for(int i = 0; i< lib.size(); i++)
				{
					
					if(this.lib.get(i).getGenre().contains(genre)){
						this.lib.get(i).addBook(b);
						found = 1;
					}
					
				}
				if(found == 0){
					Bookshelf s = new Bookshelf(genre);
					s.addBook(b);
					addShelf(s);
				}
				
				
			}
			
			input.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			
		
	}
	
	/**
	 * Gets a Book object by the user's selections of rating and genre.
	 * @param	rating	the rating to get.
	 * @param	genre	the genre to get.
	 * @return			the Book object with the matching rating and genre.
	 */
	public Book getBookBySelections(String rating, String genre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Gets a random book from the library.
	 * 
	 * @return the Book object received from the random generation.
	 */
	public Book getBookByRandom() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
