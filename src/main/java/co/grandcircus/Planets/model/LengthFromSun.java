package co.grandcircus.Planets.model;

public class LengthFromSun {
	
	private int min;
	private int average;
	private int max;
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getAverage() {
		return average;
	}
	
	public void setAverage(int average) {
		this.average = average;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	@Override
	public String toString() {
		return "LengthFromSun [min=" + min + ", average=" + average + ", max=" + max + "]";
	}
}
