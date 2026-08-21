package org.example.food_shop_ordering_system.service.impl;

import org.example.food_shop_ordering_system.entity.User;
import org.example.food_shop_ordering_system.repository.UserRepository;
import org.example.food_shop_ordering_system.security.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    public CustomUserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException("Không tìm thấy user: " + username));
        return new CustomUserDetails(user);
    }
}
