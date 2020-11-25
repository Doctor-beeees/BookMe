/**
 * The ZoneController controls the zone view(�)

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

public class BookController {
	
	
	public void initializeBook(String rating, String Genre) throws IOException {
		
		//myZoneLabel.setText(zoneCode);
		//zCode = zoneCode;
		//p = new Park("Jurrasic Park");
		
		
	//	p.loadZones( "data/zones.csv" );
		//p.loadDinosaurs( "data/dinos.csv" );
		
		
	
	
		
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
	

