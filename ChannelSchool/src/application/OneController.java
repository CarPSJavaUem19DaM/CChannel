package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class OneController {

	private AnchorPane mypane;

	@FXML 
	private void openPane(ActionEvent event) {	
		try {            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/SegundaVista.fxml"));
 		    mypane = (AnchorPane) loader.load();
 		    Scene scene = new Scene(mypane);		   
 		    Stage stage = new Stage();	//En el main hay un star stage pero aqui hay q ponerlo	    
 		    stage.setScene(scene);
 		   //stage.setResizable(false);
 		    stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	@FXML
	private void handleClose() {
		System.exit(0);
	}    
}