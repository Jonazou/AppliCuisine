package application;

import java.util.Observable;

public class Modele2 extends Observable {

	public Modele2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void updateButton() {
		this.setChanged();
		this.notifyObservers();
	}

}
