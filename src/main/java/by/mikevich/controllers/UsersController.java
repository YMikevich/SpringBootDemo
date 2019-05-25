package by.mikevich.controllers;

import by.mikevich.models.User;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("usersFromServer", users);

        return "users";
    }
}
