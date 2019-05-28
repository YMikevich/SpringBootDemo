package by.mikevich.controllers;

import by.mikevich.security.details.UserDetailsImpl;
import by.mikevich.transfer.UserDto;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static by.mikevich.transfer.UserDto.from;

@Controller
public class ProfileController {

    @GetMapping("/")
    public String getUserProfile(final Authentication auth, final Model model) {
        if(auth == null) {
            return "redirect:/login";
        }

        UserDetailsImpl userDetails = (UserDetailsImpl)auth.getPrincipal();
        UserDto user = from(userDetails.getUser());
        model.addAttribute("user", user);

        return "profile";
    }
}
