package com.springbootprojects.SCM20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("requested home");
        model.addAttribute("mod", "Hello world");
        model.addAttribute("github", "https://github.com/saifffff");
        return "home";
    }

    @RequestMapping("/about")
    public String about (Model model) {
        System.out.println("about requested");
        return "about";
    }

    @RequestMapping("/services")
    public String services (Model model) {
        System.out.println("services requested");
        return "services";
    }


}
