package gadgetarium.services;


import gadgetarium.dto.request.review.ReviewRequest;
import gadgetarium.dto.request.review.ReviewUserRequest;
import gadgetarium.dto.request.review.ViewReviewRequest;
import gadgetarium.dto.response.review.*;
import gadgetarium.dto.simple.SimpleResponse;

public interface ReviewService {

    ReviewRatingResponse countReviewsRating(Long subProductId);

    SimpleResponse saveReview(ReviewRequest reviewRequest);

    ReviewPagination getAllReviews(Long subProductId, int pageSize, int numberPage);

    SimpleResponse deleteReview(Long reviewId);

    SimpleResponse replyToComment(Long reviewId, String answer);

    SimpleResponse updateAnswer(Long reviewId, String text);

    ReviewGradeInfo getFeedback(Long subProductId);

    ReviewUserResponse updateComment(ReviewUserRequest request);

    ReviewUserResponse deleteComment(Long reviewId);

    AdminReviewPagination getAllReviewsForAdmin(String filter, int pageSize, int pageNumber);

    ReviewsRatings getAllRatings();

    SimpleResponse updateView(ViewReviewRequest request);
}
