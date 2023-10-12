package gadgetarium.dto.response.compare;

import gadgetarium.enums.Processor;
import gadgetarium.enums.Purpose;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Getter
public class CompareLaptopResponse extends CompareProductResponse{

    private Processor processor;

    private Purpose purpose;

    private double screen_size;

    private int video_memory;

}
