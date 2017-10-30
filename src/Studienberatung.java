import java.util.Scanner;

public class Studienberatung {
	
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Hast du Abitur?");
		String antwort = scan.nextLine();
		if (antwort.equalsIgnoreCase("j")){
			
		} 
		else if (antwort.equalsIgnoreCase("n")){
			 System.out.println("Hast du Fachabitur?");
			 antwort = scan.nextLine();
			 if (antwort.equalsIgnoreCase("j")){
					
				} 
			 else if (antwort.equalsIgnoreCase("n")){
				 System.out.println("Nicht studieren");
			 } 
			} 
	}
}
