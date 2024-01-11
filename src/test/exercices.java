package test;

import java.io.*;
import java.util.Scanner;

public class exercices {
    public static PrintStream output = new PrintStream(System.out);
    public static Scanner input = new Scanner(System.in);

    /*
    public static void age() {
        output.println("Votre nom ?");
        String nom = input.nextLine();

        output.println("Votre prénom ?");
        String prenom = input.nextLine();

        output.println("Votre année de naissance ?");
        int anneeNaissance = input.nextInt();

        output.println("Pour quelle année voulez-vous connaître votre âge ?");
        int annee = input.nextInt();

        output.println(prenom + " " + nom + " a " + (annee - anneeNaissance) + " ans en " + annee);
    }
    */

    public static float perimetre(float l, float L) {
        return l + l + L + L;
    }

    public static float fahrenheit(float C) {
        return C * 9 / 5 + 32;
    }
    
    public static float air(float l,float L) {
    	return l * L;
    }
    
    public static boolean estPair(int p) {
    	return p%2==0 ;
	}
    
    public static boolean  authentification(String log, String M) {
    	String login = "admin";
    	String motDePasse =	"12345";
    	return log.equals(login) && M.equals(motDePasse);
    }
    
    public static int parc(int age, int heureArriver) {
    	int tarif = (19-heureArriver)*2+6;
    	if (age < 5) {
    		return 0;
    	}else if (tarif <= 18) {
    		return tarif;
    	}else {
    		return 18;
    	}
    }
    
    public static String categorie(int age) {
    	if (age<8) {
    		return "petits poussins";
    	}else if (age<=9) {
    		return "Poussins";
    	}else if (age<=11) {
    		return "Pupilles";
    	}else if (age<=13) {
    		return "Benjamins";
    	}else if (age<=15) {
    		return "Minimes";
    	}else if (age<=17) {
    		return "Cadets";
    	}else if (age<=19) {
    		return "Juniors";
    	}else if (age<=49) {
    		return "Seniors";
    	}else if (age<=64) {
    		return "Seniors+";
    	}else  {
    		return "Vétérans";
    	}
    }
    
    public static void carresParfaits(int nombre) {
    	int carre = 0;
    	for (int i = 1 ; carre < nombre; i+=2) {
    		carre += i;
    		output.println(carre);
    	}
    }

    public static void multiplications(byte table) {
    	if (table <= 12) {
    		for (int i=0 ; i <=10; i++) {
    			output.println(table + " * " + i + " = " + (table * i));
    		}
    	}else {
    		output.println("entré un nombre entre 1 et 12");
    	}
    }
    
    
    
    public static void main(String[] args) {
        /*output.println("Entrez la température en degrés Celsius : ");
        float C = input.nextFloat();
        output.println("Température en Fahrenheit : " + fahrenheit(C));

        output.println("Entrez la longueur : ");
        float l = input.nextFloat();
        output.println("Entrez la largeur : ");
        float L = input.nextFloat();
        output.println("Le périmètre est : " + perimetre(l, L));
    
        output.println("L'air est : "+ air(l,L));
        
        int p = input.nextInt();
        output.println("le nombre est paire : "+ estPair(p));
        //age();
        
        output.println("Entrez login : ");
        String log = input.nextLine();
        output.println("Entrez le mot de passe : ");
        String M = input.nextLine();
        output.println(authentification(log, M));
        
        output.println("Entrez votre age : ");
        int age = input.nextInt();
        output.println("Entrez l'heure d'arriver : ");
        int heureArriver = input.nextInt();
        output.println(parc(age, heureArriver));
        
    	output.println("Entrez votre age : ");
        int age = input.nextInt();
        output.println(categorie(age));
    	
    	carresParfaits(100);
    	
    	output.println("entré un nombre entre 1 et 12");
    	byte nombre = input.nextByte();
    	multiplications(nombre);
    	*/
    	
    }
}
