package application.controller;

import java.awt.TextField;
import java.io.IOException;

import application.controller.BookController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Part of the application.controller package: Handles the events from the controllers of the Main.fxml
 * document.
 * 
 * @author	lvz774
 * @version 1.0
 */
public class MainController {
	

	@FXML
	private Button search;
	
	@FXML
	private Button surprise; 

	@FXML
	private Button classics; 
	//@FXML
	//private TextField ratingIn; 
	@FXML 
	private MenuButton genreIn; 
	@FXML
	private TextField ratingIn;
	
	
	public void handle(ActionEvent event) throws IOException {
		
	}
	

	
	/**
	 * Handles the event when the user clicks "search" to search for a book by rating and genre.
	 * 
	 * @param 	event		object that would be handled.
	 * @throws	IOException	if there is an error loading the Book.fxml file.
	 */
	public void setBookScene(ActionEvent event) throws IOException {
		
		String rating = ratingIn.getText();
		String genre = genreIn.getText();
		
		FXMLLoader bookLoader = new FXMLLoader();
		bookLoader.setLocation(getClass().getResource("./Book.fxml"));
		
		Parent bookRoot = bookLoader.load();
		Scene bookScene = new Scene(bookRoot);
		
		BookController bookController = bookLoader.getController();
		bookController.initializeBook(rating,genre);
		
		Stage personnelStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		personnelStage.setScene(bookScene);
		personnelStage.show();	
		
	}
	
	/**
	 * Handles the event when the user clicks "surprise" to show a random book.
	 * 
	 * @param	event		object that would be handled.
	 * @throws	IOException if there is an error loading the Surprise.fxml document.
	 */
	public void setSurpriseScene(ActionEvent event) throws IOException {
		
		//initialize random load
		
		FXMLLoader bookLoader = new FXMLLoader();
		bookLoader.setLocation(getClass().getResource("./Surprise.fxml"));
		
		Parent bookRoot = bookLoader.load();
		Scene bookScene = new Scene(bookRoot);
		
				
		Stage personnelStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		personnelStage.setScene(bookScene);
		personnelStage.show();	
		
	}
	
	/**
	 * Handles the event when the user clicks "classic" to display the classic titles.
	 * 
	 * @param	event		object that would be handled.
	 * @throws	IOException	if there is an error loading the Classic.fxml document.
	 */
	public void setClassicScene(ActionEvent event) throws IOException {
		
		//String rating = ratingIn.getText();
		//String genre = genreIn.getText();
		
		FXMLLoader classicLoader = new FXMLLoader();
		classicLoader.setLocation(getClass().getResource("./Classic.fxml"));
		
		Parent classicRoot = classicLoader.load();
		Scene bookScene = new Scene(classicRoot);
		
		ClassicController bookController = classicLoader.getController();
		bookController.initializeClassic();
		
		Stage personnelStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		personnelStage.setScene(bookScene);
		personnelStage.show();	
		
	}
	

}
