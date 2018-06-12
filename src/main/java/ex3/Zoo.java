package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> listZone;
	
	public Zoo()
	{
		this.nom = "Inconnu";
		this.listZone = null;
	}
	
	public Zoo(String nom)
	{
		this.nom = nom;
		this.listZone = new ArrayList<Zone>();
	}
	
	public void ajouterZone(Zone pZone)
	{
		this.listZone.add(pZone);
	}
		
	public void afficherListeZone()
	{
		List<Zone> tempListZone = this.listZone;
		
		for(Object o : tempListZone)
		{
			Zone animalLu = (Zone) o;
			System.out.println(animalLu.afficherZone());
		}
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public String getNom() 
	{
		return this.nom;
	}
}
