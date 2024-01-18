package test;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class exercices {
    public static PrintStream output = new PrintStream(System.out);
    public static Scanner input = new Scanner(System.in);

    //__________________ exercice 1 _____________________________
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

    //__________________ exercice 2 _____________________________
    
    public static float fahrenheit(float C) {
        return C * 9 / 5 + 32;
    }
    
    
    //__________________ exercice 3 _____________________________
    
    public static float air(float l,float L) {
    	return l * L;
    }

    public static float perimetre(float l, float L) {
        return l + l + L + L;
    }
    
    //__________________ exercice 4 _____________________________
    
    public static boolean estPair(int p) {
    	return p%2==0 ;
	}
    
    //__________________ exercice 5 _____________________________
    
    public static boolean  authentification(String log, String M) {
    	String login = "admin";
    	String motDePasse =	"12345";
    	return log.equals(login) && M.equals(motDePasse);
    }
    
    //________________________ exercice 6 _________________________
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
    
    
    //____________________________ exercice 7 _________________
    
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
    
    //_____________________ exercice 8 ________________________________
    
    public static void carresParfaits(int nombre) {
    	int carre = 0;
    	for (int i = 1 ; carre < nombre; i+=2) {
    		carre += i;
    		output.println(carre);
    	}
    }

    //________________________ exercice 9 ___________________________
    
    public static void multiplications(byte table) {
    	if (table <= 12) {
    		for (int i=0 ; i <=10; i++) {
    			output.println(table + " * " + i + " = " + (table * i));
    		}
    	}else {
    		output.println("entré un nombre entre 1 et 12");
    	}
    }
    
    //_________________________ exercice 10 _________________________
    
    public static int factorielle(int nombre) {
    	int fact=1;
    	for (int i=2 ; i <=nombre; i++) {
    		fact*=i;
    	}
    	return fact;
    }
    
    //_____________________ exercice 11 ____________________________
    
    public static boolean estPremier(double nombre) {
        if (nombre <= 1) {
            return false;
        }
        double racineCarre = Math.sqrt(nombre);
        for (int i = 2; i <= racineCarre; i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //_________________________ exercice 12 _______________________
    
    public static String civilite() {
    	String a;
    	do {
    		output.println("Entrée F si vous êtes une femme et entrée H si vous êtes un homme");
	    	a = input.nextLine();
    	}while (!a.equals("F") && !a.equals("H"));
    	return a;
    }
    
    
    //_______________ exercice 13 ________________________________
    
    public static void deviner() {
    	int randomNumber = (int) (Math.random()*999+1);
    	int nb;
    	do {
    		output.println("Entrée un chifre entre 1 et 1000");
        	nb = input.nextInt();
        	if (nb > randomNumber) {
        		output.println("Le nombre cherché est plus petit");
        	}else if(nb < randomNumber) {
        		output.println("Le nombre cherché est plus grand");
        	}
    	}while(nb != randomNumber);
    	output.println("BRAVO, vous avez trouvé le nombre !");
    }
    
    //____________________ exercice 14 _________________________
    
    public static int[] inverser(int[] tableau) {
    	int debut = 0;
        int fin = tableau.length - 1;

        while (debut < fin) {
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;
            debut++;
            fin--;
        }
        return tableau;
    }
   //___________________ exercice 15 ___________________________
    
    public static boolean egaux(int[] tableau1, int[] tableau2) {
        if (tableau1.length != tableau2.length) {
            return false;
        }

        for (int i = 0; i < tableau1.length; i++) {
            if (tableau1[i] != tableau2[i]) {
                return false;
            }
        }
        return true;
    }

    //___________________ exercice 16 __________________________
    
        public static boolean carreMagique(int[][] tableau) {
            int n = tableau.length;

            // Vérifier si le tableau est carré
            for (int i = 0; i < n; i++) {
                if (tableau[i].length != n) {
                    return false; // Le tableau n'est pas carré
                }
            }

            // Calculer la somme de la première ligne pour utilisation ultérieure
            int sommeReference = 0;
            for (int j = 0; j < n; j++) {
                sommeReference += tableau[0][j];
            }

            // Vérifier les sommes des lignes
            for (int i = 1; i < n; i++) {
                int sommeLigne = 0;
                for (int j = 0; j < n; j++) {
                    sommeLigne += tableau[i][j];
                }
                if (sommeLigne != sommeReference) {
                    return false; // La somme des lignes n'est pas égale
                }
            }

            // Vérifier les sommes des colonnes
            for (int j = 0; j < n; j++) {
                int sommeColonne = 0;
                for (int i = 0; i < n; i++) {
                    sommeColonne += tableau[i][j];
                }
                if (sommeColonne != sommeReference) {
                    return false; // La somme des colonnes n'est pas égale
                }
            }

            // Vérifier la somme de la diagonale principale
            int sommeDiagonalePrincipale = 0;
            for (int i = 0; i < n; i++) {
                sommeDiagonalePrincipale += tableau[i][i];
            }
            if (sommeDiagonalePrincipale != sommeReference) {
                return false; // La somme de la diagonale principale n'est pas égale
            }

            // Vérifier la somme de la diagonale secondaire
            int sommeDiagonaleSecondaire = 0;
            for (int i = 0; i < n; i++) {
                sommeDiagonaleSecondaire += tableau[i][n - 1 - i];
            }
            if (sommeDiagonaleSecondaire != sommeReference) {
                return false; // La somme de la diagonale secondaire n'est pas égale
            }

            // Si toutes les conditions sont satisfaites, c'est un carré magique
            return true;
        }
        
        //__________________________ exercice 17 ______________________________
        
        public static float moyenne(float[] tableau1, float[] tableau2) {
        	float sommeNotes=0;
        	float sommeCoefs=0;
        	for (int i=0; i<tableau1.length;i++) {
        		sommeNotes += tableau1[i]*tableau2[i];
        		sommeCoefs += tableau2[i];
        	}
        	return sommeNotes/sommeCoefs;
        }
        
        //_____________________________ exercice 18 ____________________________
        
        public static float taux_concordance(String[] ADN1, String[] ADN2) {
        	int compteur = 0;
        	for (int i=0; i <ADN1.length;i++) {
        		if (ADN1[i]=="A" && ADN2[i]=="T" ) {
        			compteur++;
        		}else if (ADN1[i]=="T" && ADN2[i]=="A" ) {
        			compteur++;
        		}else if (ADN1[i]=="C" && ADN2[i]=="G" ) {
        			compteur++;
        		}else if (ADN1[i]=="G" && ADN2[i]=="C" ) {
        			compteur++;
        		}
        	}
        	return (float) compteur / ADN1.length;
        }
        
        //_______________________________ exercice 19 _________________________
        
        
        
        
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
    	
    	output.println("entré un nombre");
    	int nombre=input.nextInt();
    	output.println(factorielle(nombre));
    	
    	output.println("entré un nombre");
    	double nombre=input.nextDouble();
    	output.println(estPremier(nombre));
    	
    	deviner();
    	
    	output.println(civilite());
    	
    	int[] tableau = {1, 2, 3, 4, 5};
		tableau=inverser(tableau);
		for (int i=0;i<tableau.length;i++) {
			output.print(tableau[i]+" ");
		}
		
		int[] tableau1 = {1, 2, 3, 4, 5};
    	int[] tableau2 = {1, 2, 4, 5};
    	output.print(egaux(tableau1, tableau2));
    	
    	int[][] exempleCarreMagique = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
            };

        boolean estCarreMagique = carreMagique(exempleCarreMagique);
        System.out.println("Est un carré magique : " + estCarreMagique);
        
        float[] tableau1 = {10, 18, 18, 2, 12};
    	float[] tableau2 = {2, 2, 16, 5, 1};
    	output.print(moyenne(tableau1, tableau2));
    	
    	String[] tableau1 = {"A", "A", "T", "G", "G","C"};
    	String[] tableau2 = {"C", "T", "A", "C", "A","G"};
    	output.println(taux_concordance(tableau1, tableau2));
    	*/
    	
    	
    
    }
}
