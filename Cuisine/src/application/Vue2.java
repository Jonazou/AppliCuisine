package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Vue2 implements Observer{
	public VueController2 ctrl;
	public Modele modl;


	public Vue2(VueController2 ctrl) {
		super();
		this.ctrl=ctrl;


	}




@Override
public void update(Observable arg0, Object arg1) {
	Modele m = new Modele(this.modl.dico);
	for (int i=0; i<m.recherche((String) arg1).size(); i++) {
		Button btn = new Button();
		btn.setText(m.recherche((String) arg1).get(i));
		this.ctrl.vbox.getChildren().add(btn);
}
	//this.ctrl.Brecette1.setText((arg0) RecetteName().get(1));

	
}

ArrayList<String> RecetteName() throws IOException {
	String CsvFile = "BDD/BDDrecette.csv";
	String FieldDelimiter = ",";
	BufferedReader br;
	ArrayList<String> RctNom = new ArrayList<String>();
	br = new BufferedReader(new FileReader(CsvFile));
	String line;
	while ((line = br.readLine()) != null) {
         String[] fields = line.split(FieldDelimiter, -1);
         RctNom.add(fields[1]);
}
		return RctNom;		
}

public void loadRctName() throws IOException {
	try {
		this.ctrl.Brecette1.setText((String) RecetteName().get(1));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(this.ctrl.Brecette1);
	
}
         

     

             
         }
         
     

     





