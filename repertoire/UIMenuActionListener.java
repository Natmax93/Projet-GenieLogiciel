package repertoire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class UIMenuActionListener implements ActionListener {
	
	UIRepertoire uirep;
	
	public UIMenuActionListener(UIRepertoire uirep) {
		super();
		this.uirep = uirep;
	}

	public void actionPerformed(ActionEvent ev) {
		JMenuItem test = (JMenuItem) ev.getSource();
		if (test.getText() == "A Propos")
			System.out.println("Aide");
		else if (test.getText() == "Rechercher Personne(s)") {
			System.out.println("LOAD ");
		}
		else if (test.getText() == "Ajouter Nouvelle Personne") {
			System.out.println("Ajouter Nouvelle Personne ");
			Personne p = new Personne();
			uirep.getTheRepertoire().ajouterPersonne(p);
			uirep.refreshUIRepertoire();

		}
		else if (test.getText() == "Rechercher Personne(s)") {
			System.out.println("LOAD ");

		}
		else if (test.getText() == "Nouveau") {
			System.out.println("Nouveau ");
			uirep.setTheRepertoire(new Repertoire());
		}
		else if (test.getText() == "Enregistrer Sous") {
			System.out.println("LOAD ");

		}
		else if (test.getText() == "Enregistrer") {
			System.out.println("LOAD ");

		}
		else if (test.getText() == "Ouvrir") {
			System.out.println("LOAD ");

		}
	}

}
