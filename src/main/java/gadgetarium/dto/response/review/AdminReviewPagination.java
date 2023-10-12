package gadgetarium.dto.response.review;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Builder
public class AdminReviewPagination {

    private List<AdminAllReviews> reviews;

    private int pageSize;

    private int numberPage;

    private int count;

    public AdminReviewPagination(List<AdminAllReviews> reviews, int pageSize,
                                 int numberPage, int count) {
        this.reviews = reviews;
        this.pageSize = pageSize;
        this.numberPage = numberPage;
        this.count = count;
    }
}