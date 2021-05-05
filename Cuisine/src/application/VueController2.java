package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class VueController2{
	public Modele modl;
	public Main main;;
	@FXML
	public Text text1;
	@FXML
	private Button BtnEsp,BtnFr,BtnIt,BtnJpo;
	@FXML
	public Button Brecette1,Brecette2,Brecette3,Brecette4;
	@FXML
	public VBox vbox;
	
	
	public VueController2(Modele modl) {
		this.modl=modl;
		
	}
	public VueController2() {
		super();
	}
	
	public void setMain(Main main) {
	    this.main = main;
	    
	}
	public void UpdateFeunetre(WindowEvent event){
		this.modl.recherche((String) ((Node) event.getSource()).getId());
	}

	@FXML
	public void LoadRecette(ActionEvent event) {
		try {
			Parent parent2 = FXMLLoader.load(getClass().getResource("P3v2.fxml"));
			Stage stage =(Stage) ((Button) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(parent2));
			stage.show();
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
