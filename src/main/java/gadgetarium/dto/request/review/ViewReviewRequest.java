package gadgetarium.dto.request.review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewReviewRequest {

    private Long reviewId;

    private boolean view;
}
