package zooAgg;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
	
	private Zoo.HabitatTypes type;
	private String animalType;
	private int capacity;
	private int currentHold;
	private Vet vetAssigned;
	private List<Animal> animals;
	private List<Tourist> tourists;
	
	public Habitat(Zoo.HabitatTypes habType, String animalSpecies) {
		this.type = habType;
		this.animalType = animalSpecies;
		this.capacity = 4;
		this.currentHold = 0;
		
		animals = new ArrayList<Animal>();
		tourists = new ArrayList<Tourist>();

	}
	
	public String getAnimalSpec() {
		return animalType;
	}
	
	public int getCurrentHold() {
		return currentHold;
	}
	
	public String getVetAssigned() {
		if(vetAssigned == null) {
			return "no vet assigned!";
		} else {
			return vetAssigned.getName();
		}
	}
	
	public void addTourists(Tourist t) {
		if(!tourists.contains(t)) {
			tourists.add(t);
		}
	}
	
	public void removeTourist(Tourist t) {
		tourists.remove(t);
	}
	
	public void addAnimal(Animal a) {
		if(currentHold < capacity) {
		if(a.getSpecies().equals(animalType) && !animals.contains(a)) {
			currentHold++;
			animals.add(a);
			}
		} else {
			System.out.println("Cannot add, chaos would ensue");
		}
	}
	
	public void setVet(Vet v) {
		vetAssigned = v;
	}
	
	public void printStats() {
		System.out.println(type + " for " + animalType +
						  " holds " + capacity +
						  " currently holding " + currentHold);
		for(Animal a : animals) {
			System.out.println(a.getName());
		}
		for(Tourist t : tourists) {
			System.out.println(t.getName() + " is visiting the habitat");
		}
	}
	
}