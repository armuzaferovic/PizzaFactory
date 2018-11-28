package classes;

import java.util.Scanner;

public class Filiale2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salute s1= new Salute();
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie Ihre Bestellugn auf, m oder h");
		s1.backen(s.nextLine()).leckerSein();;
		
		
	}

}
