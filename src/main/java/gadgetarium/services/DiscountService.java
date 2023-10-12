package gadgetarium.services;


import gadgetarium.dto.request.discount.DiscountRequest;
import gadgetarium.dto.simple.SimpleResponse;

public interface DiscountService {

    SimpleResponse saveDiscount(DiscountRequest discountRequest);

}
