package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
	

	public Book getBookBySelections(String rating, String genre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Book getBookByRandom() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
