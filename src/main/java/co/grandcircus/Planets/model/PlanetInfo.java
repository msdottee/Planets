package co.grandcircus.Planets.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetInfo {
	
	private String name;
	private List<String> colors;
	@JsonProperty("million-miles-from-sun")
	private LengthFromSun million_miles_from_sun;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getColors() {
		return colors;
	}
	
	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public LengthFromSun getMillion_miles_from_sun() {
		return million_miles_from_sun;
	}

	public void setMillion_miles_from_sun(LengthFromSun million_miles_from_sun) {
		this.million_miles_from_sun = million_miles_from_sun;
	}

	@Override
	public String toString() {
		return "PlanetInfo [name=" + name + ", colors=" + colors + ", million_miles_from_sun=" + million_miles_from_sun
				+ "]";
	}
}
