package zooAgg;

public class Tourist {

	private String name;
	private int budget;
	
	public Tourist (String name, int money) {
		this.name = name;
		this.budget = money;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return budget;
	}
	
	public void spend(int cost) {
		if(budget - cost >= 0) {
		budget = budget - cost;
		} else {
			System.out.println("Not enough money!");
		}
	}
	
}
