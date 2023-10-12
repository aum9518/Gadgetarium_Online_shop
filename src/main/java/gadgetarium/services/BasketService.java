package gadgetarium.services;

import gadgetarium.dto.response.basket.BasketInfographicResponse;
import gadgetarium.dto.simple.SimpleResponse;

import java.util.List;

public interface BasketService {

    SimpleResponse saveBasket(Long subProductId);

    BasketInfographicResponse getAllByProductsFromTheBasket();

    SimpleResponse deleteProductByIds(List<Long> subProductIds);

    SimpleResponse deleteProductById(Long supProductId);

    SimpleResponse addSubProductForBasket(Long subProductId, int quantity);

}
