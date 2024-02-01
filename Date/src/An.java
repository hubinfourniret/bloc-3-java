import java.io.PrintStream;
import java.util.Scanner;

public class An {
	
	public static PrintStream output = new PrintStream(System.out);
    public static Scanner input = new Scanner(System.in);
	
    public static boolean estBissextile(int annee) {
    	return (annee%4==0 && annee%100!=0)||(annee%400==0 && annee%4000!=0);
    }
    
    public static int nbJourAnne(int annee) {
    	return estBissextile(annee)?366:365;
    }
    public static int[] nbJoursMois(String mois) {
    	
    }
}
