package by.mikevich.controllers;

import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    final
    UsersRepository usersRepository;

    @Autowired
    public LoginController(final UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/login")
    public String getLoginPage(final HttpServletRequest request, final ModelMap model, final Authentication authentication) {
        if(authentication != null) {
            return "redirect:/";
        }
        if(request.getParameterMap().containsKey("error")) {
            model.addAttribute("error", true);
        }
        return "login";
    }
}
