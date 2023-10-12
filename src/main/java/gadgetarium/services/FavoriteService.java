package gadgetarium.services;


import gadgetarium.dto.response.subProduct.SubProductResponse;
import gadgetarium.dto.response.user.UserFavoritesResponse;
import gadgetarium.dto.simple.SimpleResponse;

import java.util.List;

public interface FavoriteService {

    SimpleResponse addAndDeleteFavorite(Long subProductId);

    SimpleResponse addSubProductsToFavorite(List<Long> subProductIds);

    SimpleResponse clearFavorite();

    List<SubProductResponse> getAllFavorite();

    List<UserFavoritesResponse> getAllFavoriteByUserId(Long userId);


}
