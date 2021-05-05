package application;
	

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
				HashMap<String,ArrayList<String>> dicoRecette = new HashMap<>();
				try {
		            Scanner input = new Scanner("BDD/Dico.cvs");

		            File file = new File(input.nextLine());

		            input = new Scanner(file);


		            while (input.hasNextLine()) {
		                String line = input.nextLine();
		                ArrayList<String> val = new ArrayList<>(Arrays.asList(line.split(",")));
		                String key = val.get(0);
		                val.remove(0);
		                dicoRecette.put(key, val);
		            }
		            input.close();

		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				
			Modele m = new Modele(dicoRecette);
			Modele2 m2 = new Modele2();
			VueController1 ctrl1 = new VueController1(m);
			VueController2 ctrl2 = new VueController2(m);
			VueController2 ctrl3 = new VueController2(m);
			
			Vue1 vue1 = new Vue1(ctrl1,m);
			Vue2 vue2 = new Vue2(ctrl2);
			Vue3 vue3 = new Vue3(ctrl3);
			
			m.addObserver(vue1);
			m2.addObserver(vue2);
			m.addObserver(vue3);
			
			vue1.VueAffichage();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}


}
