package by.mikevich.controllers;

import by.mikevich.forms.LoginForm;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/login")
    public String getLoginPage(HttpServletRequest request, Model model) {
        if(request.getParameterMap().containsKey("error")) {
            model.addAttribute("error");
        }

        return "/login";
    }
}
