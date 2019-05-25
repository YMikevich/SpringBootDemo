package by.mikevich.bootstrap;

import by.mikevich.models.User;
import by.mikevich.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        User user = new User("Sanya", "Dodik", "sanya", "qwerty007");

        usersRepository.save(user);
    }
}
