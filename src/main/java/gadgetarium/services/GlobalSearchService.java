package gadgetarium.services;


import gadgetarium.dto.response.globalSearch.AdminMainPagination;
import gadgetarium.dto.response.globalSearch.GlobalSearchResponse;

import java.time.LocalDate;

public interface GlobalSearchService {
    GlobalSearchResponse globalSearch(String keyword);

    AdminMainPagination adminSearch (String keyword, String productType, String sortType, String filterType, LocalDate startDate, LocalDate endDate, int pageSize, int pageNumber);
}
