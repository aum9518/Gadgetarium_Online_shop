package gadgetarium.services;

import gadgetarium.dto.request.authentication.SignInRequest;
import gadgetarium.dto.request.authentication.SignUpRequest;
import gadgetarium.dto.response.authentication.AuthenticationResponse;
import gadgetarium.dto.simple.SimpleResponse;

public interface AuthenticationService {

    AuthenticationResponse signUp(SignUpRequest signUpRequest);

    AuthenticationResponse signIn(SignInRequest signInRequest);

    SimpleResponse forgotPassword(String email, String link);

    SimpleResponse resetPassword(String password, Long userId);
}
