package gadgetarium.services;


import gadgetarium.dto.request.brand.BrandRequest;
import gadgetarium.dto.response.brand.BrandResponse;
import gadgetarium.dto.simple.SimpleResponse;

import java.util.List;

public interface BrandService {

    SimpleResponse saveBrand(BrandRequest brandRequest);

    List<BrandResponse> getAllBrands();

    SimpleResponse deleteById(Long id);
}
