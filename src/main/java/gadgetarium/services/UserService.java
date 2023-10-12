package gadgetarium.services;


import gadgetarium.dto.request.user.UserUpdateRequest;
import gadgetarium.dto.response.order.OrderHistoryResponse;
import gadgetarium.dto.response.order.OrderInfoByUserResponse;
import gadgetarium.dto.response.user.UserFavoritesResponse;
import gadgetarium.dto.response.user.UserResponse;
import gadgetarium.dto.simple.SimpleResponse;

import java.util.List;
import java.util.Map;

public interface UserService {

    SimpleResponse userUpdate(UserUpdateRequest userUpdateRequest);

    UserResponse getUser();

    List<UserFavoritesResponse> getFavoritesByUser();

    List<OrderHistoryResponse> getOrdersByUser();

    Map<String,String> getPhoneNumber();

    OrderInfoByUserResponse getOrderInfoByUser (Long orderId);

}
