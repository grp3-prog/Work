package tablede5;

import java.util.Scanner;

public class tablede5 {

	public static void main(String[] args) {
		boolean x = false;
		boolean y = false;
		while (x==false) {
			x=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous afficher la table de multiplication de 5 ? 1 = Oui / 2 = Non");
		int str = sc.nextInt();
		
		if(str==1) {
			System.out.println("5x1 = 5 / 5x2 = 10 / 5x3 = 15 / 5x4 = 20 / 5x5 =25 / 5x6 = 30 / 5x7 = 35 / 5x8 = 40 / 5x9 = 45 / 5x10 = 50");
					}
		else if(str==2){
			System.out.println("Aurevoir.");
						}
		else {
			System.out.println("Ce choix n'est pas disponible, veuillez recommencer.");
			x=false;
			}
		}
		while (y==false) {
			y=true;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Voulez vous afficher 5 en symbole ? 1 = Oui / 2 = Non");
		int str2 = sc2.nextInt();
		
		if(str2==1) {
			System.out.println("Symbole 5");
		}
		else if (str2==2) {
			System.out.println("Aurevoir.");
		}
		else {	
			System.out.println("Ce choix n'est pas disponible, veuillez recommencer.");
			y=false;
		}
						}
		 
		}
		
	}
