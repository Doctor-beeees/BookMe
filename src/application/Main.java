package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Part of the application package: Initiates the launch of the application and sets the stage and main
 * scene.
 * 
 * @author  lvz774
 * @version 1.0
 */
public class Main extends Application {
	

	private Stage  primaryStage;
	private BorderPane mainLayout; 
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage; 
		this.primaryStage.setTitle("BookMe");
		showMainView();
	}

	/**
	 * Loads and shows the main view of the application from the file {@code Main.fxml}.
	 * 
	 * @throws IOException if an error occure while loading the FXML document.
	 */
	private void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("controller/Main.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene (mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	/**
	 * Launches the application.
	 * 
	 * @param args command line arguments, will not be used.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}