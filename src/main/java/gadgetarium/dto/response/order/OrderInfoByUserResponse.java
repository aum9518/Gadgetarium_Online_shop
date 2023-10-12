package gadgetarium.dto.response.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfoByUserResponse {

    private Long orderId;

    private int orderNumber;

    private String status;

    private String client;

    private String firstName;

    private String lastName;

    private String address;

    private String phoneNumber;

    private String email;

    private LocalDate date;

    private String typePayment;

    private int totalDiscount;

    private int totalPrice;

    private List<OrderProductsInfoResponse> productsInfoResponses;
}
