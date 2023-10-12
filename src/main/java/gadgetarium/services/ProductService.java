package gadgetarium.services;

import gadgetarium.dto.request.product.ProductRequest;
import gadgetarium.dto.response.product.AllInformationProduct;
import gadgetarium.dto.response.product.ProductUserAndAdminResponse;
import gadgetarium.dto.simple.SimpleResponse;

import java.util.List;
import java.util.Map;

public interface ProductService {

    SimpleResponse saveProduct(ProductRequest productRequest);

    List<String> getColor(String name);

    ProductUserAndAdminResponse getByProductId(Long productId, String color);

    Map<String, String> getColorNames(List<String> codes);

    AllInformationProduct getAllProductInformation(Long subProductId);

}
