package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Part of the application.model package:
 * document.
 * 
 * @author	lvz774
 * @version 1.0
 */
public class Library {
	
	private ArrayList<Bookshelf> lib; 
	private String name;
	
	public Library(String name){
		setName(name);
		this.lib = new ArrayList<Bookshelf>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public void addShelf(Bookshelf b){
		this.lib.add(b);
	}
	
	public ArrayList<Bookshelf> getShelf(){
		return this.lib;
	}
	
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
				String genre = values[4];


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
	



		public Book getBookBySelections(String rating, String genre) {

	        Book ret = new Book("No", "Books", "Were", "Found");
	        
	        float searchRating =  Float.parseFloat(rating);
	        int iIndex =0;
	        int jIndex = 0;

	        for(int i = 0; i < this.getShelf().size(); i++){
	        	
	            if(this.getShelf().get(i).getGenre().contains(genre)){
	            	iIndex = i;
	            	for(int j = 0; j < this.getShelf().get(iIndex).getBooks().size(); j++){
	            		float floatRating = Float.parseFloat(this.getShelf().get(iIndex).getBooks().get(j).getRating());        
	                    if(floatRating >= searchRating)
	                    	jIndex = j;
	                    	ret = this.getShelf().get(iIndex).getBooks().get(jIndex);
	                    	

	                    }

	                }

	            }

	        
    
	        return ret;

	    
	}
	
	    public Book getBookByRandom() {

	        Book newBook = new Book("No","Books","Were","Found");
            Random rand = new Random();
	        int shelfIndex = rand.nextInt( getShelf().size());
	        int bookIndex = rand.nextInt((this.getShelf().get(shelfIndex).getBooks().size()));
	        newBook = getShelf().get(shelfIndex).getBooks().get(bookIndex);
	        

	        return newBook;

	    }
}
