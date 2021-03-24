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
	@FXML private Button test,test2;


	public void changeScene(ActionEvent event) throws IOException {
		Parent parent = null;

		if(event.getSource()==test) 
			parent = FXMLLoader.load(getClass().getResource("../resources/test2.fxml"));

		else if (event.getSource()==test2)
			parent = FXMLLoader.load(getClass().getResource("../resources/test.fxml"));

		Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(parent));
		System.out.println(event.getSource());

	}
}
