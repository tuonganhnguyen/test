package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/")
public class GateController {
    
    public GateController() {
        System.out.println("GateController init");
    }
    
    @RequestMapping(value = "/login")
    public String login() {
        System.out.println("GateController login");
        //ModelAndView test = new ModelAndView("login");
        //return test;
        return "login";
    }

}
