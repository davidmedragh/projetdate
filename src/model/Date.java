package model;

/**
 * @author dmedragh
 *
 */
public class Date {
	
	private int jour;
	private int mois;
	private int annee;

	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public Date() {
	}

	public Date(String date_s) {
		//	
		String tmp[] = date_s.split("/");
		this.jour = Integer.parseInt(tmp[0]);
		this.mois = Integer.parseInt(tmp[1]);
		this.annee = Integer.parseInt(tmp[2]);
	}

	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}

	public int get_jour() {
		return this.jour;
	}

	public int get_mois() {
		return this.mois;
	}

	public int get_annee() {
		return this.annee;
	}

	public void set_jour(int jour) {
		this.jour = jour;
	}

	public void set_mois(int mois) {
		this.mois = mois;
	}

	public void set_annee(int annee) {
		this.mois = annee;
	}

	/**
	 * 0 si egaux -1 inferieur 1 superieur 
	 * @param autreDate
	 * @return
	 */
	public int compareto(Date autreDate) {
		if (this.get_annee() == autreDate.get_annee())
			if (this.get_mois() == autreDate.get_mois())
				if (this.get_jour() == autreDate.get_jour())
					return 0;
				else if (this.get_jour() < autreDate.get_jour())
					return -1;
				else
					return 1;
			else if (this.get_mois() < autreDate.get_mois())
				return -1;
			else
				return 1;
		else if (this.get_annee() < autreDate.get_annee())
			return -1;
		else
			return 1;
	}

}
