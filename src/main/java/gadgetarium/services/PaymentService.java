package gadgetarium.services;


import com.stripe.exception.StripeException;
import gadgetarium.dto.request.payment.CreatePaymentRequest;
import gadgetarium.dto.simple.SimpleResponse;

public interface PaymentService {

    SimpleResponse chargeNewCard(CreatePaymentRequest createPaymentRequest) throws StripeException;

}
