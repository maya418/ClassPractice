package com.example.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController
{
    @RequestMapping("/loadform")
    public String loadFormPage()
    {
        return "formtemplate";
    }

    @PostMapping("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model)
    {
        model.addAttribute("loginval" , login);
        return "confirm";
    }
}
