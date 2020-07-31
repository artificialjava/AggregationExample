package zooAgg;

public class Main {

	public static void main(String[] args) {
		// the vets
		Vet doolittleVet = new Vet("Dr.", "Doolittle");
		Vet janeVet = new Vet("Jane", "Smith");
		
		
		// the tourists
		Tourist annTourist = new Tourist("Ann", 700);
		Tourist tomTourist = new Tourist("Tom", 600);
		Tourist ericTourist = new Tourist("Eric", 500);
		Tourist benTourist = new Tourist("Ben", 400);
		Tourist sarahTourist = new Tourist("Sarah", 300);
		Tourist rachelTourist = new Tourist("Rachel", 200);
		Tourist johnTourist = new Tourist("John", 100);
		
		
		// the polar bears
		Animal polar1 = new Animal("Polar Bear", "jack", Zoo.Season.SPRING);
		Animal polar2 = new Animal("Polar Bear", "rose", Zoo.Season.SPRING);
		Animal polar3 = new Animal("Polar Bear", "icy", Zoo.Season.SPRING);
		
		// the alligators
		Animal alligat1 = new Animal("Alligator", "danny", Zoo.Season.WINTER);
		Animal alligat2 = new Animal("Alligator", "jimothy", Zoo.Season.WINTER);

	    Habitat pbExhibit = new Habitat(Zoo.HabitatTypes.ARCTIC, "Polar Bear");
	    	pbExhibit.addAnimal(polar1);
	    	pbExhibit.addAnimal(polar2);
	    	pbExhibit.addAnimal(polar3);
	    	
	    Habitat agExhibit = new Habitat(Zoo.HabitatTypes.TROPICAL, "Alligator");
	    	agExhibit.addAnimal(polar1);
	    	agExhibit.addAnimal(alligat1);
	    	agExhibit.addAnimal(alligat2);
	    	
	    System.out.println(agExhibit.getVetAssigned());
	    agExhibit.setVet(janeVet);
	    System.out.println(agExhibit.getVetAssigned());

	    pbExhibit.setVet(doolittleVet);
	    pbExhibit.addAnimal(polar1.mate(polar2));
	    System.out.println(pbExhibit.getCurrentHold());
	    pbExhibit.addAnimal(polar1.mate(polar3));
	    
	    annTourist.spend(20);
	    johnTourist.spend(100);
	    johnTourist.spend(1);
	    
	    pbExhibit.addTourists(tomTourist);
	    pbExhibit.addTourists(ericTourist);
	    pbExhibit.addTourists(sarahTourist);
	    pbExhibit.addTourists(johnTourist);
	    
	    agExhibit.addTourists(annTourist);
	    agExhibit.addTourists(benTourist);
	    agExhibit.addTourists(rachelTourist);
	    
	    
	    agExhibit.printStats();
	    pbExhibit.printStats();
	    
	    agExhibit.addAnimal(alligat1.mate(polar3));
    
	}
}