package com.springbootprojects.SCM20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("requested home");
        model.addAttribute("title", "SCM 2.0 - Home");
        return "home";
    }

    @RequestMapping("/about")
    public String about (Model model) {
        System.out.println("about requested");
        model.addAttribute("title", "SCM 2.0 - About");
        return "about";
    }

    @RequestMapping("/services")
    public String services (Model model) {
        System.out.println("services requested");
        model.addAttribute("title", "SCM 2.0 - Services");
        return "services";
    }

    @RequestMapping("/contact")
    public String contact(Model model){
        System.out.println("request contact"); 
        model.addAttribute("title", "SCM 2.0 - Contact Us");
        return "contact";
    }


    @RequestMapping("/login")
    public String login(Model model){
        System.out.println("requested login"); 
        model.addAttribute("title", "SCM 2.0 - Login");
        return "login";
    }


    @RequestMapping("/signup")
    public String signup(Model model){
        System.out.println("request signup"); 
        model.addAttribute("title", "SCM 2.0 - Sign Up");
        return "signup";
    }


}
