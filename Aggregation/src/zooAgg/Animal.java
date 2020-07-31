package zooAgg;

public class Animal {

	private String animalSpecies;
	private String animalName;
	private Zoo.Season matingSeason;
	
	public Animal (String species, String name, Zoo.Season mateSeason) {
		this.animalSpecies = species;
		this.animalName = name;
		this.matingSeason = mateSeason;
	}
	
	public String getName() {
		return animalName;
	}
	
	public String getSpecies() {
		return animalSpecies;
	}
	
	public Animal mate(Animal mate2) {
		if(!animalSpecies.equals(mate2.getSpecies())) {
			throw new IllegalArgumentException("Invalid Species, cannot mate!");
		} else {
			char initial1 = animalName.charAt(0);
			char initial2 = mate2.getName().charAt(0);
			
			return new Animal(animalSpecies, "baby " + initial1 + initial2, matingSeason);
		}
	}
}