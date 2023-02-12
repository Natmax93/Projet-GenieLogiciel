package repertoire;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIPersonne extends JPanel {

	Personne personne;

	JTextField nomTF,
		prenomTF,
		telMaisonTF,
		telPortTF,
		telBurTF,
		faxTF,
		titreTF,
		socTF,
		addTF,
		mailTF;

	public UIPersonne() {
		super();
		init();
	}

	public UIPersonne(Personne p) {
		super();
		personne = p;
		init();
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
		prenomTF.setText(personne.getPrenom());
		nomTF.setText(personne.getNom());
		telBurTF.setText(personne.getTelephoneBureau());
		telMaisonTF.setText(personne.getTelephoneMaison());
		telPortTF.setText(personne.getTelephonePortable());
		faxTF.setText(personne.getFax());
		titreTF.setText(personne.getTitre());
		socTF.setText(personne.getSociete());
		//Adresse
		mailTF.setText(personne.getMail());
	}

	public void init() {
		this.setLayout(new GridLayout(0, 2));
		add(new JLabel("nom"));
		nomTF = new JTextField("");
		add(nomTF);

		add(new JLabel("prenom"));
		prenomTF = new JTextField("");
		add(prenomTF);
		add(new JLabel("telephone maison"));
		telMaisonTF = new JTextField("");
		add(telMaisonTF);
		add(new JLabel("telephone portable"));
		telPortTF = new JTextField("");
		add(telPortTF);
		add(new JLabel("telephone bureau"));
		telBurTF = new JTextField("");
		add(telBurTF);
		add(new JLabel("fax"));
		faxTF = new JTextField("");
		add(faxTF);
		add(new JLabel("titre"));
		titreTF = new JTextField("");
		add(titreTF);
		add(new JLabel("société"));
		socTF = new JTextField("");
		add(socTF);
		add(new JLabel("adresse"));
		addTF = new JTextField("");
		add(addTF);
		add(new JLabel("mail"));
		mailTF = new JTextField("");
		add(mailTF);
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personne.setPrenom(prenomTF.getText());
				personne.setNom(nomTF.getText());
				personne.setTelephoneBureau(telBurTF.getText());
				personne.setTelephoneMaison(telMaisonTF.getText());
				personne.setTelephonePortable(telPortTF.getText());
				personne.setFax(faxTF.getText());
				personne.setTitre(titreTF.getText());
				personne.setSociete(socTF.getText());
				//personne.setAdresse(addTF.getText());
				personne.setMail(mailTF.getText());
			}
		});
		add(save);
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prenomTF.setText(personne.getPrenom());
				nomTF.setText(personne.getNom());
				telBurTF.setText(personne.getTelephoneBureau());
				telMaisonTF.setText(personne.getTelephoneMaison());
				telPortTF.setText(personne.getTelephonePortable());
				faxTF.setText(personne.getFax());
				titreTF.setText(personne.getTitre());
				socTF.setText(personne.getSociete());
				//Adresse
				mailTF.setText(personne.getMail());
			}
		});
		add(cancel);

	}

}
