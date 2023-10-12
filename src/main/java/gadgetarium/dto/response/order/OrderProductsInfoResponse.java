package gadgetarium.dto.response.order;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderProductsInfoResponse {

    private Long subProductId;

    private String productName;

    private double rating;

    private int reviewsCount;

    private BigDecimal price;

    private String image;
}
