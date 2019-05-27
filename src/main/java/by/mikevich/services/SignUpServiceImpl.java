package by.mikevich.services;

import by.mikevich.forms.UserForm;
import by.mikevich.models.Role;
import by.mikevich.models.State;
import by.mikevich.models.User;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm form) {

        String hashPassword = passwordEncoder.encode(form.getPassword());

        User user = new User(form.getFirstName(), form.getLastName(),
                form.getLogin(), hashPassword, Role.USER, State.ACTIVE);
    }
}
