package co.grandcircus.Planets;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.Planets.model.PlanetColors;
import co.grandcircus.Planets.model.PlanetInfo;

@Controller
public class PlanetController {
	
	@Autowired
	private PlanetApiService planetService;
	
	@RequestMapping("/")
	public String listOfPlanets(Model model) {
		List<PlanetInfo> planets = planetService.planetInfoList();
		model.addAttribute("planets", planets);
		return "index";
	}

}
