package gadgetarium.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.ZonedDateTime;
import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "reviews")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Id
    @GeneratedValue(generator = "review_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "review_gen", sequenceName = "review_seq", allocationSize = 1, initialValue = 4)
    private Long id;

    private ZonedDateTime dateCreatAd;

    private String comment;

    private String replyToComment;

    private int grade;

    private String imageLink;

    private boolean isViewed;

    @ManyToOne(
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private User user;

    @ManyToOne(
            cascade = {REFRESH, PERSIST, MERGE, DETACH},
            fetch = FetchType.LAZY)
    private SubProduct subProduct;
}

