package gadgetarium.config.security;

import com.auth0.jwt.exceptions.JWTVerificationException;
import gadgetarium.models.User;
import gadgetarium.repositories.UserRepository;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.webjars.NotFoundException;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
    private final JwtService jwtService;
    private final UserRepository userRepository;

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain) throws ServletException, IOException {

        final String tokenHeader = request.getHeader("Authorization");
        if (tokenHeader != null && tokenHeader.startsWith("Bearer ")) {

            String token = tokenHeader.substring(7);
            if (StringUtils.hasText(token)) {
                try {
                    String username;
                    try {
                        username = jwtService.validateToken(token);
                    } catch (MalformedJwtException e) {
                        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
                        return;
                    } catch (ExpiredJwtException e) {
                        response.sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
                        return;
                    }

                    String finalUsername = username;
                    User user = userRepository.getUserByEmail(finalUsername)
                            .orElseThrow(() ->
                                    new NotFoundException("User with email: %s not found".formatted(finalUsername)));
                    SecurityContextHolder.getContext()
                            .setAuthentication(
                                    new UsernamePasswordAuthenticationToken(
                                            user.getUsername(),
                                            null,
                                            user.getAuthorities()
                                    ));
                } catch (JWTVerificationException e) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                            e.getMessage());
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}
