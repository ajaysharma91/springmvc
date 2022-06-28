package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String Home(Model model) {
		model.addAttribute("name", "Ajay Sharma");
		model.addAttribute("phone", 987876880);
		List<String> names = new ArrayList<>();
		names.add("rahul");
		names.add("aman");
		names.add("Priya");
		model.addAttribute("names", names);
		return "index";
	}
}
