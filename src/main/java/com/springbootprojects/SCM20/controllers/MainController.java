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


}
