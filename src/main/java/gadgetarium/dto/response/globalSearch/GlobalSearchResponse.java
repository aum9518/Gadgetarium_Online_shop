package gadgetarium.dto.response.globalSearch;

import gadgetarium.dto.response.brand.BrandResponse;
import gadgetarium.dto.response.category.CategoryResponse;
import gadgetarium.dto.response.subProduct.SubProductResponse;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GlobalSearchResponse {

    private List<BrandResponse> brandList;

    private List<CategoryResponse>categoryList;

    private List<SubProductResponse> subProductResponses;


}
