package ex3;

public enum Classification 
{
	MAMMIFERE("Mammifere"),
	REPTILE("Reptile"),
	POISSON("Poisson");
	
	private String nom;
	
	Classification()
	{
		this.nom = null;
	}
	
	Classification(String pNom)
	{
		this.nom = pNom;
	}
	
	public void setNom(String pNom)
	{
		this.nom = pNom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
}
