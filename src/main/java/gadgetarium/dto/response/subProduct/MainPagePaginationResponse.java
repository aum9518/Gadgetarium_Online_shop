package gadgetarium.dto.response.subProduct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MainPagePaginationResponse {

    private List<SubProductMainPageResponse> subProductMainPageResponses;
    private int page;
    private int pageSize;
}
