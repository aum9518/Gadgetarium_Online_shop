package gadgetarium.repositories;

import gadgetarium.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String username);
    Optional<User> getUserByEmail(String username);
}