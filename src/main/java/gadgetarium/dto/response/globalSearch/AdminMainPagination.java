package gadgetarium.dto.response.globalSearch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdminMainPagination {

    private List<AdminSearchResponse> adminSearchResponses;

    private int pageSize;

    private int pageNumber;

    private int countOfProducts;
}
