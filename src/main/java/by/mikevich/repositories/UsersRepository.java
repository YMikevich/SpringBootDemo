package by.mikevich.repositories;

import by.mikevich.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    public Optional<User> findOneByLogin(String login);
}
