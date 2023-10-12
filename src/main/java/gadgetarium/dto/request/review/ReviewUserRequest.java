package gadgetarium.dto.request.review;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewUserRequest {

    private Long reviewId;

    private String comment;

    private int grade;

    private String imageLink;

}
