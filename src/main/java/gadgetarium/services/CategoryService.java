package gadgetarium.services;


import gadgetarium.dto.response.category.SubCategoryResponse;
import gadgetarium.models.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    List<SubCategoryResponse> getAllSubCategories(Long categoryId);
}
