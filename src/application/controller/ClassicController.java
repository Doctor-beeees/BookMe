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
import javafx.stage.Stage;
import application.model.*;

public class ClassicController {
	
		@FXML
		private ListView<String>classics;
		
	public void initializeClassic() throws IOException {
			
		
			classics.getItems().add(0,"To Kill a mocking bird, Harper Lee");
			classics.getItems().add(1,"The Great Gatsby, F. Scott Fitzgerald");
			classics.getItems().add(2,"One Hundred Years of Solitude, Gabriel García Márquez ");
			classics.getItems().add(3,"A Passage to India, E.M. Forster");
			classics.getItems().add(4,"Invisible Man, Ralph Ellison’");
			classics.getItems().add(5,"Don Quixote,Miguel de Cervantes");
			classics.getItems().add(6,"Beloved, Toni Morrison");
			classics.getItems().add(7,"Mrs. Dalloway,Virginia Woolf");
			classics.getItems().add(8,"Things Fall Apart, Chinua Achebe");
			classics.getItems().add(9,"Great Expectations, Mark Twain");

		
			
		}
			
	
	/**
	 * @param event object that would be handled
	 * sets the scene to main scene
	 */
	public void setMainScene(ActionEvent event) throws IOException {
		
		Parent mainRoot = FXMLLoader.load(getClass().getResource("./Main.fxml"));
		Scene mainScene = new Scene(mainRoot);
		Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		mainStage.setScene(mainScene);
		mainStage.show();	
		

		
		//System.out.println("Hello World");
	}
	
}
	

