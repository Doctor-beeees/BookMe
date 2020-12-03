/**
 * The ZoneController controls the zone view(…)

 */
package application.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import application.model.*;

/**
 * Part of the application.controller class: The class to handle the texts for the title, author,
 * rating, number of ratings, and the home button.
 * 
 * @author	lvz774
 * @version 1.0
 */
public class BookController {
	
	@FXML
	private Text title;
	@FXML
	private Text author;
	@FXML
	private Text ratingIn;
	@FXML
	private Text numRatings;
	@FXML
	private Text genreIn;
	
	/**
	 * Initializes the Book view of the book the user selected. Calls the method from the Library class
	 * to load the books and gets the book by searching by rating and genre.
	 * 
	 * @param	rating		the rating of the book.
	 * @param	genre		the genre of the book.
	 * @throws	IOException if there was an error loading the book data.
	 */
	public void initializeBook(String rating, String genre) throws IOException {
		
		
		Library b = new Library("BookMe");
		b.loadBooks("./data/books.csv");
		
		Book pick = b.getBookBySelections(rating, genre); 
		
		
		title.setText(pick.getTitle());
		author.setText(pick.getAuthor());
		ratingIn.setText(pick.getRating());
		numRatings.setText(pick.getNumRatings());
		genreIn.setText(genre);
		
		
	}
		
	/**
	 * Initializes the Book view with a random book from the library.
	 * 
	 * @throws IOException if there is an error loading the book data.
	 */
	public void initalizeSurprise() throws IOException {
		Library b = new Library("BookMe");
		b.loadBooks("./data/books.csv");
		/*
		Bookshelf pick = b.getBookByRandom();
		title.setText(pick.getTitle());
		author.setText(pick.getAuthor());
		ratingIn.setText(pick.getRating());
		numRatings.setText(pick.getNumRatings());
		genreIn.
		*/
		
		
	}
	
	/**
	 * Returns to the Main view when the user clicks "home".
	 * 
	 * @param event object that would be handled.
	 */
	public void setMainScene(ActionEvent event) throws IOException {
		
		Parent mainRoot = FXMLLoader.load(getClass().getResource("./Main.fxml"));
		Scene mainScene = new Scene(mainRoot);
		Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		mainStage.setScene(mainScene);
		mainStage.show();	
		

	
	}
	
}
	

