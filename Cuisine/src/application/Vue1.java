package application;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Vue1 implements Observer{
	VueController1 ctrl;
	Modele modl;
		public Vue1(VueController1 ctrl,Modele modl) {
			super();
			this.ctrl=ctrl;
			this.modl=modl;
			
		}
		public void VueAffichage() {
			try {
			Stage stage = new Stage();
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("P1v3.fxml")),640,500);
			stage.setScene(scene);
			stage.show();
			modl.addObserver(this);
			
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}

}
