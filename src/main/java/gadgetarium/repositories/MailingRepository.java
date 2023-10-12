package gadgetarium.repositories;

import gadgetarium.models.Mailing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailingRepository extends JpaRepository<Mailing, Long> {
}