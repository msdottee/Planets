package co.grandcircus.Planets.model;

public class PlanetColors {

	private String colors;

	public PlanetColors(String colors) {
		super();
		this.colors = colors;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "PlanetColors [colors=" + colors + "]";
	}
	
}
