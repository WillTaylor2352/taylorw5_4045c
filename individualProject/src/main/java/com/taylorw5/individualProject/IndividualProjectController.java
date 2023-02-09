package com.taylorw5.individualProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndividualProjectController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
