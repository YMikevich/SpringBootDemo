package by.mikevich.repositories;

import by.mikevich.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
