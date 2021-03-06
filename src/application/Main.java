package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Main class, sets stage for scene viewer
 * @author lvz774
 *
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
	 * loads view
	 * @throws IOException
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
	 * launch
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}