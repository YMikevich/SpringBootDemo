package by.mikevich.services;

import by.mikevich.forms.UserForm;
import by.mikevich.models.Role;
import by.mikevich.models.State;
import by.mikevich.models.User;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void signUp(UserForm form) {

        usersRepository.save(new User(form.getFirstName(), form.getLastName(), form.getLogin(),
                form.getPassWord(), Role.USER, State.ACTIVE));
    }
}
