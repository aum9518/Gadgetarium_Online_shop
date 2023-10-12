package gadgetarium.dto.response.order;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AdminOrderSearch {

    private Long orderId;

    private String userFullName;

    private int orderNumber;

    private int quantity;

    private BigDecimal totalPrice;

    private String typeDelivery;

    private String status;
}
