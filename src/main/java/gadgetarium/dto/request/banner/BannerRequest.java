package gadgetarium.dto.request.banner;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BannerRequest {

    @NotNull(message = "Images must not be null")
    @NotEmpty(message = "Should not be empty")
    @Size(min = 1, max = 6, message = "Must contain from 1 to 6 elements")
    List<String> bannerImages;


}
