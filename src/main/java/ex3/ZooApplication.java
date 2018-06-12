package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooApplication 
{
	

	public static void main(String[] args) 
	{
		/*List<Zoo> listZoo = new ArrayList<Zoo>();
		String nomZoo = "";
		String nomZone= "";
		String nomRegime ="";
		String nomClasse ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******************************************************");
		System.out.println("************* Bienvenue dans TesZooCity ! *************");
		System.out.println("*******************************************************");
		System.out.println("\nPour commencer, que dirais tu de construire un Zoo ?");
		
		System.out.println("Pour créer ton Zoo, il te faut nom ! Comment souhaite tu l'appeller ?");
		nomZoo = sc.nextLine();
		listZoo.add(new Zoo(nomZoo));
		
		System.out.println("\nHmmm, le zoo de "+nomZoo+", ça me plait !");
		sc.nextLine();

		System.out.println("Maintenant, créons une première zone d'habitation pour tes animaux !");
		System.out.println("Quel est l'intitulé de ta zone ?");
		nomZone = sc.nextLine();
		
		sc.nextLine();
		System.out.println("Quel est le regime alimentaire des animaux qui seront présent ? "
							+ "Herbivore/Carnivore/Insectivore/Omnivore");	
		nomRegime = sc.nextLine().toUpperCase();
		
		sc.nextLine();
		System.out.println("De quelle classe seront tes animaux ? Mammifere/Poisson/Reptile");
		nomClasse = sc.nextLine().toUpperCase();
		
		sc.nextLine();
		
		listZoo.getIndex(nomZoo).ajouterZone(new Zone(nomZone,nomRegime,nomClasse));*/
		
		
		Zoo zoo = new Zoo("Thoiry");
		
		Zone Aquarium = new Zone("Aquarium","HERBIVORE","POISSON");		
		Zone zoneCarnivore = new Zone("ZoneCarnivore","CARNIVORE","MAMMIFERE");	
		Zone serreReptile = new Zone("SerreReptile","CARNIVORE","REPTILE");	
		Zone savane = new Zone("Savane","HERBIVORE","MAMMIFERE");	
		
		List<Zone>listZone = new ArrayList();
		listZone.add(Aquarium);
		listZone.add(zoneCarnivore);
		listZone.add(serreReptile);
		listZone.add(savane);
		
		for(Object o : listZone)
		{
			Zone zoneLu = (Zone) o;
			zoo.ajouterZone(zoneLu);
		}
		
		Animal lion = new Animal("Lion","CARNIVORE","MAMMIFERE",90.0);
		Animal zebre = new Animal("Zèbre","HERBIVORE","MAMMIFERE",80.0);
		Animal gazelle = new Animal("Gazelle","HERBIVORE","MAMMIFERE",60.0);
		Animal panthere = new Animal("Panthère","CARNIVORE","MAMMIFERE",75.0);
		Animal requinBlanc = new Animal("Requin blanc","CARNIVORE","POISSON",100.0);
		Animal truite = new Animal("Truite","HERBIVORE","POISSON",2.0);
		Animal boa = new Animal("Boa","CARNIVORE","REPTILE",45.0);
		Animal python = new Animal("Python","CARNIVORE","REPTILE",55.0);
		
		List<Animal>listAnimal = new ArrayList<Animal>();
		listAnimal.add(lion);
		listAnimal.add(zebre);
		listAnimal.add(gazelle);
		listAnimal.add(panthere);
		listAnimal.add(requinBlanc);
		listAnimal.add(truite);
		listAnimal.add(boa);
		listAnimal.add(python);
		
		for(Object o : listZone)
		{
			Zone zoneLu = (Zone) o;
			for(Object x : listAnimal)
			{
				Animal animalLu = (Animal) x;
				
				if(zoneLu.getRegimeAlimentaire().equals(animalLu.getRegimeAlimentaire()))
				{
					if(zoneLu.getClassification().equals(animalLu.getClassification()))
					{
						zoneLu.ajouterAnimal(animalLu);
					}
				}
			}
		}
		
		for(Object o : listZone)
		{
			Zone zoneLu = (Zone) o;
			System.out.println(zoneLu.afficherZone());
			zoneLu.afficherAnimaux();
			System.out.println(zoneLu.poidsNourritureParJourZone(zoneLu.getListAnimal()));
		}
		
		
		
	}

}
