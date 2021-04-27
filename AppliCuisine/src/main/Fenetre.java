package main;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Fenetre extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../resources/tabpane.fxml"));
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass().getResource("../resources/style.css").toExternalForm());
		
		stage.setMinHeight(400);
		stage.setMinWidth(300);
		
		stage.setTitle("oui");
		stage.setScene(scene);
		stage.isFullScreen();
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}


}