package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			FXMLLoader loadr = new FXMLLoader(getClass().getResource("view/NuevaVista.fxml"));
			AnchorPane root1 = (AnchorPane) loadr.load();
			Scene scene = new Scene(root1);//Ponemos view/ porque están dentro de esa subcarpeta
			//scene.getStylesheets().add(getClass().getResource("view/applicationfxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CChannel");
			primaryStage.show();
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
