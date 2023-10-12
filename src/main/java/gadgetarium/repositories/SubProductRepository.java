package gadgetarium.repositories;

import gadgetarium.models.SubProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubProductRepository extends JpaRepository<SubProduct, Long> {
}