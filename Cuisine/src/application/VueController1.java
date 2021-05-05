package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VueController1{
	private Modele modl;
	@FXML
	private Button Brecette1;

	public VueController1(Modele modl) {
		this.modl=modl;
	}
	public VueController1() {
		super();
	}
	
	@FXML
	public void load1(ActionEvent event) throws IOException {
		try {
			System.out.println(Brecette1);
			Parent parent1 = FXMLLoader.load(getClass().getResource("P2v1.fxml"));
			Stage stage =(Stage) ((Button) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(parent1));
			stage.show();
			
			
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//modl.loadRctName();
	}
}
