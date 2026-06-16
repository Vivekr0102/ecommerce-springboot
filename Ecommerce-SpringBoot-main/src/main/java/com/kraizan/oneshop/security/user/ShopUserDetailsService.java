package com.kraizan.oneshop.security.user;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kraizan.oneshop.model.User;
import com.kraizan.oneshop.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShopUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = Optional.ofNullable(userRepository.findByEmail(email))
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with email: " + email));

        System.out.println("=================================");
        System.out.println("LOGIN EMAIL = " + email);
        System.out.println("DB EMAIL = " + user.getEmail());
        System.out.println("DB PASSWORD = " + user.getPassword());
        System.out.println("=================================");

        return ShopUserDetails.buildUserDetails(user);
    }
}