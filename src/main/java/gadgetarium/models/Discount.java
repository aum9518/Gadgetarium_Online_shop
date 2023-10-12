package gadgetarium.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.ZonedDateTime;
import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "discounts")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Discount {

    @Id
    @GeneratedValue(generator = "discount_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "discount_gen", sequenceName = "discount_seq", allocationSize = 1, initialValue = 4)
    private Long id;

    private int sale;

    private ZonedDateTime startDate;

    private ZonedDateTime finishDate;

    @OneToOne(
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private SubProduct subProduct;
}

