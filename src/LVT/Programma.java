package LVT;

import java.util.Random;
import java.util.Scanner;

public class Programma {


	public static void main(String[] args) {
		System.out.println("Esi sveicināgs manā metamā kauliņa programmā!");
		int skaitlis, reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		mestKaulinu(reizes);
		scan.close();
	}
	static void mestKaulinu(int reizes) {
	
		int skaitlis;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}

		

		
	
	
		

	}

}
