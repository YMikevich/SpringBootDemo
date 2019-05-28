package by.mikevich.controllers;

import by.mikevich.forms.UserForm;
import by.mikevich.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SignUpController {

    private final SignUpService service;

    @Autowired
    public SignUpController(SignUpService service) {
        this.service = service;
    }

    @GetMapping("/signUp")
    public String getSignUp(final HttpServletRequest request, final ModelMap model)
    {
        if (request.getParameterMap().containsKey("error")) {
            model.addAttribute("error", true);
            return "signUp";
        }

        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(final UserForm userForm, final HttpServletRequest request, final ModelMap model) {

        if (request.getParameterMap().containsKey("error")) {
            model.addAttribute("error", true);
            return "signUp";
        }

        try {
            service.signUp(userForm);
        }
        catch (IllegalArgumentException ex) {
            return "redirect:/signUp?error";
        }

        return "redirect:/login";
    }
}
