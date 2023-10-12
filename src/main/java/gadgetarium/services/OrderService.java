package gadgetarium.services;


import gadgetarium.dto.request.order.OrderUserRequest;
import gadgetarium.dto.response.order.*;
import gadgetarium.dto.simple.SimpleResponse;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderPaginationAdmin getAllOrderAdmin(String status, int pageSize, int pageNumber, LocalDate startDate, LocalDate endDate);

    SimpleResponse updateStatus(Long orderId, String status);

    OrderInfoResponse getOrderInfo(Long orderId);

    SimpleResponse multiDeleteOrder(List<Long> orders);

    SimpleResponse singleDelete(Long orderId);

    OrderUserResponse saveOrder (OrderUserRequest request);

    List<OrderHistoryResponse> getOrdersByUserId(Long userId);

    OrderInfoByUserResponse getOrderByUser (Long orderId, Long userId);

    OrderSearchPagination getOrderSearch (String keyword, String sortType, LocalDate startDate, LocalDate endDate, int pageSize, int pageNumber);
}
