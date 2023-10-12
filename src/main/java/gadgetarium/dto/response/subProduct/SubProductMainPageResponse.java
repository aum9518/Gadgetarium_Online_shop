package gadgetarium.dto.response.subProduct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SubProductMainPageResponse {

    private Long productId;

    private Long subProductId;

    private String name;

    private String prodName;

    private BigDecimal price;

    private String color;

    private String image;

    private int quantity;

    private double rating;

    private int discount;

    private LocalDate createdAt;

    private String subCatTitle;

    private String catTitle;

    private int countOfReviews;

    private boolean isFavorite;

    private boolean isComparison;

    private boolean inBasket;

}
