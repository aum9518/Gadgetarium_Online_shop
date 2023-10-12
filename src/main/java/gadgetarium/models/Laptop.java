package gadgetarium.models;

import static jakarta.persistence.CascadeType.*;

import gadgetarium.enums.Processor;
import gadgetarium.enums.Purpose;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "laptops")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Laptop {

    @Id
    @GeneratedValue(generator = "laptop_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "laptop_gen", sequenceName = "laptop_seq", allocationSize = 1, initialValue = 6)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Processor processor;

    @Enumerated(EnumType.STRING)
    private Purpose purpose;

    private int videoMemory;

    private double screenSize;

    @OneToOne(
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private SubProduct subProduct;
}

