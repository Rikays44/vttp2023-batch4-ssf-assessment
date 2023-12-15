package vttp.ssf.assessment.eventmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    

    // TODO: Task 6
@GetMapping("/")
public String register(){
    return "view1";
}
    // TODO: Task 7
@PostMapping("/")
public String processRegistration(){
    return "view1";
}
}
