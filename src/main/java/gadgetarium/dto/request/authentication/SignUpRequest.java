package gadgetarium.dto.request.authentication;

import gadgetarium.validations.password.Password;
import gadgetarium.validations.phoneNumber.PhoneNumber;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "Name must not be empty")
    @NotNull(message = "Name must not be null")
    private String firstName;

    @NotBlank(message = "Surname must not be empty")
    @NotNull(message = "Surname must not be null")
    private String lastName;

    @PhoneNumber(message = "Wrong format phone number")
    private String phoneNumber;

    @Email(message = "Wrong format email")
    private String email;

    @Password(message = "Wrong format password")
    private String password;

}
