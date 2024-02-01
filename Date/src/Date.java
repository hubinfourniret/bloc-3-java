
public class Date {
	private int jours;
	private int mois;
	private int ans;
	
	
	/*****
	 * constructeur
	 */
	
	public Date() {
		this.jours = 0;
		this.mois = 0;
		this.ans = 0;
	}
	
	public Date(int jours, int mois, int ans) {
		this.jours = jours;
		this.mois = mois;
		this.ans = ans;
	}
	
	
	/***************
	 * accensseur
	 */
	public int getJours() {return this.jours;}
	public void setJours(int jours) {this.jours=jours;}
	
	public int getMois() {return this.mois;}
	public void setMois(int mois) {this.mois=mois;}
	
	public int getAns() {return this.ans;}
	public void setAns(int ans) {this.ans=ans;}
	
}
