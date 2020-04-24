package model;

import java.io.*;
/**
 * @author dmedragh
 *
 */
public class Pg {

	public Pg(){
		DateTime Naissance=new DateTime(10,12,2008,10,22);
		//Naissance.set_jour(22);
		Naissance.toString();
		System.out.println("l'annÃ©e est "+Naissance.toString());
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String ligne;
		BufferedReader Input;
		Input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("saisissez votre première date S.V.P");
		ligne=Input.readLine();
		System.out.println("ligne lue  "+ligne);
		DateTime Date1=new DateTime(ligne);
		System.out.println("Saisissez votre deuxieme date S.V.P");
		ligne=Input.readLine();
		DateTime Date2=new DateTime(ligne);
		int tr=Date1.compareto(Date2);
		if (tr==0) System.out.println("meme date");
		else if (tr<0) System.out.println("Date1 < Date 2");
		else System.out.println("Date1 > Date2");
	}
}
