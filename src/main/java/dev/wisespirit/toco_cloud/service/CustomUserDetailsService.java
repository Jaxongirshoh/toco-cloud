package dev.wisespirit.toco_cloud.service;

import dev.wisespirit.toco_cloud.domains.AuthUser;
import dev.wisespirit.toco_cloud.domains.CustomUserDetails;
import dev.wisespirit.toco_cloud.repository.UserRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(@NotNull String username) throws UsernameNotFoundException {
        AuthUser authUser = userRepository.findByUsername(username).orElse(null);
        if (authUser == null) {
            throw new UsernameNotFoundException("user not found");
        }
        return new CustomUserDetails(authUser);
    }
}
