package ex3;

public enum RegimeAlimentaire 
{
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivore"),
	INSECTIVORE("Insectivore"),
	OMNIVORE("Omnivore");
	
	private String nom;
	
	RegimeAlimentaire()
	{
		this.nom = null;
	}
	
	RegimeAlimentaire(String pNom)
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
