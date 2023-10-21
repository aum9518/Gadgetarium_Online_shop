package gadgetarium.repositories;

import gadgetarium.models.SmartWatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartWatchRepository extends JpaRepository<SmartWatch, Long> {
}