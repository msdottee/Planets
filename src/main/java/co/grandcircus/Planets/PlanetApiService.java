package co.grandcircus.Planets;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Planets.model.PlanetInfo;

@Service
public class PlanetApiService {
	
	private RestTemplate rest = new RestTemplate();
	
	public List<PlanetInfo> planetInfoList() {
	String url = "https://grandcircusco.github.io/demo-apis/planets.json";
	PlanetInfo[] planetsArray = rest.getForObject(url, PlanetInfo[].class);
	List<PlanetInfo> planets = Arrays.asList(planetsArray);
	return planets;
	}

}
