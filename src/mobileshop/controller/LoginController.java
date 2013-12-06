package mobileshop.controller;

import java.security.Principal;
import java.util.List;

import mobileshop.model.Account;
import mobileshop.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	private AccountService acc;
	
	public AccountService getAcc() {
		return acc;
	}

	public void setAcc(AccountService acc) {
		this.acc = acc;
	}

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal) {
		String name = principal.getName();
		Account temp = new Account("2","USER_ROLE","username","password");
		acc.findByAccountCode("4");
		System.out.println("Done");
		model.addAttribute("username", name);
		return "hello";
	}
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
 
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 
	}
	
	
}
