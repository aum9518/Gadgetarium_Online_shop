package gadgetarium.services;


import gadgetarium.models.SubProduct;

import java.util.List;

public interface UtilitiesService {
    List<Long> getFavorites();

    List<Long> getComparison();

    SubProduct getSubProduct (Long subProductId);

    List<Long> getBasket();
}
