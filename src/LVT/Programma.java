package LVT;

import java.util.Random;

public class Programma {
	static void mestKaulinu(int reizes) {
		Random rand = new Random();
		int skaitlis;
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		
	}
	public static void main(String[] args) {
		mestKaulinu(5);
	}

}
