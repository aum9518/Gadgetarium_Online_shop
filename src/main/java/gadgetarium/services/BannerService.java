package gadgetarium.services;

import gadgetarium.dto.request.banner.BannerRequest;
import gadgetarium.dto.simple.SimpleResponse;
import gadgetarium.models.Banner;

import java.util.List;

public interface BannerService {
    SimpleResponse saveBanners(BannerRequest bannerRequest);


    List<Banner> getAllBanner();
}
