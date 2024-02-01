

public class Ville {

		private String nomVille;
		private String nomPays;
		private int nbreHabitants;
		private char categorie;
		private static int nbreVilles;
		
		
	/***************
	 * Constructeurs
	 */
		public Ville() {
			System.out.println("Création d'une ville !");
			this.nomVille = "Inconnu";
			this.nomPays = "Inconnu";
			this.nbreHabitants = 0;
			this.setCategorie();
			this.nbreVilles++;
		}
		
		public Ville(String nomVille, int nbreHabitants, String nomPays) {
			System.out.println("Création d'une ville avec des paramètres !");
			this.nomVille = nomVille;
			this.nomPays = nomPays;
			this.nbreHabitants = nbreHabitants;
			this.setCategorie();
			this.nbreVilles++;
		}
		
		/******************************************************************
		*****************Accesseurs / mutateurs****************************
		******************************************************************/
		
		
		
		public String getNomVille() {return this.nomVille;}
		public void setNomVille(String nomVille) {this.nomVille=nomVille;}
		
		public String getNomPays() {return this.nomPays;}
		public void setNomPays(String nomPays) {this.nomVille=nomPays;}
		
		public int getNbreHabitants() {return this.nbreHabitants;}
		public void setNbreHabitants(int nbreHabitants) {this.nbreHabitants=nbreHabitants;}

		public char getCategorie() {return this.categorie;}
		
			
		public static int getNbreVilles() {
			return nbreVilles;
		}
		
		private void setCategorie() {
			int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
			char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G','H'};
			
			int i = 0;
			while (i <bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
				i++;
			
			this.categorie = categories[i];
		}
		
		/**********************************************************
		 ************************Méthodes**************************
		 *********************************************************/
		
		public String description() {
			return this.getNomVille()+"est une ville de "+this.getNomPays()+ ", elle comporte :"+this.getNbreHabitants()+" habitants(s) elle est donc de catégorie :"+this.getCategorie();
		}
		
		public String comparer(Ville v1) {
			String str = new String();
			
			if(v1.getNbreHabitants() > this.getNbreHabitants())
				str = v1.getNomVille()+" est une ville plus peuplée que "+this.getNomVille();
			
			else
				str = this.getNomVille()+" est une ville plus peuplée que "+v1.getNomVille();
			return str;
		}
}
