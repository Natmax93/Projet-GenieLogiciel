package repertoire;

public class Personne {
	String nom;
	String prenom;
	String telephoneMaison;
	String telephonePortable;
	String telephoneBureau;
	String fax;
	String titre;
	String societe;
	Adresse adresse;
	String mail;

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getTelephoneBureau() {
		return telephoneBureau;
	}

	public void setTelephoneBureau(String telephoneBureau) {
		this.telephoneBureau = telephoneBureau;
	}

	public String getTelephoneMaison() {
		return telephoneMaison;
	}

	public void setTelephoneMaison(String telephoneMaison) {
		this.telephoneMaison = telephoneMaison;
	}

	public String getTelephonePortable() {
		return telephonePortable;
	}

	public void setTelephonePortable(String telephonePortable) {
		this.telephonePortable = telephonePortable;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
		
	public String toString() {
		return nom+" "+prenom;
	}

}
