package gadgetarium.dto.request.mailing;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MailingRequest {
    private String title;

    private String description;

    private String image;

    private LocalDate startDate;

    private LocalDate finishDate;
}
