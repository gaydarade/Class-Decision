
public class Backpack {
	private String color;
	public String getColor() { return color; }
	public void setColor(String c) { color = c; }
	
	private String brand;
	public String getBrand() { return brand; }
	public void setBrand(String b) { brand = b; }
	
	private int numPockets;
	public int getNumPockets() { return numPockets; }
	public void setNumPockets(int np) { numPockets = np; }
	
	private double weightLimit;
	public double getWeightLimit() { return weightLimit; }
	public void setWeightLimit(double w) { weightLimit = w; }
	
	private double rating;
	public double getRating() { return rating; }
	public void setRating(double r) { rating = r; }
	
	private double cost;
	public double getCost() { return cost; }
	public void setCost(double c) { cost = c; }
	
	/**
	 * This function checks the private cost variable if the cost is greater than or equal to ( >= ) 30.00
	 * it will return true
	 * @return Returns true if the cost is $30.00 or over
	 */
	public boolean isExpensive() {
		// if (condition) { body }	else if (condition) { body } else { body }
		
		if (cost >= 30) {
			return true;
		}
		else {
			return false;
		}
		
		/* 	alternate of above version. When an if statement only executes one line in the body, 
		   	the { } block can be omitted. More than one line in the body the { } is required. 
			-------------------------------------------------------------------------------------
			if (cost >= 30)
				return true;
			else 
				return false;
		 */
		
	}
}
