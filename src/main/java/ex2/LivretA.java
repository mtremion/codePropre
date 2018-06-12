package ex2;

/**
 * @author mtremion
 *
 * Représente un Livret A, qui hérite de la classe compte bancaire
 */
public class LivretA extends CompteBancaire 
{
	
	/**
	 * doucouvertMin : double
	 */
	private static double decouvertMin = 0;
	
	/**
	 * tauxRemuneration : double
	 */
	private double tauxRemuneration;

	/**
	 * @param pSolde
	 * @param pTauxRemuneration
	 */
	public LivretA(double pSolde, double pTauxRemuneration) 
	{
		super(pSolde, decouvertMin);
		this.tauxRemuneration = pTauxRemuneration;
	}
	
	/**
	 * Applique la rémnunération annuelle selon le taux
	 */
	public void appliquerRemuAnnuelle()
	{
		double newSolde;
		newSolde = this.getSolde() + this.getSolde()*tauxRemuneration/100;
		this.setSolde(newSolde);
	}
	
	/** 
	 * Soustrait un montant au solde
	 */
	public void debiterMontant(double pMontant)
	{
		if (super.getSolde() - pMontant > decouvertMin)
		{
			double newSolde = this.getSolde() - pMontant;
			this.setSolde(newSolde);
		}	
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() 
	{
		return this.tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double pTauxRemuneration) 
	{
		this.tauxRemuneration = pTauxRemuneration;
	}
	
	/** Getter for decouvertMin
	 * @return the decouvertMin
	 */
	public double getDecouvertMin() 
	{
		return this.decouvertMin;
	}
	
	/** Setter
	 * @param pDecouvertMin the decouvertMin to set
	 */
	public void setDecouvertMin(double pDecouvertMin) 
	{
		this.decouvertMin = pDecouvertMin;
	}
	
	
	

}
