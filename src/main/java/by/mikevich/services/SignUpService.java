package by.mikevich.services;

import by.mikevich.forms.UserForm;
import org.springframework.stereotype.Service;

public interface SignUpService {
    void signUp(UserForm form);
}
