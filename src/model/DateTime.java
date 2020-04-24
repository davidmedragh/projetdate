package model;

/**
 * @author dmedragh
 *
 */
public class DateTime extends Date {

	private int heure;
	private int minute;
	public DateTime(int jour, int mois, int annee,int heure,int minute) {
		super(jour, mois, annee);
		this.heure=heure;
		this.minute=minute;
	}

	public DateTime() {
	}

	public DateTime(String dateMinute) {
		super(dateMinute.split(" ")[0]);
		String dh[]=dateMinute.split(" ");
		this.heure=Integer.parseInt(dh[1].split(":")[0]);
		this.minute=Integer.parseInt(dh[1].split(":")[1]);
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	public String toString(){
		return super.toString()+"heure"+this.heure+"Minute"+this.minute;
	}
	
	public int compareto(DateTime autreDateTime){

		if (super.compareto(autreDateTime)==0)
			if (this.getHeure()==autreDateTime.getHeure())
				if (this.getMinute()==autreDateTime.getMinute()) return 0;
				else if (this.getMinute()<autreDateTime.getMinute()) return -1;
				else return 1;
			else if (this.getHeure()<autreDateTime.getHeure())return -1;
			else return 1;
		else if (super.compareto(autreDateTime)<0) return -1;
		else return 1;
	}

}
