package ex2;

/** Représente un compte bancaire de type compte courant
 * @author DIGINAMIC
 */
public class CompteBancaire 
{

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé */
	private double decouvert;
	
	/**
	 * @param pSolde
	 * @param pDecouvert
	 */
	public CompteBancaire(double pSolde, double pDecouvert) 
	{
		this.solde = pSolde;
		this.decouvert = pDecouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param pMontant
	 */
	public void ajouterMontant(double pMontant)
	{
		this.solde += pMontant;
	}
	
	/** Soustrait un montant au solde
	 * @param pMontant
	 */
	public void debiterMontant(double pMontant)
	{
		if (this.solde - pMontant > decouvert)
		{
			this.solde = solde - pMontant;
		}	
	}
	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() 
	{
		return this.solde;
	}
	
	/** Setter
	 * @param pSolde the solde to set
	 */
	public void setSolde(double pSolde) 
	{
		this.solde = pSolde;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() 
	{
		return this.decouvert;
	}
	
	/** Setter
	 * @param pDecouvert the decouvert to set
	 */
	public void setDecouvert(double pDecouvert) 
	{
		this.decouvert = pDecouvert;
	}
	
}
