package repertoire;

import java.util.Iterator;
import java.util.ArrayList;

public class Repertoire {
	
	ArrayList <Personne> personnes;
	
	public void ajouterPersonne(Personne p) {
		personnes.add(p);
	}
	
	public void supprimerPersonne(Personne p) {
		personnes.remove(p);
	}
	
	public Personne[] rechercherPersonnesParNom(String nom) {
		ArrayList <Personne> success = new ArrayList<Personne>();
		for (Iterator it = personnes.iterator() ; it.hasNext();) {
			Personne current = (Personne) it.next();
			if (current.getNom().compareTo(nom)==0) success.add(current);
		}
		Personne[] res = new Personne[0];
		return (Personne[]) success.toArray(res);
	}
	
	public Personne[] listerPersonnes() {
		Personne[] res = new Personne[0];
		return personnes.toArray(res);
	}
	
	public Repertoire() {
		personnes = new ArrayList<Personne>();
	}

}
