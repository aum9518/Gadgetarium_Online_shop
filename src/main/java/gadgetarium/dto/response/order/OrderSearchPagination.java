package gadgetarium.dto.response.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderSearchPagination {

    private List<AdminOrderSearch> adminOrderSearches;

    private int pageSize;

    private int pageNumber;

    private int countOfProducts;
}