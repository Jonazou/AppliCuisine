package main;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Controller {
	@FXML private Button test,test2,boutonRetour;
	
	@FXML private TabPane tabPane;
	
	@FXML private Tab newTab;
	
	private Stage stage;
	private Parent parent = null;
	
	@FXML
	public void changeScene(ActionEvent event) throws IOException {
		if(event.getSource()==test)
			parent = FXMLLoader.load(getClass().getResource("../resources/recherche.fxml"));

		else if (event.getSource()==test2)
			parent = FXMLLoader.load(getClass().getResource("../resources/accueil.fxml"));

		stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(parent));
	
	}
	
	@FXML
	public void retourScene(ActionEvent event) throws IOException{
		return;
	}
	
	@FXML
	public void addTab() {
		Tab oui = new Tab("ayayayayayayayayayayayayayaay");
		tabPane.getTabs().add(tabPane.getTabs().size()-1, oui);
		tabPane.getSelectionModel().select(oui);
	}
	
	
}
