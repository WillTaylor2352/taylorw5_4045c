package com.taylorw5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.taylorw5.dto.SpecimenDTO;
import com.taylorw5.service.ISpecimenService;

@Controller
public class IndividualProjectController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	//------------------- start mappings
	
	// this is the code for the true index mapping. Kept separate intentionally to avoid confusion when starting the application
	// 		for this assignment
	
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}

	//------------------- start page mappings
	
	// this code defines the root html file, using it as the starting point of the application
	// navigating to /start will produce the same HTML response and object data (though not necessarily the same object)
	@GetMapping("/")
	public String readStart(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	//this code is specific to the start html file, keeping it separate and duplicated from the root intentionally
	@GetMapping("/start")
	public String index(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	
	@RequestMapping(value="/start", params={"loyalty=blue"})
	public String readStartWithBlueParams() {
		return "start";
	}
	
	//show the ability to set object data at runtime, must append /start?loyalty=silver to the index URL to reach this mapping
	@RequestMapping(value="/start", params={"loyalty=silver"})
	public ModelAndView readStartWithSilverParams() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		specimenDTO.setSpecimenID(83);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	//-------------------hellothere mappings
	
	@GetMapping("/hellothere")
	public String readHelloThere() {
		return "hellothere";
	}
	@RequestMapping(value="/hellothere", method=RequestMethod.GET, headers= {"Content-Type=text/json"})
	public String readJSON() {
		return "hellothere";
	}
}
