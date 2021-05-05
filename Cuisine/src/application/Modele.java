package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Scanner;

import javafx.css.Styleable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Modele extends Observable{
	
	
	HashMap<String,ArrayList<String>> dico = new HashMap<String,ArrayList<String>>();
	
	public Modele(HashMap<String,ArrayList<String>> Dictionnaire){
		this.dico=Dictionnaire;
		try {
			HashMap<String,ArrayList<String>> dicoRecette = new HashMap<>();
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
	}
	
	@FXML
	private String checkID(ActionEvent event){
	            System.out.println("running");
	            return ((Styleable) event).getId();
	}
	
	HashMap<String, ArrayList<String>> readCSV() throws IOException {
	    HashMap<String,ArrayList<String>> dataList = new HashMap<String,ArrayList<String>>();
	    String CsvFile = "BDD/BDDrecette.csv";
	    String FieldDelimiter = ",";
	    String StepDelimiter = ":";
		BufferedReader br;
	    br = new BufferedReader(new FileReader(CsvFile));
	    String line;
	    while ((line = br.readLine()) != null) {
	        	 ArrayList<String> List = new ArrayList<>();
	             String[] fields = line.split(FieldDelimiter, -1);
	             String[] step = line.split(StepDelimiter, -1);
	             List.add(step[1]);
	             List.add(step[2]);
	             dataList.put(fields[1],List);
		             }
	    return dataList;
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
	
	public ArrayList<String> recherche(String s) {
			String[] listeTag = s.split(" ");
			ArrayList<ArrayList<String>> listeDeListeDeRecette = new ArrayList<>();
			ArrayList<String> listeDeRecette = new ArrayList<>();
			if (listeTag.length==1) {
				return this.dico.get(listeTag[0]);
			}
			for ( String tag : listeTag ) {
				String smallTag = tag.toLowerCase();
				listeDeListeDeRecette.add(this.dico.get(smallTag));
			}
			for ( String recette : listeDeListeDeRecette.get(0)) {
				int i = 1;
				outterloop:
				while (listeDeListeDeRecette.get(i).contains(recette)) {
					i+=1;
					if(i==listeDeListeDeRecette.size()) {
						listeDeRecette.add(recette);
						break outterloop;
					}
				}
			}
			this.setChanged();
			this.notifyObservers(listeDeRecette);
			return listeDeRecette;
		}
		


	}
	
	    

	
		
