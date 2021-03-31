package main;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
	@FXML private Button test,test2,boutonRetour;
	
	public GestionScenes gestion = new GestionScenes();
	
	
	private Stage stage;
	private Parent parent = null;

	
	@FXML
	public void changeScene(ActionEvent event) throws IOException {
		if(event.getSource()==test)
			parent = FXMLLoader.load(getClass().getResource(this.gestion.listeScenes[1]));

		else if (event.getSource()==test2)
			parent = FXMLLoader.load(getClass().getResource(this.gestion.listeScenes[0]));

		stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(parent));
	
	}
	
	@FXML
	public void retourScene(ActionEvent event) throws IOException{
		return;
	}
	
	
}
