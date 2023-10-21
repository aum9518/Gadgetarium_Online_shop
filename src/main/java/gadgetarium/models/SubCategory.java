package gadgetarium.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "sub_categories")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubCategory {

    @Id
    @GeneratedValue(generator = "sub_category_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sub_category_gen", sequenceName = "sub_category_seq", allocationSize = 1, initialValue = 15)
    private Long id;

    private String title;

    @ManyToOne(
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private Category category;

    @OneToMany(
            mappedBy = "subCategory",
            cascade = {MERGE, DETACH, REFRESH, PERSIST})
    private List<Product> products;
}

