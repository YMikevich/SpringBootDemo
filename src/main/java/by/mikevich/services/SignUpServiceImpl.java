package by.mikevich.services;

import by.mikevich.forms.UserForm;
import by.mikevich.models.Role;
import by.mikevich.models.State;
import by.mikevich.models.User;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final PasswordEncoder passwordEncoder;
    private final UsersRepository usersRepository;

    @Autowired
    public SignUpServiceImpl(final UsersRepository usersRepository, final PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void signUp(final UserForm form) {

        if (usersRepository.findOneByLogin(form.getLogin()).isPresent()) {
            throw new IllegalArgumentException();
        }

        String hashPassword = passwordEncoder.encode(form.getPassword());

        User user = new User(form.getFirstName(), form.getLastName(),
                form.getLogin(), hashPassword, Role.USER, State.ACTIVE);

        usersRepository.save(user);
    }
}