package gadgetarium.dto.request.order;

import gadgetarium.enums.TypeDelivery;
import gadgetarium.enums.TypePayment;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderUserRequest {

    private TypeDelivery typeDelivery;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String address;

    private TypePayment typePayment;

    private List<Long> subProductIds;
}
