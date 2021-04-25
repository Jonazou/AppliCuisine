package application;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class VueController{

@FXML
private Button BtnEsp,BtnFr,BtnIt,BtnJpo;
private Button retour;
static HashMap<String,Parent> List = new HashMap<>();



public void LoadMenuRecette(ActionEvent event) {
	try {
		Parent parent1=null;
		parent1 = FXMLLoader.load(getClass().getResource("P3v1.fxml"));
		Stage stage =(Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(parent1));
		System.out.println(event.getSource());

		}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
public void LoadRecette(ActionEvent event) {
	try {
		Parent parent2=null;

		parent2 = FXMLLoader.load(getClass().getResource("P2v1.fxml"));
		Stage stage =(Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(parent2));
		System.out.println(event.getSource());
			}
	catch(Exception e) {
		e.printStackTrace();
		}
}
@FXML
public void LoadLastPage(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("P1v3.fxml"));
			Stage stage =(Stage) ((Button) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			System.out.println(event.getSource());
		    
			    
				}	

	catch(Exception e) {
		e.printStackTrace();
		}


}




}
