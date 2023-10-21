package gadgetarium.dto.response.subProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
public class SubProductHistoryResponse {

    private Long subProductId;

    private String image;

    private String name;

    private double rating;

    private BigDecimal price;

    @Builder
    public SubProductHistoryResponse(Long subProductId, String image, String name, double rating,
                                     BigDecimal price) {
        this.subProductId = subProductId;
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }
}
