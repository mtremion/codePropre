package ex3;

public class Animal 
{
	private String nom;
	RegimeAlimentaire regimeAlimentaire;
	Classification classification;
	double poids;

	public Animal() 
	{
		this.nom = "Inconnu";
		this.regimeAlimentaire = null;
		this.classification = null;
		this.poids = 0.0;
	}
	
	public Animal(String pNom,String pRegimeAlimentaire, String pClassification, double pPoids)
	{
		this.nom = pNom;
		this.regimeAlimentaire = RegimeAlimentaire.valueOf(pRegimeAlimentaire);
		this.classification = Classification.valueOf(pClassification);
		this.poids = pPoids;
	}
	
	public double poidsNourritureParJour()
	{
		double kilo = (this.poids*5)/100;
		return kilo;
	}
	
	public String afficherAnimal()
	{
		String str = this.nom + " - " + this.poids + "kg - " + this.regimeAlimentaire + " - " + this.classification;
		return str;
	}
	
	public void setNom(String pNom)
	{
		this.nom = pNom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setRegimeAlimentaire(String pRegimeAlimentaire)
	{
		this.regimeAlimentaire = RegimeAlimentaire.valueOf(pRegimeAlimentaire);
	}
	
	public String getRegimeAlimentaire()
	{
		return this.regimeAlimentaire.getNom();
	}
	
	public void setClassification(String pClassification)
	{
		this.classification = Classification.valueOf(pClassification);
	}
	
	public String getClassification()
	{
		return this.classification.getNom();
	}
	
	public void setPoids(double pPoids)
	{
		this.poids = pPoids;
	}
	
	public double getPoids()
	{
		return this.poids;
	}

}
