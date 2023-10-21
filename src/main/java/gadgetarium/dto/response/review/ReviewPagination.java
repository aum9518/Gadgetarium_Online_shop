package gadgetarium.dto.response.review;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Builder
public class ReviewPagination {

    private List<ReviewResponse> responseList;

    private int pageSize;

    private int numberPage;

    public ReviewPagination(List<ReviewResponse> responseList, int pageSize,
                            int numberPage) {
        this.responseList = responseList;
        this.pageSize = pageSize;
        this.numberPage = numberPage;
    }

}
