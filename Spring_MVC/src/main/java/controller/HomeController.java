package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/home")
	public String home(Model m) {
		m.addAttribute("name", "Suhas");

		return "home";
	}

	@RequestMapping(path = "/login")
	public String login() {

		return "login";
	}

	@RequestMapping(path = "/loginuser", method = RequestMethod.POST)
	public String loginuser(@ModelAttribute User user) {
		System.out.println(user);
		return "home";
	}

}
