package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	//return type ModelAndView
	public ModelAndView home(Model m) {
		
		//controller to view
		
		//Create object of ModelAndView
		ModelAndView mod=new ModelAndView();
		//set data in object
		mod.addObject("username", "Hw");
		
		//m.addAttribute("username", "Mitaoe");
		//set view name
		mod.setViewName("index");
		//return ModelAndView Object 
		return mod;
		
		
	}
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
	
	
	@RequestMapping("/checking")
	public String login(@RequestParam ("username") String uname,
			@RequestParam ("password") String pwd,Model mod) {
		String error=null;
		mod.addAttribute("username", uname);
		if(uname.equals("Uddhav") && pwd.equals("542")) {
			return "success";
		}
		else {
			 error="please enter correct details";
			mod.addAttribute("msg", error);
			return "register";
		}
		
	}
}
//RequestParam is used to transfer data from view to controller

