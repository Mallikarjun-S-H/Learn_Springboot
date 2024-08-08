package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Entity.User;
import service.UserService;

@Controller
public class Homecontroller {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String signuo() {
		return "register";
	}
	
	@RequestMapping(path= "/createuser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, Model m) {
		//m.addAttribute(user);
		System.out.println(user);
		userService.saveUser(user);
		return "success";
	}
	String packageName = Controller.class.getPackage().getName();
}
