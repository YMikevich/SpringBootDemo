package by.mikevich.controllers;

import by.mikevich.forms.UserForm;
import by.mikevich.repositories.UsersRepository;
import by.mikevich.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUp() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(UserForm userForm) {
        service.signUp(userForm);

        return "redirect:/login";
    }
}
