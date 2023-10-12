package gadgetarium.dto.response.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewsRatings {

    private int five;

    private int four;

    private int three;

    private int two;

    private int one;

    private int totalReviews;
}
