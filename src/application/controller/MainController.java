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
		
	
	
	public void handle(ActionEvent event) throws IOException {
		
	}
	

	
	/**
	 * @param event object that would be handled
	 * sets the scene to appropriate scene
	 */
	public void setBookScene(ActionEvent event) throws IOException {
		
		//String rating = ratingIn.getText();
		//String genre = genreIn.getText();
		
		FXMLLoader bookLoader = new FXMLLoader();
		bookLoader.setLocation(getClass().getResource("./Book.fxml"));
		
		Parent bookRoot = bookLoader.load();
		Scene bookScene = new Scene(bookRoot);
		
		//BookController bookController = bookLoader.getController();
		//bookController.initializeZone(rating,genre);
		
		Stage personnelStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		personnelStage.setScene(bookScene);
		personnelStage.show();	
		
	}
	
	

}
