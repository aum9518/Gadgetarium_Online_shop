package gadgetarium.dto.response.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class SubCategoryResponse {

    private Long subCategoryId;

    private String title;

}
