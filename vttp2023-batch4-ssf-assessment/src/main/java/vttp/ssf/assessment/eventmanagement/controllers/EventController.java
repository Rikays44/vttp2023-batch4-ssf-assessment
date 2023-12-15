package vttp.ssf.assessment.eventmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp.ssf.assessment.eventmanagement.model.user;

@Controller
@RequestMapping("/home")
public class EventController {

	@GetMapping("/first")
	public String displayEvents(){

		return "view0";
	}
  @PostMapping("/second") 
public String register(Model model){
return "view1";
}

  
	

}
