package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.pojo.User;
import springmvc.services.UserServices;

@Controller
public class ContactController {
	@Autowired
	private UserServices userServices;

	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("title", "Contact");
		m.addAttribute("header", "Signup Page");
		m.addAttribute("sub-title", "Do Improove your skills With Ajay Parashar!");
		return "contact";
	}

//	@RequestMapping(path = "/contactsave", method = RequestMethod.POST)
//	public String save(@RequestParam("uname") String uname, Model m) {
//		System.out.println(uname);
//		m.addAttribute("uname", uname);
//		return "success";	
//	}

	@ModelAttribute
	public void commonMessage(Model m) {
		m.addAttribute("message", "Suuccessfully registered");
		m.addAttribute("subtitle", "Do the best with Ajay Parashar");
		m.addAttribute("title", "Contact Us");
	}

	@RequestMapping(path = "/contactsave", method = RequestMethod.POST)
	public String save(@ModelAttribute User user, Model m) {
		System.out.println(user);
		userServices.create(user);
		return "success";
	}
}
