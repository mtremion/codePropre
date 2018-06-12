package ex3;

import java.util.ArrayList;
import java.util.List;


public class Zone 
{
	private String nom;
	RegimeAlimentaire regimeAlimentaire;
	Classification classification;
	private List<Animal> listAnimal;
	
	
	
	public Zone()
	{
		this.nom = "Inconnu";
		this.regimeAlimentaire = null;
		this.classification = null;
		this.listAnimal = null;
	}
	
	public Zone(String pNom,String pRegimeAlimentaire, String pClassification)
	{
		this.nom = pNom;
		this.regimeAlimentaire = RegimeAlimentaire.valueOf(pRegimeAlimentaire);
		this.classification = Classification.valueOf(pClassification);
		this.listAnimal = new ArrayList<Animal>();
	}
	
	public void ajouterAnimal(Animal pAnimal)
	{
		this.listAnimal.add(pAnimal);
	}
	
	public void afficherAnimaux()
	{
		List<Animal> tempListAnimal = this.listAnimal;
		
		for(Object o : tempListAnimal)
		{
			Animal animalLu = (Animal) o;
			System.out.println(animalLu.afficherAnimal());
		}
	}
	
	public String afficherZone()
	{
		String str = this.nom + " - " + this.regimeAlimentaire + " - " + this.classification;
		return str;
	}
	
	public double poidsNourritureParJourZone(List<Animal> pListAnimal)
	{
		List<Animal> tempListAnimal = this.listAnimal;
		double kilo = 0;
		
		for(Object o : tempListAnimal)
		{
			Animal animalLu = (Animal) o;
			kilo = kilo + animalLu.poidsNourritureParJour();
		}
		return kilo;
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
	
	public List<Animal> getListAnimal() {
		return listAnimal;
	}

	public void setListAnimal(List<Animal> listAnimal) {
		this.listAnimal = listAnimal;
	}

}
