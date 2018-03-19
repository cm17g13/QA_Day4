
public class Paint {

	private String name;
	private int size;
	private double cost;
	private int coverage;
	
	
	public Paint(String name, int size, double cost, int coverage) {
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.coverage = coverage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public int getCoverage() {
		return this.coverage;
	}
	
}
