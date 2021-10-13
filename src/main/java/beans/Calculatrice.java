package beans;

public class Calculatrice {
	private double valeura;
	private double valeurb;
	private double resultat;
	
	public Calculatrice() {
		valeura = 0;
		valeurb = 0;
		resultat = 0;
	}
	
	public void add() {
		this.resultat = this.valeura + this.valeurb;
	}

	public double getValeura() {
		return valeura;
	}

	public void setValeura(double valeura) {
		this.valeura = valeura;
	}

	public double getValeurb() {
		return valeurb;
	}

	public void setValeurb(double valeurb) {
		this.valeurb = valeurb;
	}

	public double getResultat() {
		return resultat;
	}

	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	
	
	
	
}
