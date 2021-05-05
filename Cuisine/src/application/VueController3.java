package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VueController3 {
	
	private Modele modl;

	public VueController3(Modele modl) {
		this.setModl(modl);
	}
	public VueController3() {
		super();
	}

	public Modele getModl() {
		return modl;
	}

	public void setModl(Modele modl) {
		this.modl = modl;
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
