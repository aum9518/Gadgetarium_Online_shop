package gadgetarium.models;

import gadgetarium.enums.Status;
import gadgetarium.enums.TypeDelivery;
import gadgetarium.enums.TypePayment;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "orders")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(generator = "order_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "order_gen", sequenceName = "order_seq", allocationSize = 1, initialValue = 6)
    private Long id;

    private int quantity;

    private int totalDiscount;

    private BigDecimal totalPrice;

    private int orderNumber;

    @Enumerated(EnumType.STRING)
    private TypeDelivery typeDelivery;

    @Enumerated(EnumType.STRING)
    private TypePayment typePayment;

    private ZonedDateTime dateOfOrder;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany(
            cascade = {MERGE, DETACH, REFRESH, PERSIST},
            fetch = FetchType.EAGER)
    private List<SubProduct> subProducts;

    @ManyToOne(
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private User user;
}

