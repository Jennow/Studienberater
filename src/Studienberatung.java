import java.util.Scanner;

public class Studienberatung {
	
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Hast du Abitur?");
		String antwort = scan.nextLine();
		
		if (antwort.equalsIgnoreCase("j")) {
			System.out.println("Bist du wissbegierig?");
			antwort = scan.nextLine();
			if(antwort.equalsIgnoreCase("j")) {
				System.out.println("Auf jeden Fall studieren");
			}
			
			else if (antwort.equalsIgnoreCase("n")) {
				System.out.println("Nicht studieren");
			}
		}
	}
}
