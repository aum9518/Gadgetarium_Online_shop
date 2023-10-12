package gadgetarium.dto.response.globalSearch;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminSearchResponse {

    private Long subProductId;

    private String image;

    private int articleNumber;

    private String name;

    private LocalDate createdAt;

    private int quantity;

    private BigDecimal price;

    private int sale;

    private BigDecimal currentPrice;

    private double rating;
}
