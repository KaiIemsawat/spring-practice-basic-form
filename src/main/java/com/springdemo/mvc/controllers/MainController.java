package com.springdemo.mvc.controllers;

import com.springdemo.mvc.entity.UserModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getFormPage(Model formModel){

        formModel.addAttribute("user", new UserModel());
        return "form";
    }

    @PostMapping("/processform")
    public String processform(@Valid @ModelAttribute("user") UserModel theUser, BindingResult results) {
        System.out.println("Binding Result : -- " + results.toString());
        if (results.hasErrors()) {
            return "form";
        }
        else return "confirmation";
    }
}
