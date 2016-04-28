package Wieziennie;

import java.util.ArrayList;


public class PrisonCell {
	private  ArrayList<Prisoner> cela = new ArrayList<Prisoner>(4);
	
	public void dodajWieznia(ArrayList<Prisoner> cela) {
		if (cela.size() == 4) {
			System.out.println("Brak miejsc ");
		} else if(cela.size() > 4) {
			System.out.println("Mozna przyjaæ ");
		}
	}
	
	public void usunWieznia() {
		
	}

	public ArrayList<Prisoner> getCela() {
		return cela;
	}

	public void setCela(ArrayList<Prisoner> cela) {
		this.cela = cela;
	}
	
}
